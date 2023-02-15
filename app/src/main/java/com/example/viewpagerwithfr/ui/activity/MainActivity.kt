package com.example.viewpagerwithfr.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerwithfr.R
import com.example.viewpagerwithfr.ui.fragments.FirstFragment
import com.example.viewpagerwithfr.ui.fragments.SecondFragment
import com.example.viewpagerwithfr.ui.fragments.ThirdFragment
import com.example.viewpagerwithfr.ui.fragments.adapter.CounterAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager = findViewById<ViewPager2>(R.id.pagerOnBoard)


        val fragments: ArrayList<Fragment> = arrayListOf(FirstFragment(), SecondFragment(), ThirdFragment())

        val adapter = CounterAdapter(fragments, this)
        viewPager.adapter = adapter


    }
}