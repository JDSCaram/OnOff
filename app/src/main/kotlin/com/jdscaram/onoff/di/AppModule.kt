package com.jdscaram.onoff.di

import com.jdscaram.core.DispatcherProvider
import com.jdscaram.core.DispatcherProviderImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class AppModule {

    @Binds
    abstract fun bindsDispatcherProvider(
        dispatcher: DispatcherProviderImpl
    ) : DispatcherProvider
}