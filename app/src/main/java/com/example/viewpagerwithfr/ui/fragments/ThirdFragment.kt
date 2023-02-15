package com.example.viewpagerwithfr.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpagerwithfr.App
import com.example.viewpagerwithfr.databinding.FragmentThirdBinding
import com.example.viewpagerwithfr.ui.fragments.adapter.HistoryAdapter

class ThirdFragment : Fragment() {
    private lateinit var adapter: HistoryAdapter
    private lateinit var binding:FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = HistoryAdapter()
        adapter.submitList(App.db.historyDao().getAllHistory())
        binding.rvHistory.adapter = adapter




    }
}