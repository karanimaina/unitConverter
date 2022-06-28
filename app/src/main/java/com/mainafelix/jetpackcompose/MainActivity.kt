package com.mainafelix.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.mainafelix.jetpackcompose.composable.BaseScreen
import com.mainafelix.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
               Surface(modifier = Modifier.fillMaxWidth(),
               color = MaterialTheme.colors.background) {
                   BaseScreen()
                }

              


            }
        }
    }
}