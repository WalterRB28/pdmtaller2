package com.pdmtaller2.RamirezBarrera_00018523.ui.layout

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun CustomBottomBar(navItems: List<NavItem>,  selectedItem: String = "restaurant", onItemSelected: (String) -> Unit) {
    NavigationBar(
    ) {
        navItems.forEach { item ->
            NavigationBarItem(
                label = { Text(item.label) },
                icon = { Icon(imageVector = item.icon, contentDescription = item.label) },
                selected = selectedItem == item.route,
                onClick = { onItemSelected(item.route) },
            )
        }
    }
}