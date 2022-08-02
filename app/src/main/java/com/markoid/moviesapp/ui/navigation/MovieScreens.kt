package com.markoid.moviesapp.ui.navigation

enum class MovieScreens {
  HomeScreen,
  DetailScreen;

  companion object {
    fun fromRoute(route: String?): MovieScreens =
      when (route?.substringBefore("/")) {
        HomeScreen.name -> HomeScreen
        DetailScreen.name -> DetailScreen
        else -> throw IllegalArgumentException("Route $route is not recognized")
      }
  }
}