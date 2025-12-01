package com.example.plantasnativassurchile.data

import com.example.plantasnativassurchile.R

object PlantsRepository {

    val plants = listOf(
        Plant(
            id = 1,
            commonName = "Chilco",
            scientificName = "Fuchsia magellanica",
            imageRes = R.drawable.chilco
        ),
        Plant(
            id = 2,
            commonName = "Coligue",
            scientificName = "Chusquea culeou",
            imageRes = R.drawable.coligue
        ),
        Plant(
            id = 3,
            commonName = "Maqui",
            scientificName = "Aristotelia chilensis",
            imageRes = R.drawable.maqui
        ),
        Plant(
            id = 4,
            commonName = "Meli",
            scientificName = "Amomyrtus meli",
            imageRes = R.drawable.meli
        ),
        Plant(
            id = 5,
            commonName = "Murta",
            scientificName = "Ugni molinae",
            imageRes = R.drawable.murta
        ),
        Plant(
            id = 6,
            commonName = "Nalca",
            scientificName = "Gunnera tinctoria",
            imageRes = R.drawable.nalca
        ),
        Plant(
            id = 7,
            commonName = "Quila",
            scientificName = "Chusquea quila",
            imageRes = R.drawable.quila
        ),
        Plant(
            id = 8,
            commonName = "Sauco",
            scientificName = "Sambucus nigra",
            imageRes = R.drawable.sauco
        )
    )
}