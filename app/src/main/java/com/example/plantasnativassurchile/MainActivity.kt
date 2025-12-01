package com.example.plantasnativassurchile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.plantasnativassurchile.ui.screens.PlantListScreen
import com.example.plantasnativassurchile.ui.theme.PlantasNativasSurChileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlantasNativasSurChileTheme {   // 👈 usa el mismo nombre
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PlantListScreen()
                }
            }
        }
    }
}