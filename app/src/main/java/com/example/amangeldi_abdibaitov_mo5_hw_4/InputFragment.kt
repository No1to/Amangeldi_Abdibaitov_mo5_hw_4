package com.example.amangeldi_abdibaitov_mo5_hw_4

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.amangeldi_abdibaitov_mo5_hw_4.databinding.FragmentInputBinding

class InputFragment : Fragment(R.layout.fragment_input) {

    private lateinit var binding: FragmentInputBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInputBinding.bind(view)

        binding.submit.setOnClickListener {
            val bundle = Bundle().apply {
                putString("fname", binding.edYourName.text.toString())
                putString("sname", binding.edPartnerName.text.toString())
            }
            findNavController().navigate(R.id.action_inputFragment_to_resultFragment, bundle)
        }
    }
}