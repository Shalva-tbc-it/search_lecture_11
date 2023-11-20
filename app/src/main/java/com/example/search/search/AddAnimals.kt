package com.example.search.search

import com.example.search.R

abstract class AddAnimals {
    abstract fun createAnimalList(): List<Animals>

    fun sendDataToDataClass(): List<Animals> {
        return createAnimalList()
    }
}


class AddPets : AddAnimals() {

    private val desc = R.string.desc
    override fun createAnimalList(): List<Animals> {
        return listOf(
            Animals(
                imageUrl = "https://images.pexels.com/photos/247502/pexels-photo-247502.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Lion",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/208984/pexels-photo-208984.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Cat",
                desc = desc
            ),
            Animals(
                imageUrl = "https://img.kwcdn.com/product/Fancyalgo/VirtualModelMatting/75f127ce59e2f48be7d8e8e90bea0166.jpg?imageView2/2/w/800/q/70/format/webp",
                title = "Cat",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/5146801/pexels-photo-5146801.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Zebra",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/11760865/pexels-photo-11760865.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Zebra",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/5857330/pexels-photo-5857330.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Bird",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/669015/pexels-photo-669015.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Cat",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/1526402/pexels-photo-1526402.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Bird",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/792416/pexels-photo-792416.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Bird",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/41178/africa-animal-big-carnivore-41178.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Lion",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/2255564/pexels-photo-2255564.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Cat",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/41315/africa-african-animal-cat-41315.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Lion",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/1490908/pexels-photo-1490908.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Dog",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/1108099/pexels-photo-1108099.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Dog",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/59523/pexels-photo-59523.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Dog",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/1851164/pexels-photo-1851164.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Dog",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/17811/pexels-photo.jpg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Bird",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/797681/pexels-photo-797681.png?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Zebra",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/5146774/pexels-photo-5146774.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Zebra",
                desc = desc
            ),
            Animals(
                imageUrl = "https://images.pexels.com/photos/45201/kitty-cat-kitten-pet-45201.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Cat",
                desc = desc
            ),

            Animals(
                imageUrl = "https://images.pexels.com/photos/2194261/pexels-photo-2194261.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
                title = "Cat",
                desc = desc
            )
        )
    }
}