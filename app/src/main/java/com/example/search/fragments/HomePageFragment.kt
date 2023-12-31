package com.example.search.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.search.R
import com.example.search.databinding.FragmentHomePageBinding
import com.example.search.search.AddPets
import com.example.search.search.PetsRecyclerViewAdapter

class HomePageFragment : Fragment() {

    private lateinit var adapter: PetsRecyclerViewAdapter
    private val addPets = AddPets()
    private val animalList = addPets.sendDataToDataClass()

    private var _binding: FragmentHomePageBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomePageBinding.inflate(inflater, container, false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerViewInit()
        listener()
    }

    private fun recyclerViewInit() = with(binding) {

        adapter = PetsRecyclerViewAdapter( listener = {

            requireActivity().supportFragmentManager.
            setFragmentResult("requestKey", bundleOf("bundleKey" to it))

            parentFragmentManager
                .beginTransaction()
                .replace(R.id.container, PetInfoFragment())
                .addToBackStack("Info")
                .commit()
        })
        rcPets.layoutManager = GridLayoutManager(context, 3)
        rcPets.adapter = adapter
        adapter.setData(animalList.toMutableList())

    }

    private fun listener() = with(binding){

        edSearch.addTextChangedListener {
            adapter.filter(it.toString())
            if (it.isNullOrEmpty()) {
                tvResult.text = getString(R.string.all_result)
            }else {
                tvResult.text = "RESULT: $it"
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}