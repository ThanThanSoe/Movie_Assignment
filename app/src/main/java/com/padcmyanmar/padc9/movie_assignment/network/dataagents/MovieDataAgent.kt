package com.padcmyanmar.padc9.movie_assignment.network.dataagents

import com.padcmyanmar.padc9.movie_assignment.data.vos.MoviesVO

interface MovieDataAgent {
    fun getMovies(onSuccess:(List<MoviesVO>) -> Unit, onFailure:(String)-> Unit)
}