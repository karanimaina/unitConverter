//package com.mainafelix.jetpackcompose.composable
//
//import android.util.Log
//import androidx.compose.runtime.*
//import com.mainafelix.jetpackcompose.data.ConversionMenu
//import java.math.RoundingMode
//import java.text.DecimalFormat
//
//@Composable
//fun TopScreen(list: List<Conversion>,
//save:(String,String)-> Unit) {
//// the TopScreen composable function  will hold other 3 composable function
//  val selectedConversion:MutableState<Conversion?> = remember { mutableStateOf(null) }
//   val inputText:MutableState<String> =  remember { mutableStateOf("")}
//    val typedValue = remember {mutableStateOf("0.0")}
//    ConversionMenu(list = list){
//        selectedConversion.value = it
//        typedValue.value= "0.0"
//    }
//    selectedConversion.value?.let {
//       InputBlock(conversion = it, InputText = inputText){inputText ->
//           Log.i("Tag","user typed $inputText")
//           typedValue.value = inputText
//       }
//    }
//    if (typedValue.value != "0.0"){
//        val input = typedValue.value.toDouble()
//        val multiply = selectedConversion.value!!.multiplyBy
//        val result = input * multiply
//        // round to 4 decimal places
//        val  df = DecimalFormat ("#.####")
//        //rouding down runds torwards  0
//        df.roundingMode = RoundingMode.DOWN
//        val  roundingResult = df.format(result)
//        val message1 = "${typedValue.value}  ${selectedConversion.value!!.convertFrom}"
//        val message2 ="$roundingResult ${selectedConversion.value!!.convertTo}"
//         save(message1,message2)
//        ResultBlock(message1 = message1, message2 =message2 )
//    }
//}