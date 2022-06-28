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
    //Select queries do ot require suspend functions
  @Query("SELECT * FROM result ")
    fun getResults(): Flow<List<ConversionResult>>




}