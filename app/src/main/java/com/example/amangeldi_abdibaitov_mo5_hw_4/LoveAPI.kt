package com.example.amangeldi_abdibaitov_mo5_hw_4

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveAPI {
    @GET("getPercentage")
    fun getLovePerc(
        @Query("fname") firstName: String,
        @Query("sname") secondName: String,
        @Header("X-RapidAPI-Key") key: String = "3a9c4198e8msh337cac11a1b8d1ep1f2624jsn5a17be532fda",
        @Header("X-RapidAPI-Host") host: String = "love-calculator.p.rapidapi.com"
    ): Call<LoveModel>
}