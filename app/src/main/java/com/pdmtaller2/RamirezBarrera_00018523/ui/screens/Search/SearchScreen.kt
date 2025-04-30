package com.pdmtaller2.RamirezBarrera_00018523.ui.screens.Search

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pdmtaller2.RamirezBarrera_00018523.data.dummy.restaurants
import com.pdmtaller2.RamirezBarrera_00018523.data.model.Restaurant
import com.pdmtaller2.RamirezBarrera_00018523.ui.components.SearchRestaurantCard

@Composable
fun SearchScreen(
  restaurantsList: List<Restaurant> = restaurants,
  onRestaurantClick: (Int) -> Unit
) {
  var query by remember { mutableStateOf("") }
  val queryLower = query.lowercase()

  val filteredRestaurants = restaurantsList.filter { restaurant ->
    val matchesRestaurantName = restaurant.name.contains(query, ignoreCase = true)
    val matchesCategory = restaurant.categories.any { it.contains(query, ignoreCase = true) }
    val matchesDish = restaurant.menu.any { dish ->
      dish.name.contains(query, ignoreCase = true) || dish.description.contains(query, ignoreCase = true)
    }
    matchesRestaurantName || matchesCategory || matchesDish
  }

  Column(modifier = Modifier
    .fillMaxSize()
    .padding(16.dp)) {

    OutlinedTextField(
      value = query,
      onValueChange = { query = it },
      label = { Text("Buscar restaurantes...") },
      modifier = Modifier.fillMaxWidth()
    )

    Spacer(modifier = Modifier.height(16.dp))

    if (query.isNotEmpty() && filteredRestaurants.isEmpty()) {
      Text("No se encontraron resultados", style = MaterialTheme.typography.bodyMedium)
    }

    LazyColumn {
      items(filteredRestaurants) { restaurant ->
        SearchRestaurantCard(restaurant = restaurant, onRestaurantClick = onRestaurantClick)
      }
    }
  }
}