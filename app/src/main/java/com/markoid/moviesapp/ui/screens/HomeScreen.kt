package com.markoid.moviesapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.markoid.moviesapp.ui.models.Movie
import com.markoid.moviesapp.ui.models.getMovies
import com.markoid.moviesapp.ui.navigation.MovieScreens
import com.markoid.moviesapp.ui.widgets.MovieRow

@Composable
fun HomeScreen(
  navController: NavController
) {
  Scaffold(
    topBar = {
      TopAppBar(
        backgroundColor = MaterialTheme.colors.primary,
        elevation = 5.dp
      ) {
        Row(modifier = Modifier.padding(4.dp)) {
          Text(text = "Home", color = Color.White, fontSize = 20.sp)
        }
      }
    }
  ) {
    MainContent(navController)
  }
}

@Composable
fun MainContent(
  navController: NavController,
  movieList: List<Movie> = getMovies()
) {
  Column(modifier = Modifier.padding(12.dp)) {
    LazyColumn {
      items(items = movieList) {
        MovieRow(movie = it) { movie ->
          navController.navigate(
            route = MovieScreens.DetailScreen.name + "/${movie.id}"
          ) {
          }
        }
      }
    }
  }
}