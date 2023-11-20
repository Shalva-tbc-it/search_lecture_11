package com.example.search.search

import com.example.search.R
import java.util.UUID

data class Animals (
    val id: UUID = UUID.randomUUID(),
    val imageUrl: String,
    val title: String,
    val desc: Int
)