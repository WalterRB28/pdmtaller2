package com.agarcia.myfirstandroidapp.ui.layout

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.pdmtaller2.RamirezBarrera_00018523.ui.layout.NavItem

@Composable
fun CustomBottomBar(navItems: List<NavItem>, selectedItem: String = "nowplaying", onItemSelected: (String) -> Unit) {
  NavigationBar(
  ) {

    navItems.forEach { item ->
      NavigationBarItem(
        label = { Text(item.label) },
        icon = { Icon(item.icon, contentDescription = item.label) }
        selected = selectedItem == item.route,
        onClick = { onItemSelected(item.route) },
      )
    }
  }
}
