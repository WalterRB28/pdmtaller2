package com.pdmtaller2.RamirezBarrera_00018523.ui.screens.RestaurantList

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdmtaller2.RamirezBarrera_00018523.ui.components.RestaurantItem
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import com.pdmtaller2.RamirezBarrera_00018523.data.model.Dish
import com.pdmtaller2.RamirezBarrera_00018523.data.model.Restaurant


@Composable
fun RestaurantListScreen(
    onRestaurantClick: (Int) -> Unit = {},
    viewModel: RestaurantListViewModel = viewModel()
) {
    val restaurants by viewModel.restaurants.collectAsState()
    val loading by viewModel.loading.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.loadRestaurants()
    }

    if (loading) {
        CircularProgressIndicator()
        return
    }

    val grouped = restaurants.groupBy { it.categories.firstOrNull() ?: "Otros" }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        grouped.forEach { (category, restaurantList) ->
            item {
                Text(
                    text = category,
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }

            item {
                LazyRow {
                    items(restaurantList) { restaurant ->
                        RestaurantItem(
                            restaurant = restaurant,
                            onRestaurantClick = onRestaurantClick,
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun FakeRestaurantListScreen(
    onRestaurantClick: (Int) -> Unit = {}
) {
    val fakeRestaurants = listOf(
        Restaurant(id = 1,
            name = "La Casa de la Pasta",
            description = "Un lugar acogedor donde disfrutar de la mejor pasta de la ciudad.",
            imageUrl = "",
            categories = listOf("Italian", "Pasta"),
            menu = listOf(
                Dish(
                    id = 1,
                    name = "Spaghetti Carbonara",
                    description = "Espaguetis con salsa carbonara y panceta.",
                    imageUrl = "",
                ),
                Dish(
                    id = 2,
                    name = "Spaghetti Carbonara",
                    description = "Espaguetis con salsa carbonara y panceta.",
                    imageUrl = "",
                )
            ),
        ),
        Restaurant(
            id = 2,
            name = "El Rincón Mexicano",
            description = "Auténtica comida mexicana con un toque casero.",
            imageUrl = "",
            categories = listOf("Mexican", "Tacos"),
            menu = listOf(
                Dish(
                    id = 3,
                    name = "Tacos al Pastor",
                    description = "Tacos tradicionales con carne al pastor y piña.",
                    imageUrl = "",
                ),
                Dish(
                    id = 4,
                    name = "Guacamole",
                    description = "Guacamole fresco con totopos crujientes.",
                    imageUrl = "",
                )
            )
        ),
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(fakeRestaurants) { restaurant ->
            RestaurantItem(restaurant = restaurant, onRestaurantClick = onRestaurantClick)
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RestaurantListScreenPreview() {
    FakeRestaurantListScreen()
}
