package com.example.viewpagerwithfr.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpagerwithfr.App
import com.example.viewpagerwithfr.databinding.FragmentFirstBinding
import com.example.viewpagerwithfr.model.CountModel
import com.example.viewpagerwithfr.viewmodel.CounterViewModel
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class FirstFragment: Fragment() {
    private var num = 0
    private lateinit var binding: FragmentFirstBinding
    private val viewModel: CounterViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnPlus.setOnClickListener {
            num++
            viewModel.increment(num)
            App.db.historyDao().insertToHistory(CountModel(count = "[$num] : +"))
        }
        binding.btnMinus.setOnClickListener {
            num--
            viewModel.increment(num)
            App.db.historyDao().insertToHistory(CountModel(count = "[$num] : -"))
        }


    }


}