package com.example.plantasnativassurchile.data

import androidx.annotation.DrawableRes

data class Plant(
    val id: Int,
    val commonName: String,
    val scientificName: String,
    @DrawableRes val imageRes: Int,
    val description: String
)