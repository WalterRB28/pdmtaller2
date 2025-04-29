package com.pdmtaller2.RamirezBarrera_00018523.ui.navigations

import kotlinx.serialization.Serializable

@Serializable
object MovieListScreenNavigation

@Serializable
object MyFavoritesScreenNavigation

@Serializable
object UpCommingScreenNavigation

@Serializable
data class MovieDetailScreenNavigation(val id: Int)