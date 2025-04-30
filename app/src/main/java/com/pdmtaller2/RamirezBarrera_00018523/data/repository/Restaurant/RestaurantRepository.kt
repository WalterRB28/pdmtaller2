package com.pdmtaller2.RamirezBarrera_00018523.data.repository.Restaurant

import com.pdmtaller2.RamirezBarrera_00018523.data.model.Restaurant

interface RestaurantRepository {
  suspend fun getRestaurants(): List<Restaurant>
}