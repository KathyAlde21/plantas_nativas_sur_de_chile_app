package com.example.plantasnativassurchile.data

import com.example.plantasnativassurchile.R

object PlantsRepository {

    val plants = listOf(
        Plant(
            id = 1,
            commonName = "Chilco",
            scientificName = "Fuchsia magellanica",
            imageRes = R.drawable.chilco,
            description =
                "Arbusto siempreverde de 1 a 2 metros de altura con flores colgantes " +
                        "bicolores de sépalos rojos y pétalos morados. Su nombre proviene del " +
                        "mapudungún 'chil-ko', ‘el que nace cerca del agua’. Crece en lugares " +
                        "húmedos desde Valparaíso hasta Magallanes. Sus flores son polinizadas " +
                        "por picaflores y se utiliza como planta ornamental y medicinal."
        ),
        Plant(
            id = 2,
            commonName = "Coligue",
            scientificName = "Chusquea culeou",
            imageRes = R.drawable.coligue,
            description =
                "Bambú nativo que forma matorrales densos. Sus cañas se usan en artesanía " +
                        "y construcción ligera y sirven de refugio para fauna nativa."
        ),
        Plant(
            id = 3,
            commonName = "Maqui",
            scientificName = "Aristotelia chilensis",
            imageRes = R.drawable.maqui,
            description =
                "Arbusto de frutos morados comestibles, ricos en antioxidantes. Se utiliza " +
                        "en jugos, mermeladas y preparaciones tradicionales."
        ),
        Plant(
            id = 4,
            commonName = "Meli",
            scientificName = "Amomyrtus meli",
            imageRes = R.drawable.meli,
            description =
                "Árbol siempreverde del bosque valdiviano. Sus flores blancas son melíferas " +
                        "y su madera se ha usado en construcción y leña."
        ),
        Plant(
            id = 5,
            commonName = "Murta",
            scientificName = "Ugni molinae",
            imageRes = R.drawable.murta,
            description =
                "Arbusto de frutos rojos aromáticos muy típicos del sur de Chile. Sus bayas " +
                        "se consumen frescas o en mermeladas y licores."
        ),
        Plant(
            id = 6,
            commonName = "Nalca",
            scientificName = "Gunnera tinctoria",
            imageRes = R.drawable.nalca,
            description =
                "Planta de grandes hojas palmeadas que crece en zonas muy húmedas. Los pecíolos " +
                        "tiernos se consumen con sal en la cocina tradicional."
        ),
        Plant(
            id = 7,
            commonName = "Quila",
            scientificName = "Chusquea quila",
            imageRes = R.drawable.quila,
            description =
                "Bambú nativo que forma quilantales densos en laderas húmedas. Es importante " +
                        "como hábitat para aves y mamíferos del bosque."
        ),
        Plant(
            id = 8,
            commonName = "Sauco",
            scientificName = "Sambucus nigra",
            imageRes = R.drawable.sauco,
            description =
                "Arbusto de hojas compuestas y racimos de flores blancas. Sus frutos se usan " +
                        "en jarabes, mermeladas y preparaciones medicinales caseras."
        )
    )

    fun getPlantById(id: Int): Plant? = plants.find { it.id == id }  // helper para el detalle
}