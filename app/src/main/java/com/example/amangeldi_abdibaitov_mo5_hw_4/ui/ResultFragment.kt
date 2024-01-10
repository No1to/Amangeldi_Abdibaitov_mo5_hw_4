package com.example.amangeldi_abdibaitov_mo5_hw_4.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.amangeldi_abdibaitov_mo5_hw_4.App
import com.example.amangeldi_abdibaitov_mo5_hw_4.LoveViewModel
import com.example.amangeldi_abdibaitov_mo5_hw_4.R
import com.example.amangeldi_abdibaitov_mo5_hw_4.databinding.FragmentResultBinding

class ResultFragment : Fragment(R.layout.fragment_result) {

    private lateinit var binding: FragmentResultBinding
    private val viewModel: LoveViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentResultBinding.bind(view)

        val fname = arguments?.getString("fname").toString()
        val sname = arguments?.getString("sname").toString()

        viewModel.getLoveLiveData(fname, sname).observe(
            requireActivity(), Observer {
                binding.result.text = it.toString()
                App.appDatabase.getDao().insert(it)
            }
        )
    }
}