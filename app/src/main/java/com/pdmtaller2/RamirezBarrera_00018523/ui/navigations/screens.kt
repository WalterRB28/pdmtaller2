package com.pdmtaller2.RamirezBarrera_00018523.ui.navigations

import kotlinx.serialization.Serializable

@Serializable
object RestaurantListScreenNavigation

@Serializable
object SearchScreenNavigation

@Serializable
object MyOrdersScreenNavigation

@Serializable
data class RestaurantDetailScreenNavigation(val id: Int)