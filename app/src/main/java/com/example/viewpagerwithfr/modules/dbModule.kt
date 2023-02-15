package com.example.viewpagerwithfr.modules

import android.content.Context
import androidx.room.Room
import com.example.viewpagerwithfr.room.HistoryDataBase
import org.koin.dsl.module

val dbModule = module {
    single { provideDB(get()) }

}

fun provideDB(applicationContext: Context) : HistoryDataBase {
    return Room.databaseBuilder(
        applicationContext,
        HistoryDataBase::class.java,
        "DB"
    ).allowMainThreadQueries().build()
}
