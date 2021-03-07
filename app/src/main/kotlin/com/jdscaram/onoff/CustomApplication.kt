package com.jdscaram.onoff

import android.app.Application
import com.jdscaram.home.di.homeKoinModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

open class CustomApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@CustomApplication)
            androidLogger()
            modules(
                homeKoinModules
            )
        }
    }
}