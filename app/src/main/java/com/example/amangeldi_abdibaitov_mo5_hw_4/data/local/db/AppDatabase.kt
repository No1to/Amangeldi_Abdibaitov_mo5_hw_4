package com.example.amangeldi_abdibaitov_mo5_hw_4.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.amangeldi_abdibaitov_mo5_hw_4.model.LoveModel

@Database(entities = [LoveModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getDao(): LoveDao
}