package com.padcmyanmar.padc9.movie_assignment.data.model

import com.padcmyanmar.padc9.movie_assignment.data.vos.MoviesVO

object MovieModelImpl: BaseModel(),MovieModel {
    override fun findMovieById(movieId: Int): MoviesVO {
        return database.movieDao().getMoviesById(movieId)
    }

    override fun getAllMovies(onSuccess: (List<MoviesVO>) -> Unit, onFailure: (String) -> Unit) {

        val movieDataFromDB = database.movieDao().getMovies()
        if (movieDataFromDB.isNotEmpty()) {
            onSuccess(movieDataFromDB)
        }else {
            dataAgent.getMovies(
                onSuccess={
                    database.movieDao().insertMovies(it)
                    onSuccess(it)
                },
                onFailure= {

                })
        }

    }
}