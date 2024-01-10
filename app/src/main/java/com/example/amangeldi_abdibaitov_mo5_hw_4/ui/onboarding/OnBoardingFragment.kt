package com.example.amangeldi_abdibaitov_mo5_hw_4.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.amangeldi_abdibaitov_mo5_hw_4.R
import com.example.amangeldi_abdibaitov_mo5_hw_4.data.local.Pref
import com.example.amangeldi_abdibaitov_mo5_hw_4.databinding.FragmentOnBoardingBinding
import com.example.amangeldi_abdibaitov_mo5_hw_4.ui.onboarding.adapter.OnBoardingAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OnBoardingFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardingBinding
    private val adapter = OnBoardingAdapter(this::onClick)

    @Inject
    lateinit var pref: Pref

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardingBinding.inflate(inflater, null, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewPager.adapter = adapter
        binding.wormDotsIndicator.attachTo(binding.viewPager)

    }

    private fun onClick() {
        pref.onBoardingShow()
        findNavController().navigateUp()
    }
}