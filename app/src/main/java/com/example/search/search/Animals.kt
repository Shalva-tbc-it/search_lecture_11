package com.example.search.search

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.UUID


@Parcelize
data class Animals (
    val id: UUID = UUID.randomUUID(),
    val imageUrl: String,
    val title: String,
    val desc: Int
) : Parcelable