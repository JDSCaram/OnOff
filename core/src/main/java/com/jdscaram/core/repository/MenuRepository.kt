package com.jdscaram.core.repository

import com.jdscaram.core.data.StageModel

interface MenuRepository {
    suspend fun loadStages():  Result<List<StageModel>>
}