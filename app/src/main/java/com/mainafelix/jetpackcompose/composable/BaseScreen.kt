//package com.mainafelix.jetpackcompose.composable
//
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.collectAsState
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import androidx.lifecycle.viewmodel.compose.viewModel
//import com.mainafelix.jetpackcompose.data.ConverterViewModel
//import com.mainafelix.jetpackcompose.data.VewModelFactory
//
////composable functions start with a capital Letter
////you should not pass vewmodel intances to the compasable ,only the data
//@Composable
//fun BaseScreen(
//    factory: VewModelFactory,
//    modifier: Modifier =Modifier,
//    //passing the viewModel as the parameter
//    converterViewModel: ConverterViewModel = viewModel(factory= factory)
//){
//    var  list  = converterViewModel.getConversion()
//    val historyList = converterViewModel.resultList.collectAsState(initial = emptyList() )
//    Column(modifier = modifier.padding(10.dp)) {
//        TopScreen(list){message1,message2 ->
//            converterViewModel.addResult(message1,message2)
//        }
//
//        Spacer(modifier =modifier.height(10.dp) )
//        HistoryScreen(historyList,{item ->
//            converterViewModel.removeReult(item)
//        },
//        {
//           converterViewModel.clearAll()
//        })
//
//    }
//}
