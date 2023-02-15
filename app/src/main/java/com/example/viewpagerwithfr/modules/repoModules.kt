package com.example.viewpagerwithfr.modules

import com.example.viewpagerwithfr.viewmodel.Repository
import org.koin.dsl.module

val repoModule = module {
    single { Repository() }
}