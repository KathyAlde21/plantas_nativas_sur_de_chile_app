package com.example.plantasnativassurchile.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.plantasnativassurchile.data.PlantsRepository
import com.example.plantasnativassurchile.ui.screens.PlantDetailScreen
import com.example.plantasnativassurchile.ui.screens.PlantListScreen
import kotlinx.serialization.Serializable

@Serializable
object PlantListDestination

@Serializable
data class PlantDetailDestination(val plantId: Int)

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = PlantListDestination
    ) {
        composable<PlantListDestination> {
            PlantListScreen(
                onPlantClick = { plant ->
                    navController.navigate(
                        PlantDetailDestination(plantId = plant.id)
                    )
                }
            )
        }

        composable<PlantDetailDestination> { backStackEntry ->
            val args = backStackEntry.toRoute<PlantDetailDestination>()
            val plant = PlantsRepository.getPlantById(args.plantId)

            // Por seguridad: si no se encuentra, volvemos atrás
            if (plant == null) {
                navController.popBackStack()
            } else {
                PlantDetailScreen(
                    plant = plant,
                    onBack = { navController.popBackStack() }
                )
            }
        }
    }
}