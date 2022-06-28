package com.mainafelix.jetpackcompose.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [ConversionResult::class], exportSchema = false, version = 1)
abstract class ConverterDatabase: RoomDatabase() {
    @Volatile
    private var  INSTANCE :ConverterDatabase? = null
    fun getInstance(context: Context):ConverterDatabase{
        synchronized(this){
         var instance = INSTANCE
            if (instance== null){
            instance= Room.databaseBuilder(
                    context.applicationContext,
                    ConverterDatabase::class.java,
                    "result_database"
            ).build()
        }
        return instance
        }
    }
}