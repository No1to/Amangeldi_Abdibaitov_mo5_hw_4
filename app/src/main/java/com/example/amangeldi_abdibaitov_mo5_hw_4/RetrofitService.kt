package com.example.amangeldi_abdibaitov_mo5_hw_4

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
    val retrofit = Retrofit.Builder().baseUrl("https://love-calculator.p.rapidapi.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()

    val loveAPI = retrofit.create(LoveAPI::class.java)

}