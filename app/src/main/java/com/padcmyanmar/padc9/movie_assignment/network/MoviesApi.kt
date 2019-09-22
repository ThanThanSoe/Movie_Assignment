package com.padcmyanmar.padc9.movie_assignment.network

import com.padcmyanmar.padc9.movie_assignment.network.responses.GetMoviesResponse
import com.padcmyanmar.padc9.movie_assignment.utils.GET_MOVIE
import retrofit2.Call
import retrofit2.http.POST

interface MoviesApi {
    @POST(GET_MOVIE)
    fun getAllMovies() : Call<GetMoviesResponse>
}