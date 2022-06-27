package com.mainafelix.jetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun  InputBlock(
    conversion: Conversion,
    InputText: MutableState<String>,
    modifier: Modifier
){
//Column(modifier = modifier.padding(0.dp,20.dp,0.dp,0.dp)){
    Row(modifier = modifier.fillMaxWidth()) {
        TextField(value = InputText.value, onValueChange ={
            InputText.value= it
        }, modifier = modifier.fillMaxWidth(0.65F),
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.None,
            autoCorrect = true,
            keyboardType = KeyboardType.Number
        ),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = MaterialTheme.colors.surface.copy(alpha=0.3F)
        ),
            textStyle = TextStyle(color = Color.DarkGray,fontSize= 30.sp)
        )
        Text(text = conversion.convertFrom,
            fontSize=24.sp,
        modifier = modifier.padding(10.dp,30.dp,0.dp,0.dp) .fillMaxWidth(0.35F)
        )
    }
}

}
