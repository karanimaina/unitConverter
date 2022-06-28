package com.mainafelix.jetpackcompose.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
class VewModelFactory(private val  repository:ConverterRepository):ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel> create(modelClass: Class<T>): T  = ConverterViewModel(repository) as T



}