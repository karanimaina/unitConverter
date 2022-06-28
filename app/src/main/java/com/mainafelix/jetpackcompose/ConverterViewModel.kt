package com.mainafelix.jetpackcompose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mainafelix.jetpackcompose.composable.Conversion
import com.mainafelix.jetpackcompose.data.ConversionResult
import com.mainafelix.jetpackcompose.data.ConverterRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ConverterViewModel(private val  repository: ConverterRepository):ViewModel() {
    fun getConversion() = listOf(
        Conversion(1,"pounds to kilogram","lbs","kg",0.453592),
        Conversion(2,"kilograms to pounds","kg","lbs",2.20462),
        Conversion(3,"yards to metres","yd","n",0.9144),
        Conversion(4,"metres to yards","m","yd",1.09361),
        Conversion(5,"miles to kilometres","mi" ,"km",1.60934),
        Conversion(6,"kilograms to miles","km","mi",8.521371)
        )
    fun getResult(message1:String,message2: String){
        //larger apps re quire the dispatcher.IO thread to run database operations
        viewModelScope.launch (Dispatchers.IO){
            repository.insertResult( ConversionResult(0,message1,message2))
        }
    }
}