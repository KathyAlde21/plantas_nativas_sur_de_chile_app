package com.example.plantasnativassurchile.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.plantasnativassurchile.data.PlantsRepository
import com.example.plantasnativassurchile.ui.components.PlantCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlantListScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Plantas nativas de Chile") }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.surfaceVariant)
                .padding(16.dp),
            contentPadding = innerPadding,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(
                items = PlantsRepository.plants,
                key = { it.id }
            ) { plant ->
                PlantCard(plant = plant)
            }
        }
    }
}