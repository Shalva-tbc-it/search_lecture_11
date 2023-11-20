package com.example.search.fragments

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.search.R
import com.example.search.databinding.FragmentPetInfoBinding
import com.example.search.search.Animals
import com.squareup.picasso.Picasso

class PetInfoFragment : Fragment() {

    private var _binding: FragmentPetInfoBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentPetInfoBinding.inflate(inflater, container, false)
        return _binding!!.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getPetInfo()

    }

    private fun getPetInfo() {
        val data = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            arguments?.getParcelable("pet", Animals::class.java)
        } else {

            arguments?.getParcelable("pet")
        }

        data?.let {
            Picasso.get()
                .load(it.imageUrl)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .into(binding.imgInfo)

            binding.tvTitle.text = it.title
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}