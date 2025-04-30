package com.pdmtaller2.RamirezBarrera_00018523.ui.navigations

object AppRoutes {
    const val RESTAURANT_LIST = "restaurantes"
    const val SEARCH = "search"
    const val ORDERS = "orders"
    const val RESTAURANT_DETAIL = "restaurantes/{id}"

    fun restaurantDetail(id: Int) = "restaurantes/$id"
}