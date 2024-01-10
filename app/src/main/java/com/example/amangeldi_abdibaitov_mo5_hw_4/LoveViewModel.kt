package com.example.amangeldi_abdibaitov_mo5_hw_4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoveViewModel : ViewModel() {
    private val repository = Repository()
//    val resultLiveData = MutableLiveData<LoveModel>()

    fun getLoveLiveData(firstName: String, secondName: String): LiveData<LoveModel> {
        return repository.getData(firstName, secondName)
    }
}