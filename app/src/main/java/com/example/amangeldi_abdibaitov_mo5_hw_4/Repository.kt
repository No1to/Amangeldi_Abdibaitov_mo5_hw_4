package com.example.amangeldi_abdibaitov_mo5_hw_4

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.amangeldi_abdibaitov_mo5_hw_4.model.LoveModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {
    private val api = RetrofitService().loveAPI

    fun getData(firstName: String, secondName: String): MutableLiveData<LoveModel> {
        val mutableLiveData = MutableLiveData<LoveModel>()
        api.getLovePerc(firstName, secondName).enqueue(object : Callback<LoveModel> {
            override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        mutableLiveData.postValue(it)
                    }
                }
            }
            override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                Log.e("asd", "onFailure: ${t.message}")
            }
        })
        return mutableLiveData
    }
}