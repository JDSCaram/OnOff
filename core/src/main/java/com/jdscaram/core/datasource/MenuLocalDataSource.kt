package com.jdscaram.core.datasource

import com.jdscaram.core.data.StagesModel

interface MenuLocalDataSource {
    suspend fun loadStagesFromLocalResource(): Result<StagesModel>
}
