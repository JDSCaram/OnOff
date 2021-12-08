package com.jdscaram.menu.di

import com.jdscaram.core.datasource.MenuLocalDataSource
import com.jdscaram.core.repository.MenuRepository
import com.jdscaram.menu.data.MenuLocalDataSourceImpl
import com.jdscaram.menu.data.MenuRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
abstract class MenuModule {

    @Binds
    abstract fun bindsMenuRepository(menuRepository: MenuRepositoryImpl) : MenuRepository

    @Binds
    abstract fun bindsMenuLocalDataSourceModule(
        menuLocalDataSourceImpl: MenuLocalDataSourceImpl
    ): MenuLocalDataSource
}