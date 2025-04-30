package com.pdmtaller2.RamirezBarrera_00018523.data.repository.Restaurant

import com.pdmtaller2.RamirezBarrera_00018523.data.dummy.restaurants
import com.pdmtaller2.RamirezBarrera_00018523.data.model.Restaurant
import kotlinx.coroutines.delay

class RestaurantRepositoryImpl : RestaurantRepository {

  override suspend fun getRestaurants(): List<Restaurant> {
    delay(1000)
    return restaurants
  }
}
