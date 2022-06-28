package com.mainafelix.jetpackcompose

import androidx.lifecycle.ViewModelProvider
import com.mainafelix.jetpackcompose.data.ConverterRepository

class VewModelFactory(private val  repository:ConverterRepository):ViewModelProvider.NewInstanceFactory(){
}