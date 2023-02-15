package com.example.viewpagerwithfr.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CountModel(
    @PrimaryKey(autoGenerate = true)
    var id : Int?  = null,
    val count: String,
)
