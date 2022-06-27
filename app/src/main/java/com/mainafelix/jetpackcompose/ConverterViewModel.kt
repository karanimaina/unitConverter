package com.mainafelix.jetpackcompose

import androidx.lifecycle.ViewModel

class ConverterViewModel:ViewModel() {
    fun getConversion() = listOf(
        Conversion(1,"pounds to kilogram","lbs","kg",0.453592),
        Conversion(2,"kilograms to pounds","kg","lbs",2.20462),
        Conversion(3,"yards to metres","yd","n",0.9144),
        Conversion(4,"metres to yards","m","yd",1.09361),
        Conversion(5,"miles to kilometres","mi" ,"km",1.60934),
        Conversion(6,"kilograms to miles","km","mi",8.521371)
        )
}