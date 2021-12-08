package com.jdscaram.menu.data

import com.jdscaram.core.DispatcherProvider
import com.jdscaram.core.datasource.MenuLocalDataSource
import com.jdscaram.core.repository.MenuRepository
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MenuRepositoryImpl @Inject constructor(
    private val dispatcher: DispatcherProvider,
    private val menuLocalDataSource: MenuLocalDataSource
) : MenuRepository {

    override suspend fun loadStages() = withContext(dispatcher.io()) {
        val result = menuLocalDataSource.loadStagesFromLocalResource().getOrThrow()
        Result.success(result.stages)
    }
}