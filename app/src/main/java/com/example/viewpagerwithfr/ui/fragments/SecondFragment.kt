package com.example.viewpagerwithfr.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpagerwithfr.databinding.FragmentSecondBinding
import com.example.viewpagerwithfr.viewmodel.CounterViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class SecondFragment : Fragment() {
    private val viewModel: CounterViewModel by sharedViewModel()

    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.counting.observe(viewLifecycleOwner){
            binding.tvResult.text = it.toString()
        }

    }
}