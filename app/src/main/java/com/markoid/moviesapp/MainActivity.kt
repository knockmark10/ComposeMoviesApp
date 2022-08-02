package com.markoid.moviesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.markoid.moviesapp.ui.navigation.MovieNavigation
import com.markoid.moviesapp.ui.theme.MoviesAppTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MyApp {
        MovieNavigation()
      }
    }
  }
}

@Composable
fun MyApp(content: @Composable () -> Unit = {}) {
  MoviesAppTheme {
    content()
  }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  MyApp {
    MovieNavigation()
  }
}