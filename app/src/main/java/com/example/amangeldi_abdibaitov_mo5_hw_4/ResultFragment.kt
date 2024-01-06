package com.example.amangeldi_abdibaitov_mo5_hw_4

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.amangeldi_abdibaitov_mo5_hw_4.databinding.FragmentResultBinding

class ResultFragment : Fragment(R.layout.fragment_result) {

    private lateinit var binding: FragmentResultBinding
//    private lateinit var viewModel: LoveViewModel

    companion object {
        const val YOUR_NAME_ARG = "your_name"
        const val PARTNER_NAME_ARG = "partner_name"
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentResultBinding.bind(view)
//        viewModel = (activity as MainActivity).viewModel

        val yourName = arguments?.getString(YOUR_NAME_ARG)
        val partnerName = arguments?.getString(PARTNER_NAME_ARG)

        binding.percentage.text = yourName
        binding.result.text = partnerName
        /*viewModel.resultLiveData.observe(viewLifecycleOwner) { response ->
            binding.percentage.text = response.percentage + " %"
            binding.result.text = response.result

        }*/
    }
}