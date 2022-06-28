package com.mainafelix.jetpackcompose.composable


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import com.mainafelix.jetpackcompose.data.ConversionResult

@Composable
fun HistoryList(
    list: State<List<ConversionResult>>,
     onCloseTask :(ConversionResult) -> Unit,
    modifier: Modifier= Modifier

){
    LazyColumn(modifier.fillMaxWidth()){
        items(
            items = list.value, key = {item ->item.id  }
        ){
            item ->
            HistoryItem(message1 = item.message1, message2 =item.message2, onClose = {onCloseTask(item)} )
        }
    }

}