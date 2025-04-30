package com.pdmtaller2.RamirezBarrera_00018523.data.model

data class Restaurant (
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val categories: List<String>,
    val menu: List<Dish>
)