package com.padcmyanmar.padc9.movie_assignment.data.model

import android.content.Context
import com.padcmyanmar.padc9.movie_assignment.network.dataagents.RetroFitAgent
import com.padcmyanmar.padc9.movie_assignment.persistence.MovieDB

open class BaseModel {
    protected val dataAgent = RetroFitAgent

    protected lateinit var database: MovieDB

    fun initDatabase(context: Context){
        database = MovieDB.getInstance(context)
    }
}