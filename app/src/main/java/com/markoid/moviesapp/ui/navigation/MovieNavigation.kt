package com.markoid.moviesapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.markoid.moviesapp.ui.screens.DetailsScreen
import com.markoid.moviesapp.ui.screens.HomeScreen

@Composable
fun MovieNavigation() {
  val navController = rememberNavController()
  NavHost(
    navController = navController,
    startDestination = MovieScreens.HomeScreen.name
  ) {

    composable(route = MovieScreens.HomeScreen.name) {
      // Here we pass where this should lead us to
      HomeScreen(navController = navController)
    }

    composable(
      route = MovieScreens.DetailScreen.name + "/{movie}",
      arguments = listOf(navArgument("movie") { type = NavType.StringType })
    ) {
      DetailsScreen(
        navController = navController,
        movieId = it.arguments?.getString("movie", "")
      )

    }
  }
}