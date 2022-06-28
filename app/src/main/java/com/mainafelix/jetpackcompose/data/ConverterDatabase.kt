package com.mainafelix.jetpackcompose.data
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities =[ConversionResult::class], version = 1, exportSchema = true)
abstract  class ConverterDatabase : RoomDatabase(){

    abstract  val converterDao: ConverterDao

    companion object{

        @Volatile
        private var INSTANCE: ConverterDatabase?= null
        fun getInstance(context: Context): ConverterDatabase {
            return  INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ConverterDatabase::class.java,
                    "convert_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }

        }

          }
