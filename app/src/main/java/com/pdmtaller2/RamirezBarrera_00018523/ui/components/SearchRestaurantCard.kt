package com.pdmtaller2.RamirezBarrera_00018523.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
import com.pdmtaller2.RamirezBarrera_00018523.data.model.Restaurant

@Composable
fun SearchRestaurantCard(
  restaurant: Restaurant,
  onRestaurantClick: (Int) -> Unit
) {
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
      ) {
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
