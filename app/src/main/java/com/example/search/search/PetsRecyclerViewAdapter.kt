package com.example.search.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.search.R
import com.example.search.databinding.RecyclerviewPetsBinding
import com.squareup.picasso.Picasso

class PetsRecyclerViewAdapter: ListAdapter<Animals, PetsRecyclerViewAdapter.PetsViewHolder>( object :
    DiffUtil.ItemCallback<Animals>() {
    override fun areItemsTheSame(oldItem: Animals, newItem: Animals): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Animals, newItem: Animals): Boolean {
        return oldItem == newItem
    }
}) {

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
    inner class PetsViewHolder(private val binding: RecyclerviewPetsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val pets = currentList[adapterPosition]
            
            Picasso.get()
                .load(pets.imageUrl)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .into(binding.imgRcPets)
        }
    }
}