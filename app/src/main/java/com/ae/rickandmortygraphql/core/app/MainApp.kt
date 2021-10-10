package com.ae.rickandmortygraphql.core.app

import android.app.Application
import com.ae.rickandmortygraphql.core.di.module.apiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApp: Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() = startKoin {
        androidContext(this@MainApp)
        modules(apiModule)
    }
}