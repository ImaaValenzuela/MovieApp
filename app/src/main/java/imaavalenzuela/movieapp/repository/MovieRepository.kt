package imaavalenzuela.movieapp.repository

import imaavalenzuela.movieapp.data.model.MovieList

interface MovieRepository {
    suspend fun getUpcomingMovies () : MovieList
    suspend fun getPopularMovies () : MovieList
    suspend fun getMostRatedMovies () : MovieList
}