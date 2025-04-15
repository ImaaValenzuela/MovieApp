package imaavalenzuela.movieapp.data.remote

import imaavalenzuela.movieapp.data.model.MovieList
import imaavalenzuela.movieapp.repository.WebService
import imaavalenzuela.movieapp.utils.Constants

class MovieDataSource(private val webService: WebService) {

    suspend fun getUpcomingMovies(): MovieList = webService.getUpcomingMovies(Constants.API_KEY)

    suspend fun getMostRatedMovies(): MovieList = webService.getMostRatedMovies(Constants.API_KEY)

    suspend fun getPopularMovies(): MovieList = webService.getPopularMovies(Constants.API_KEY)

}