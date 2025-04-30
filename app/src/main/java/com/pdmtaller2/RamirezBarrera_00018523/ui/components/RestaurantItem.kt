package com.pdmtaller2.RamirezBarrera_00018523.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.AsyncImagePainter
import coil.request.ImageRequest
import com.pdmtaller2.RamirezBarrera_00018523.data.model.Restaurant

@Composable
fun RestaurantItem(
    restaurant: Restaurant,
    onRestaurantClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    var isLoading by remember { mutableStateOf(true) }
    Card(
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = modifier
            .clickable { onRestaurantClick(restaurant.id) }
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .width(160.dp)
                .padding(8.dp)
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(restaurant.imageUrl)
                    .crossfade(true)
                    .build(),
                contentDescription = restaurant.name,
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop,
                onState = {
                    isLoading = when (it) {
                        is AsyncImagePainter.State.Loading -> true
                        is AsyncImagePainter.State.Success,
                        is AsyncImagePainter.State.Error -> false
                        else -> false
                    }
                }
            )

            if (isLoading) {
                CircularProgressIndicator()
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = restaurant.name,
                style = MaterialTheme.typography.titleSmall,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRestaurantItem() {
    val sampleRestaurant = Restaurant(
        id = 1,
        name = "La Trattoria",
        description = "Restaurante italiano con pastas y pizzas",
        imageUrl = "",
        categories = listOf("Italiana", "Pasta", "Pizza"),
        menu = listOf()
    )

    RestaurantItem(restaurant = sampleRestaurant, onRestaurantClick = {})
}
