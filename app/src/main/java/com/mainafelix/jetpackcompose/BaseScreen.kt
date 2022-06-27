package com.mainafelix.jetpackcompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
}
