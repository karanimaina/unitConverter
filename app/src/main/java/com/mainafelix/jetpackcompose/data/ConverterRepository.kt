package com.mainafelix.jetpackcompose.data

import kotlinx.coroutines.flow.Flow

interface ConverterRepository {
    suspend fun insertResult(result: ConversionResult)
    suspend fun deleteResult(result: ConversionResult)
    suspend fun deleteAllResults(result: ConversionResult)
    fun getSavedResults(): Flow<List<ConversionResult>>
}