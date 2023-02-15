package com.example.viewpagerwithfr.modules

import com.example.viewpagerwithfr.viewmodel.CounterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModel = module {
    viewModel { CounterViewModel(get()) }
}