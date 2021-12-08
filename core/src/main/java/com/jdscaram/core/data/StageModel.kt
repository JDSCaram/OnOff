package com.jdscaram.core.data

import kotlinx.serialization.Serializable

@Serializable
data class StagesModel(
    val stages: List<StageModel>
)

@Serializable
data class StageModel(
    val stage: Int,
    val time: Int,
    val rules: List<Int>,
    val switchRules: List<SwitchRules>
)

@Serializable
data class SwitchRules(
    val state: Boolean
)
