package com.mainafelix.jetpackcompose.composable

import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mainafelix.jetpackcompose.data.ConversionResult
import java.util.*

@Composable
fun HistoryScreen(list:State<List<ConversionResult>>,
                  onCloseTask: (ConversionResult) ->Unit,
                  onClearAll:() ->Unit,
                  modifier: Modifier= Modifier,


){

  Column {
      if ((list.value).isNotEmpty()){

      Row(modifier= modifier
          .fillMaxWidth()
          .padding(10.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
          Text(text = "history",color= Color.Gray)
          OutlinedButton(onClick = {onClearAll()}) {
             Text(text = "Clear all", color = Color.Gray)

          }}

      }
      HistoryList(list = list,
          onCloseTask = { item ->
              onCloseTask(item)
          })
  }

}