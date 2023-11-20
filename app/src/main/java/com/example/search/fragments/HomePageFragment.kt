package com.example.search.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.search.R
import com.example.search.databinding.FragmentHomePageBinding
import com.example.search.search.AddPets
import com.example.search.search.Animals
import com.example.search.search.PetsRecyclerViewAdapter

class HomePageFragment : Fragment() {

    private lateinit var adapter: PetsRecyclerViewAdapter
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

    }

    private fun recyclerViewInit() = with(binding) {
        val addPets = AddPets()
        val animalList = addPets.sendDataToDataClass()

        adapter = PetsRecyclerViewAdapter()
        rcPets.layoutManager = GridLayoutManager(context, 3)
        rcPets.adapter = PetsRecyclerViewAdapter().apply {
            submitList(animalList)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}