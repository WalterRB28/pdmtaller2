package com.pdmtaller2.RamirezBarrera_00018523.ui.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.agarcia.myfirstandroidapp.ui.layout.CustomBottomBar
import com.agarcia.myfirstandroidapp.ui.layout.CustomTopBar
import com.pdmtaller2.RamirezBarrera_00018523.ui.navigations.MainNavigation
import com.pdmtaller2.RamirezBarrera_00018523.ui.navigations.screens
import com.pdmtaller2.RamirezBarrera_00018523.ui.navigations.MovieListScreenNavigation
import kotlinx.coroutines.launch

const val MovieListScreenNavigationId = "com.pdmtaller2.RamirezBarrera_00018523.ui.navigations.RestaurantDetailScreenNavigation/{id}"
data class NavItem(val label: String, val icon: ImageVector, val route: String)

@Composable
fun CustomScaffold () {
    val navController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    val currentDestination = navController
        .currentBackStackEntryAsState().value?.destination?.route

    var Restaurante by rememberSaveable { mutableStateOf("Restaurante") }
    var selectedItem by rememberSaveable { mutableStateOf("nowplaying") }

    val navItems = listOf(
        NavItem("Restaurante", Icons.Filled.Home,"nowplaying"),
        NavItem("Buscar", Icons.Filled.Home,"favorites"),
        NavItem("Mis ordenes",Icons.Filled.Home,"upcomming")
    )

    fun onItemSelected(currentItem: String) {
        selectedItem = currentItem
        Restaurante = when (currentItem) {
            "nowplaying" -> "Restaurante"
            "favorites" -> "Buscar"
            "upcomming" -> "Mis ordenes"
            else -> "Inicio"
        }
        when (currentItem) {
            "nowplaying" -> navController.navigate(MovieListScreenNavigation)
            "favorites" -> navController.navigate(MyFavoritesScreenNavigation)
            "upcomming" -> navController.navigate(UpCommingScreenNavigation)
            else -> navController.navigate(MovieListScreenNavigation)
        }
    }

    Scaffold(
        topBar = { CustomTopBar(
            title = Restaurante,
            showBackButton = currentDestination == MovieListScreenNavigationId,
            onBackClick = { navController.popBackStack() },
        )
        },
        bottomBar = { CustomBottomBar(
            navItems = navItems,
            selectedItem = selectedItem,
            onItemSelected = { onItemSelected(it) }
        )
        },
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
    ) { innerPadding ->
        Column (
            modifier = Modifier.padding(innerPadding).fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
        ) {
            MainNavigation(navController = navController)
        }
    }
}