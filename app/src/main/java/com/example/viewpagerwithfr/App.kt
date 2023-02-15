package com.example.viewpagerwithfr

import android.app.Application
import androidx.room.Room
import com.example.viewpagerwithfr.modules.dbModule
import com.example.viewpagerwithfr.modules.repoModule
import com.example.viewpagerwithfr.modules.viewModel
import com.example.viewpagerwithfr.room.HistoryDataBase
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    companion object{
        lateinit var db: HistoryDataBase

    }
    override fun onCreate() {
        super.onCreate()
        db = Room.databaseBuilder(
            applicationContext,
            HistoryDataBase::class.java,
            "Db").allowMainThreadQueries().build()


        startKoin{
            androidContext(this@App)
            modules(viewModel, repoModule, dbModule)
        }


    }
}