package com.example.viewpagerwithfr.room

import androidx.room.Insert
import androidx.room.Query
import com.example.viewpagerwithfr.model.CountModel

@androidx.room.Dao
interface Dao {
    @Query("SELECT * FROM countmodel")
    fun getAllHistory(): List<CountModel>

    @Insert
    fun insertToHistory(model: CountModel)
}