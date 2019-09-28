package com.padcmyanmar.padc9.movie_assignment.data.model

import android.hardware.camera2.CaptureFailure
import com.padcmyanmar.padc9.movie_assignment.data.vos.MoviesVO

interface MovieModel {
    fun getAllMovies(onSuccess:(List<MoviesVO>)->Unit, onFailure: (String)->Unit)
    fun findMovieById(movieId: Int) :MoviesVO
}