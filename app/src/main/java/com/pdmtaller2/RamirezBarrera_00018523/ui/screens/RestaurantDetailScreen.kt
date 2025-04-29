package com.agarcia.myfirstandroidapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pdmtaller2.RamirezBarrera_00018523.data.dummy.restaurants

@Composable
fun RestaurantDetailScreen(restaurantId: Int) {
  val scrollState = rememberScrollState()
  val restaurant = restaurants.firstOrNull { it.id == restaurantId }

  if (restaurant == null) {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
      Text("Restaurante no encontrado", style = MaterialTheme.typography.titleLarge)
    }
    return
  }

  Column(
    modifier = Modifier
      .fillMaxSize()
      .verticalScroll(scrollState)
      .background(Color.White)
  ) {
    Row(modifier = Modifier.padding(16.dp)) {
      Spacer(modifier = Modifier.width(16.dp))
      Column {
        Text(
          text = restaurant.name,
          style = MaterialTheme.typography.titleLarge,
          fontWeight = FontWeight.Bold
        )
        Text(
          text = restaurant.description,
          style = MaterialTheme.typography.titleMedium,
          fontWeight = FontWeight.SemiBold
        )
      }
    }

    // Aquí agregamos el menú
    Spacer(modifier = Modifier.padding(8.dp))
    restaurant.menu.forEach { dish ->
      Column(modifier = Modifier.padding(16.dp)) {
        Text(
          text = dish.name,
          style = MaterialTheme.typography.titleMedium,
          fontWeight = FontWeight.Bold
        )
        Text(
          text = dish.description,
          style = MaterialTheme.typography.bodyMedium,
          modifier = Modifier.padding(bottom = 8.dp)
        )
      }
    }
  }
}

@Preview(showBackground = true)
@Composable
fun MovieDetailScreenPreview(){
  RestaurantDetailScreen(798418)
}