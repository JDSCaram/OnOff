package com.jdscaram.menu.data

import com.jdscaram.core.DispatcherProvider
import com.jdscaram.core.data.StagesModel
import com.jdscaram.core.datasource.MenuLocalDataSource
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.Exception
import javax.inject.Inject

private const val LOCAL_STAGES = "stages.json"
private const val JSON_EMPTY = "{}"

class MenuLocalDataSourceImpl @Inject constructor(
    private val dispatcher: DispatcherProvider
) : MenuLocalDataSource {

    override suspend fun loadStagesFromLocalResource() = withContext(dispatcher.io()) {
        try {
            val stages = Json.decodeFromString<StagesModel>(
                readFile(LOCAL_STAGES) ?: JSON_EMPTY
            )
            Result.success(stages)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    private fun readFile(path: String) = readFile(path.split("/"))

    private fun readFile(dirs: List<String>): String? = javaClass.classLoader
        ?.getResource(dirs.joinToString(File.separator))
        ?.path?.let { fileName ->
            val file = File(fileName)
            val inStream = InputStreamReader(FileInputStream(file) as InputStream)
            return inStream.readLines().joinToString("\n")
        }
}
