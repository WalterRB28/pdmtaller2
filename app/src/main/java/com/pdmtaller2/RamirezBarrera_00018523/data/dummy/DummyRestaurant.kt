package com.pdmtaller2.RamirezBarrera_00018523.data.dummy

import com.pdmtaller2.RamirezBarrera_00018523.data.model.Dish
import com.pdmtaller2.RamirezBarrera_00018523.data.model.Restaurante

val restaurants = listOf(
    Restaurante(
        id = 1,
        name = "La Casa de la Pasta",
        description = "Un lugar acogedor donde la pasta es la estrella.",
        imageURL = "https://example.com/image1.jpg",
        categories = listOf("Italian", "Pasta"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Spaghetti Carbonara",
                description = "Espaguetis con salsa carbonara y panceta.",
                imageURL = "https://example.com/dish1.jpg"
            ),
            Dish(
                id = 2,
                name = "Tornillos en Crema",
                description = "Tornillitos con salsa cremosa y quesada.",
                imageURL = "https://example.com/dish1.jpg",
            )
        )
    ),
    Restaurante(
        id = 2,
        name = "La Casa de la Carne",
        description = "Un lugar no acogedor donde la carne es la luna.",
        imageURL = "https://example.com/image1.jpg",
        categories = listOf("American", "Carne"),
        menu = listOf(
            Dish(
                id = 3,
                name = "Carne a la plancha",
                description = "Carne con arroz y torillas.",
                imageURL = "https://example.com/dish1.jpg"
            ),
            Dish(
                id = 4,
                name = "Chorizo bautizado",
                description = "CHorizos hechos en una salsa picante.",
                imageURL = "https://example.com/dish1.jpg",
            )
        )
    ),
)