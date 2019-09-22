package com.padcmyanmar.padc9.movie_assignment.network.dataagents

import com.padcmyanmar.padc9.movie_assignment.data.vos.MoviesVO
import com.padcmyanmar.padc9.movie_assignment.network.MoviesApi
import com.padcmyanmar.padc9.movie_assignment.network.responses.GetMoviesResponse
import com.padcmyanmar.padc9.movie_assignment.utils.BASE_URL
import com.padcmyanmar.padc9.movie_assignment.utils.EM_NULL_EVENT_RESPONSE
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetroFitAgent: MovieDataAgent{

    private val movieApi: MoviesApi

    init {
        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15,TimeUnit.SECONDS)
            .writeTimeout(15,TimeUnit.SECONDS)
            .build()
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        movieApi = retrofit.create(MoviesApi::class.java)
    }

    override fun getMovies(onSuccess: (List<MoviesVO>) -> Unit, onFailure: (String) -> Unit) {
        val call = movieApi.getAllMovies()
        call.enqueue(object : Callback<GetMoviesResponse>{
            override fun onFailure(call: Call<GetMoviesResponse>, t: Throwable) {
                onFailure(t.localizedMessage)
            }

            override fun onResponse(
                call: Call<GetMoviesResponse>,
                response: Response<GetMoviesResponse>
            ) {
                val response = response.body()
               if(response != null) {
                   if (response.data != null) {
                       onSuccess(response.data)
                   } else {
                       onFailure(response.message)
                   }
               }else{
                   onFailure(EM_NULL_EVENT_RESPONSE)
               }

            }
        })
    }

}