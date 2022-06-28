package com.mainafelix.jetpackcompose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mainafelix.jetpackcompose.data.ConverterRepository

class VewModelFactory(private val  repository:ConverterRepository):ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel> create(modelClass: Class<T>): T =ConverterViewModel(repository) as T

}