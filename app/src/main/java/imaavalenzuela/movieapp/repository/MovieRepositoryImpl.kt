package imaavalenzuela.movieapp.repository

import imaavalenzuela.movieapp.data.model.MovieList
import imaavalenzuela.movieapp.data.remote.MovieDataSource

class MovieRepositoryImpl (private val dataSource: MovieDataSource): MovieRepository {
    override suspend fun getUpcomingMovies(): MovieList = dataSource.getUpcomingMovies()

    override suspend fun getPopularMovies(): MovieList = dataSource.getPopularMovies()

    override suspend fun getMostRatedMovies(): MovieList = dataSource.getMostRatedMovies()

}