package com.pdmtaller2.RamirezBarrera_00018523

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pdmtaller2.RamirezBarrera_00018523.ui.layout.CustomScaffold
import com.pdmtaller2.RamirezBarrera_00018523.ui.theme.MyFirstAndroidAppTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      MyFirstAndroidAppTheme {
        CustomScaffold()
      }
    }
  }
}