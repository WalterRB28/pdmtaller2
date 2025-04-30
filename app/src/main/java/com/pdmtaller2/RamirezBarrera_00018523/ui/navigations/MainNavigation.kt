package com.pdmtaller2.RamirezBarrera_00018523.ui.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdmtaller2.RamirezBarrera_00018523.data.dummy.restaurants
import com.pdmtaller2.RamirezBarrera_00018523.ui.screens.Search.SearchScreen
import com.pdmtaller2.RamirezBarrera_00018523.ui.screens.UpComming.UpComming
import com.pdmtaller2.RamirezBarrera_00018523.ui.screens.RestaurantDetailScreen
import com.pdmtaller2.RamirezBarrera_00018523.ui.screens.RestaurantList.RestaurantListScreen

@Composable
fun MainNavigation(navController: NavHostController, onTitleChange: (String) -> Unit) {
    val onRestaurantClick = { restaurantId: Int ->
        navController.navigate(AppRoutes.restaurantDetail(restaurantId))
    }

    NavHost(
        navController = navController,
        startDestination = AppRoutes.RESTAURANT_LIST
    ) {
        composable(AppRoutes.RESTAURANT_LIST) {
            RestaurantListScreen(onRestaurantClick)
            onTitleChange("Restaurantes")
        }
        composable(AppRoutes.RESTAURANT_DETAIL) { backStackEntry ->
            val restaurantId = backStackEntry.arguments?.getString("id")?.toIntOrNull() ?: 0
            RestaurantDetailScreen(
                restaurantId = restaurantId,
                onTitleChange = onTitleChange
            )
        }
        composable(AppRoutes.SEARCH) {
            SearchScreen(
                restaurantsList = restaurants,
                onRestaurantClick = { restaurantId ->
                    navController.navigate(AppRoutes.restaurantDetail(restaurantId))
                }
            )
            onTitleChange("Search")
        }
        composable(AppRoutes.ORDERS) {
            UpComming()
            onTitleChange("My Orders")
        }
    }
}