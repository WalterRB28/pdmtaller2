package com.pdmtaller2.RamirezBarrera_00018523.ui.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.rememberNavController
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.pdmtaller2.RamirezBarrera_00018523.ui.navigations.AppRoutes
import com.pdmtaller2.RamirezBarrera_00018523.ui.navigations.MainNavigation

const val RestaurantListScreenNavigationId = "com.pdmtaller2.RamirezBarrera_00018523.ui.navigations.RestaurantDetailScreenNavigation/{id}"
data class NavItem(val label: String, val icon: ImageVector, val route: String)

@Composable
fun CustomScaffold() {
    val navController = rememberNavController()
    var title by rememberSaveable { mutableStateOf("Restaurantes") }
    var selectedItem by rememberSaveable { mutableStateOf(AppRoutes.RESTAURANT_LIST) }

    val currentDestination = navController
        .currentBackStackEntryAsState().value?.destination?.route

    val navItems = listOf(
        NavItem("Restaurantes", Icons.Filled.Home, AppRoutes.RESTAURANT_LIST),
        NavItem("Search", Icons.Filled.Search, AppRoutes.SEARCH),
        NavItem("My Orders", Icons.Filled.ShoppingCart, AppRoutes.ORDERS)
    )

    fun onItemSelected(currentItem: String) {
        selectedItem = currentItem
        title = when (currentItem) {
            AppRoutes.RESTAURANT_LIST -> "Restaurantes"
            AppRoutes.SEARCH -> "Search"
            AppRoutes.ORDERS -> "My Orders"
            else -> "Inicio"
        }
        navController.navigate(currentItem) {
            // Configuración para evitar múltiples copias de la misma pantalla
            launchSingleTop = true
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            restoreState = true
        }
    }

    Scaffold(
        topBar = {
            CustomTopBar(
                title = title,
                showBackButton = currentDestination?.contains("restaurantes/") == true,
                onBackClick = { navController.popBackStack() },
            )
        },
        bottomBar = {
            CustomBottomBar(
                navItems = navItems,
                selectedItem = selectedItem,
                onItemSelected = { onItemSelected(it) }
            )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding).fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MainNavigation(navController = navController, onTitleChange = { title = it })
        }
    }
}