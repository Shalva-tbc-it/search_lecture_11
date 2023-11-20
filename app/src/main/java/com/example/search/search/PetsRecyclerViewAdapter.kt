package com.example.search.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.search.R
import com.example.search.databinding.RecyclerviewPetsBinding
import com.squareup.picasso.Picasso
import java.util.Locale

class PetsRecyclerViewAdapter(val listener: (Animals) -> Unit) :
    ListAdapter<Animals, PetsRecyclerViewAdapter.PetsViewHolder>(object :
        DiffUtil.ItemCallback<Animals>() {
        override fun areItemsTheSame(oldItem: Animals, newItem: Animals): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Animals, newItem: Animals): Boolean {
            return oldItem == newItem
        }
    }) {

    private var originalList: List<Animals> = emptyList()
    fun setData(animals: MutableList<Animals>) {
        originalList = animals
        submitList(animals)
    }

    fun filter(query: String) {
        val lowercaseQuery = query.lowercase(Locale.getDefault())
        val filteredList = originalList.filter {
            it.title.lowercase(Locale.getDefault()).contains(lowercaseQuery)
        }
        submitList(filteredList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetsViewHolder {
        return PetsViewHolder(
            RecyclerviewPetsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PetsViewHolder, position: Int) {
        holder.bind()
    }

    inner class PetsViewHolder(private val binding: RecyclerviewPetsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind() {
            val pets = currentList[adapterPosition]
            Picasso.get()
                .load(pets.imageUrl)
                .placeholder(R.drawable.loading)
                .error(R.drawable.error)
                .into(binding.imgRcPets)

            binding.root.setOnClickListener {
                listener(pets)
            }
        }
    }
}