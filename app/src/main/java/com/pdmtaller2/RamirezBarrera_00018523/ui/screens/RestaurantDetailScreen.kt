package com.pdmtaller2.RamirezBarrera_00018523.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import com.pdmtaller2.RamirezBarrera_00018523.data.dummy.restaurants
import com.pdmtaller2.RamirezBarrera_00018523.ui.components.DishItem
import kotlinx.coroutines.launch

@Composable
fun RestaurantDetailScreen(restaurantId: Int, onTitleChange: (String) -> Unit = {}) {
    val scrollState = rememberScrollState()
    val restaurant = restaurants.firstOrNull { it.id == restaurantId }
    val snackbarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()

    if (restaurant == null) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text("Restaurante no encontrado", style = MaterialTheme.typography.titleLarge)
        }
        return
    }

    var searchItem by remember { mutableStateOf("") }
    val keyboardController = LocalSoftwareKeyboardController.current

    val DishListFiltered = restaurant.menu.filter {
        it.name.contains(searchItem, ignoreCase = true)
    }

    LaunchedEffect(Unit) {
        onTitleChange(restaurant.name)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            BasicTextField(
                value = searchItem,
                onValueChange = { searchItem = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .background(Color.Gray.copy(alpha = 0.1f), RoundedCornerShape(8.dp))
                    .padding(12.dp),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Search
                ),
                keyboardActions = KeyboardActions(
                    onSearch = {
                        keyboardController?.hide()
                    }
                )
            ) {
                Text(text = if (searchItem.isEmpty()) "Buscar platillos..." else searchItem)
            }

            if (searchItem.isEmpty()) {
                Text(
                    text = restaurant.description,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Menú",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(8.dp))

                if (DishListFiltered.isEmpty()) {
                    Text("No se encontraron platillos.")
                } else {
                    DishListFiltered.forEach { dish ->
                        DishItem(
                            dish = dish,
                            onAddToCart = {
                                coroutineScope.launch {
                                    snackbarHostState.showSnackbar("${dish.name} agregado al carrito")
                                }
                            }
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                }
            }
        }

        SnackbarHost(
            hostState = snackbarHostState,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRestaurantDetailScreen() {
    RestaurantDetailScreen(restaurantId = 1)
}
