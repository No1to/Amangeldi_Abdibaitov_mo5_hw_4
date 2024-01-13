package com.example.amangeldi_abdibaitov_mo5_hw_4.ui.onboarding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.amangeldi_abdibaitov_mo5_hw_4.R
import com.example.amangeldi_abdibaitov_mo5_hw_4.databinding.ItemOnboardingBinding
import com.example.amangeldi_abdibaitov_mo5_hw_4.model.OnBoarding

class OnBoardingAdapter(private val onClick: () -> Unit) :
    RecyclerView.Adapter<OnBoardingAdapter.OnBoardingViewHolder>() {

    private val list = arrayListOf<OnBoarding>(
        OnBoarding(
            R.raw.ob_animation_1,
            "1",
            "11"
        ),
        OnBoarding(
            R.raw.ob_animation_2,
            "2",
            "22"
        ),
        OnBoarding(
            R.raw.ob_animation_3,
            "3",
            "33"
        ),
        OnBoarding(
            R.raw.ob_animation_4,
            "4",
            "44"
        )
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingViewHolder {
        return OnBoardingViewHolder(
            ItemOnboardingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: OnBoardingViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount() = list.size

    inner class OnBoardingViewHolder(private val binding: ItemOnboardingBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(boarding: OnBoarding) {
            binding.apply {
                binding.tvTitle.text = boarding.title
                binding.tvDescription.text = boarding.description
                boarding.animation?.let { binding.animationView.setAnimation(it) }
//                Glide.with(binding.imgV.context).load(boarding.image).into(binding.imgV)
                binding.btnStart.isVisible = adapterPosition == list.lastIndex
                binding.tvSkip.isVisible = adapterPosition != list.lastIndex
                binding.tvSkip.setOnClickListener { onClick() }
                binding.btnStart.setOnClickListener { onClick() }
            }
        }
    }
}