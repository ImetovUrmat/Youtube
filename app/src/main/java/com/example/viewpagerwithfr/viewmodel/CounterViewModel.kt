package com.example.viewpagerwithfr.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap

class CounterViewModel(private val repo: Repository): ViewModel() {

    private var count = MutableLiveData<Int>()


    val counting = count.switchMap {
        repo.counting(it)
    }


    fun increment(countt: Int) {
        count.postValue(countt)
    }

}