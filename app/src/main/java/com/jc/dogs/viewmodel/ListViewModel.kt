package com.jc.dogs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jc.dogs.model.DogBreed

class ListViewModel : ViewModel() {

    val dogs = MutableLiveData<List<DogBreed>>()
    val dogsLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        val dog1 = DogBreed("1", "Corgi", "15", "breedGroup", "bredFor", "temperament", "")
        val dog2 = DogBreed("2", "Labrador", "10", "breedGroup", "bredFor", "temperament", "")
        val dog3 = DogBreed("3", "Rotwailer", "12", "breedGroup", "bredFor", "temperament", "")
        val doglist = arrayListOf(dog1, dog2, dog3)

        dogs.value = doglist
        dogsLoadError.value = false
        loading.value = false
    }
}