package com.example.amangeldi_abdibaitov_mo5_hw_4.data.local.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.amangeldi_abdibaitov_mo5_hw_4.model.LoveModel

@Dao
interface LoveDao {
    @Query("SELECT * FROM `love-table` ORDER BY firstName ASC")
    fun getAll(): List<LoveModel>

    @Insert
    fun insert(model: LoveModel)

    /*  @Delete
        fun delete(user: User)*/
}