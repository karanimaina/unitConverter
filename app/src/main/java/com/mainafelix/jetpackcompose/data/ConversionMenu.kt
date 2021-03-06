package com.mainafelix.jetpackcompose.data

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import com.mainafelix.jetpackcompose.composable.Conversion

@Composable
fun ConversionMenu(list: List<Conversion>, modifier: Modifier = Modifier, convert :(Conversion)-> Unit){
    // define the states
    var displayText by remember { mutableStateOf("Select the conversion type")}
    var textFieldSize by remember { mutableStateOf(Size.Zero)} //To assign dropdown the same width as the TextField
    var expanded by remember { mutableStateOf(false)}
    val icon = if(expanded) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown
    OutlinedTextField(value = displayText, onValueChange = {displayText = it}, textStyle = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
        modifier = Modifier
            .fillMaxWidth()
            .onGloballyPositioned { cooordinate ->
                textFieldSize = cooordinate.size.toSize()
            },
    label ={
        Text(text ="conversion Type" )
    },
    trailingIcon = {
        Icon(icon , contentDescription ="icon" ,
        modifier.clickable {  expanded = !expanded})
    },
    readOnly = true
    )
DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }, modifier = modifier.width(
 with(LocalDensity.current){textFieldSize.width.toDp()})) {
    list.forEach{conversion ->
        DropdownMenuItem(onClick = { displayText = conversion.description
            expanded = false
        convert(conversion)}) {
            Text(text = conversion.description, fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }
    }

}

        


}