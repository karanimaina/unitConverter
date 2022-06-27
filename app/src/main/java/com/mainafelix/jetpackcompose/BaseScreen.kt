package com.mainafelix.jetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

//composable functions start with a capital Letter
//you should not pass vewmodel intances to the compasable ,only the data
@Composable
fun BaseScreen(
    modifier: Modifier =Modifier,
    //passing the viewModel as the parameter
    converterViewModel: ConverterViewModel = viewModel()
){
    var  list  = converterViewModel.getConversion()
    Column(modifier = modifier.padding(10.dp)) {
        TopScreen()
        Spacer(modifier =modifier.height(10.dp) )
        HistoryScreen()
        
    }
}
