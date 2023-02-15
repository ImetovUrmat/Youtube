package com.example.viewpagerwithfr.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.viewpagerwithfr.model.CountModel

@Database(entities = [CountModel::class], version = 1)
abstract class HistoryDataBase: RoomDatabase() {
    abstract fun historyDao(): Dao
}