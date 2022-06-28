package com.mainafelix.jetpackcompose.data

import android.os.Message
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName ="result" )
data class ConversionResult(
    @PrimaryKey (autoGenerate = true) val id:Int, val message1 :String, val message2:String)
