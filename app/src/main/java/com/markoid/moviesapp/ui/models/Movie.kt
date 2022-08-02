package com.markoid.moviesapp.ui.models

data class Movie(
  val id: String,
  val title: String,
  val year: String,
  val genre: String,
  val director: String,
  val actors: String,
  val plot: String,
  val poster: String,
  val images: List<String>,
  val rating: String
)

fun getMovies(): List<Movie> = listOf(
  Movie(
    id = "0001",
    title = "Avatar",
    year = "2009",
    genre = "Action, Adventure, Fantasy",
    director = "James Cameron",
    actors = "Sam Worthington, Zoe Saldana, Sigoureney Weaver, Stephen Lang",
    plot = "It's about a bunch of blue guys wandering through an unknown land",
    poster = "https://m.media-amazon.com/images/M/MV5BZDA0OGQxNTItMDZkMC00N2UyLTg3MzMtYTJmNjg3Nzk5MzRiXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_.jpg",
    images = emptyList(),
    rating = "5.0"
  ),
  Movie(
    id = "0002",
    title = "Avengers: Age Of Ultron",
    year = "2015",
    genre = "Action, Adventure, Fiction",
    director = "Brian Cox",
    actors = "Robert Downey Jr, Chris Evans, Chris Hemsworth, Paul Betany, Elizabeth Olzen, Scarlet Johanson",
    plot = "It's about an IA created by Tony Start that goes out of control",
    poster = "https://m.media-amazon.com/images/M/MV5BMTM4OGJmNWMtOTM4Ni00NTE3LTg3MDItZmQxYjc4N2JhNmUxXkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_FMjpg_UX1000_.jpg",
    images = emptyList(),
    rating = "5.0"
  ),
  Movie(
    id = "0003",
    title = "Limitless",
    year = "2011",
    genre = "Action, Drama",
    director = "John Lynch",
    actors = "Trevor Lawrence, Joe Burrow, Fred Warner, Deebo Samuel, George Kittle",
    plot = "It's about a man who hacks his brain with a powerfull blue pill (not viagra)",
    poster = "https://m.media-amazon.com/images/I/7170GPXbWKL._SL1500_.jpg",
    images = emptyList(),
    rating = "5.0"
  ),
  Movie(
    id = "0004",
    title = "Fast And Furious: Tokyo Drift",
    year = "2009",
    genre = "Action, Adventure, Fantasy",
    director = "Justin Lynn",
    actors = "Sean Penn, Travis Kelce, Travis Ettiene, Joe Staley",
    plot = "It's about an american on Japan who loves to wreck cars at a very young age",
    poster = "https://images.moviesanywhere.com/0d8385198e30c6ac086b643c6a13ab50/0baff3aa-3327-4e33-9546-600bea206acf.jpg",
    images = emptyList(),
    rating = "5.0"
  ),
  Movie(
    id = "0005",
    title = "Taken",
    year = "2009",
    genre = "Action, Drama",
    director = "Willy Wonka",
    actors = "Liam Neeson, Davante Adams, Urban Meyer, Celine Dione",
    plot = "It's about a gang that messed up with the wrong guy who has a very particular set of skills",
    poster = "https://lumiere-a.akamaihd.net/v1/images/image_efeee89d.jpeg",
    images = emptyList(),
    rating = "5.0"
  ),
)
