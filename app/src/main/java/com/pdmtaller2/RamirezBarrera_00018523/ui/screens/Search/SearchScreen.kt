package com.pdmtaller2.RamirezBarrera_00018523.ui.screens.Search

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.pdmtaller2.RamirezBarrera_00018523.data.dummy.restaurants
import com.pdmtaller2.RamirezBarrera_00018523.data.model.Restaurant

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
        Card(
          modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .clickable { onRestaurantClick(restaurant.id) }
        ) {
          Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
          ) {
            Column(
              modifier = Modifier
                .weight(1f)
                .padding(end = 12.dp)
            ){
              Text(text = restaurant.name, style = MaterialTheme.typography.titleMedium)
              Spacer(modifier = Modifier.height(4.dp))
              Text(
                text = restaurant.description,
                style = MaterialTheme.typography.bodySmall
              )
              Spacer(modifier = Modifier.height(4.dp))
              Text(
                text = "Categorías: ${restaurant.categories.joinToString()}",
                style = MaterialTheme.typography.labelSmall
              )
            }
            AsyncImage(
              model = ImageRequest.Builder(LocalContext.current)
                .data(restaurant.imageUrl)
                .crossfade(true)
                .build(),
              contentDescription = "Imagen del restaurante",
              contentScale = ContentScale.Crop,
              modifier = Modifier
                .size(80.dp)
                .clip(RoundedCornerShape(8.dp))
            )
          }
        }
      }
    }
  }
}