package com.example.amangeldi_abdibaitov_mo5_hw_4

import com.google.gson.annotations.SerializedName

data class LoveModel(
    @SerializedName("firstName")
    val fname: String,
    @SerializedName("secondName")
    val sname: String,
    val percentage: String,
    val result: String,
)
