package com.example.amangeldi_abdibaitov_mo5_hw_4.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "love-table")
data class LoveModel(
    @SerializedName("fname")
    val firstName: String,
    @SerializedName("sname")
    val secondName: String,
    val percentage: String,
    val result: String,
    @PrimaryKey(autoGenerate = true)
    val uid: Int = 0
) {
    override fun toString(): String {
        return "$uid\n$firstName\n$secondName\n$percentage%\n$result\n\n"
    }
}
