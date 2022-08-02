package com.markoid.moviesapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.rememberImagePainter
import com.markoid.moviesapp.ui.models.Movie
import com.markoid.moviesapp.ui.models.getMovies
import com.markoid.moviesapp.ui.widgets.MovieRow

@Composable
fun DetailsScreen(
  navController: NavHostController,
  movieId: String?
) {
  val movie = getMovies().firstOrNull { it.id == movieId } ?: return
  Scaffold(
    topBar = {
      TopAppBar(
        backgroundColor = MaterialTheme.colors.primary,
        elevation = 5.dp
      ) {
        Row(
          verticalAlignment = Alignment.CenterVertically,
          modifier = Modifier.padding(4.dp)
        ) {
          Icon(
            imageVector = Icons.Default.ArrowBack,
            tint = Color.White,
            contentDescription = null,
            modifier = Modifier.clickable {
              navController.navigateUp()
            }
          )
          Spacer(modifier = Modifier.width(20.dp))
          Text(text = "Movie", color = Color.White, fontSize = 20.sp)
        }
      }
    }
  ) {
    Surface(
      modifier = Modifier.fillMaxSize()
    ) {
      Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
      ) {
        MovieRow(movie)
        Spacer(modifier = Modifier.height(8.dp))
        Divider()
        Text(text = "Movie Images")
        HorizontalScrollableImageView(movie)
      }
    }
  }
}

@Composable
private fun HorizontalScrollableImageView(movie: Movie) {
  LazyRow {
    items(movie.images) { image ->
      Card(
        modifier = Modifier
          .padding(12.dp)
          .size(240.dp),
        elevation = 5.dp
      ) {
        Image(
          painter = rememberImagePainter(data = image),
          contentDescription = "Movie image"
        )
      }
    }
  }
}
