package com.example.amangeldi_abdibaitov_mo5_hw_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.amangeldi_abdibaitov_mo5_hw_4.databinding.FragmentInputBinding

class InputFragment : Fragment(R.layout.fragment_input) {

    private lateinit var binding: FragmentInputBinding
    private lateinit var viewModel: LoveViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInputBinding.bind(view)
        viewModel = (activity as MainActivity).viewModel

        binding.submit.setOnClickListener {
            viewModel.getLoveLiveData(
                binding.edYourName.text.toString(),
                binding.edPartnerName.text.toString()
            )
            findNavController().navigate(R.id.action_inputFragment_to_resultFragment)
        }
    }
}