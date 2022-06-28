package com.mainafelix.jetpackcompose

import androidx.compose.runtime.*

@Composable
fun TopScreen(list: List<Conversion>) {
// the TopScreen composable function  will hold other 3 composable function
 val selectedConversion:MutableState<Conversion?> = remember { mutableStateOf(null) }
   val inputText:MutableState<String> =  remember { mutableStateOf("")}
    
    ConversionMenu(list = list){
        selectedConversion.value = it
    }
    selectedConversion.value?.let { 
        InputBlock(conversion = it, InputText = inputText )
    }
}