package com.pdmtaller2.RamirezBarrera_00018523.data.model

data class Restaurante (
    val id: Int,
    val name: String,
    val description: String,
    val imageURL: String,
    val categories: List<String>,
    val menu: List<Dish>
)