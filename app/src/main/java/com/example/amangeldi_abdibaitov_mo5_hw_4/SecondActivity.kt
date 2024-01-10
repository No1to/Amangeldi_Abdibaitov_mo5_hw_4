package com.example.amangeldi_abdibaitov_mo5_hw_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.amangeldi_abdibaitov_mo5_hw_4.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = App.appDatabase.getDao().getAll()

        list.forEach{
            binding.tvHistory.append("$it")
        }
    }
}