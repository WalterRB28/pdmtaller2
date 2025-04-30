package com.pdmtaller2.RamirezBarrera_00018523.ui.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdmtaller2.RamirezBarrera_00018523.ui.screens.Favorites.Favorites
import com.pdmtaller2.RamirezBarrera_00018523.ui.screens.UpComming.UpComming
import com.pdmtaller2.RamirezBarrera_00018523.ui.screens.RestaurantDetailScreen
import com.pdmtaller2.RamirezBarrera_00018523.ui.screens.RestaurantList.RestaurantListScreen

object AppRoutes {
    const val RESTAURANT_LIST = "restaurantes"
    const val SEARCH = "search"
    const val ORDERS = "orders"
    const val RESTAURANT_DETAIL = "restaurantes/{id}"

    fun restaurantDetail(id: Int) = "restaurantes/$id"
}

@Composable
fun MainNavigation(navController: NavHostController) {
    val onRestaurantClick = { restaurantId: Int ->
        navController.navigate(AppRoutes.restaurantDetail(restaurantId))
    }

    NavHost(
        navController = navController,
        startDestination = AppRoutes.RESTAURANT_LIST
    ) {
        composable(AppRoutes.RESTAURANT_LIST) {
            RestaurantListScreen(onRestaurantClick)
        }
        composable(AppRoutes.RESTAURANT_DETAIL) { backStackEntry ->
            val restaurantId = backStackEntry.arguments?.getString("id")?.toIntOrNull() ?: 0
            RestaurantDetailScreen(restaurantId = restaurantId)
        }
        composable(AppRoutes.SEARCH) {
            Favorites()
        }
        composable(AppRoutes.ORDERS) {
            UpComming()
        }
    }
}