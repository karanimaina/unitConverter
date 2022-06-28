package com.mainafelix.jetpackcompose.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface ConverterDao {
    @Insert
    suspend fun insertResult(result: ConversionResult)
    @Delete
    suspend fun deleteResult(result:ConversionResult)
    @Query("DELETE FROM result")
    suspend fun deleteAll()
    fun getResults(): Flow<List<ConversionResult>>


}