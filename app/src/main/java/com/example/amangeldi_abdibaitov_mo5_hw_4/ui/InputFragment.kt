package com.example.amangeldi_abdibaitov_mo5_hw_4.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.amangeldi_abdibaitov_mo5_hw_4.App
import com.example.amangeldi_abdibaitov_mo5_hw_4.R
import com.example.amangeldi_abdibaitov_mo5_hw_4.SecondActivity
import com.example.amangeldi_abdibaitov_mo5_hw_4.data.local.db.AppDatabase
import com.example.amangeldi_abdibaitov_mo5_hw_4.databinding.FragmentInputBinding

class InputFragment : Fragment(R.layout.fragment_input) {

    private lateinit var binding: FragmentInputBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInputBinding.bind(view)

        initListener()
    }

    private fun initListener() {
        binding.apply {
            btnHistory.setOnClickListener {
                startActivity(Intent(requireContext(), SecondActivity::class.java))
            }
            btnSubmit.setOnClickListener {
                val bundle = Bundle().apply {
                    putString("fname", edYourName.text.toString())
                    putString("sname", edPartnerName.text.toString())
                }
                findNavController().navigate(R.id.action_inputFragment_to_resultFragment, bundle)
            }
        }
    }
}