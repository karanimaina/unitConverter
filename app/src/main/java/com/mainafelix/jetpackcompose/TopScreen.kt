package com.mainafelix.jetpackcompose

import androidx.compose.runtime.Composable

@Composable
fun TopScreen(list: List<Conversion>) {
// the TopScreen composable function  will hold other 3 composable function
ConversionMenu(list = list)
}