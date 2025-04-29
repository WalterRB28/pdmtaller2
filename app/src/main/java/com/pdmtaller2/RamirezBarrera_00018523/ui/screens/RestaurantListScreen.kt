package com.agarcia.myfirstandroidapp.ui.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pdmtaller2.RamirezBarrera_00018523.data.dummy.restaurants
import com.pdmtaller2.RamirezBarrera_00018523.ui.components.RestaurantItem

@Composable
fun RestaurantListScreen(
  onRestaurantClick : (Int) -> Unit = {}
){
  val restaurant = restaurants
  LazyColumn(
    modifier = Modifier
      .fillMaxSize()
      .padding(16.dp)
  ) {
    items(restaurant) { restaurant ->
      RestaurantItem(restaurant = restaurant, onRestauranClick = onRestaurantClick)
      Spacer(modifier = Modifier.height(16.dp))
    }
  }
}

@Preview(showBackground = true)
@Composable
fun MovieListScreenPreview(){
  RestaurantListScreen()
}