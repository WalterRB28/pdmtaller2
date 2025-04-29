package com.pdmtaller2.RamirezBarrera_00018523.ui.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.agarcia.myfirstandroidapp.ui.screens.RestaurantDetailScreen
import com.agarcia.myfirstandroidapp.ui.screens.RestaurantListScreen

@Composable
fun MainNavigation(navController: NavHostController) {
  val onRestaurantClick = { movieId: Int ->
    navController.navigate(RestaurantDetailScreenNavigation(movieId))
  }

  NavHost(navController = navController, startDestination = RestaurantListScreenNavigation) {
    composable <RestaurantListScreenNavigation> {
      RestaurantListScreen(onRestaurantClick)
    }
    composable <RestaurantDetailScreenNavigation> { backStackEntry ->
      val movieId = backStackEntry.arguments?.getInt("id") ?: 0
      RestaurantDetailScreen(restaurantId = movieId)
    }
  }
}