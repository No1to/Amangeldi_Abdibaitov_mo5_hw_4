package com.example.amangeldi_abdibaitov_mo5_hw_4

import android.app.Application
import androidx.room.Room
import com.example.amangeldi_abdibaitov_mo5_hw_4.data.local.db.AppDatabase
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {
    companion object {
        lateinit var appDatabase: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        appDatabase = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "love-file"
        ).allowMainThreadQueries().build()
    }
}