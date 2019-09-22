package com.padcmyanmar.padc9.movie_assignment

import android.app.Application
import com.padcmyanmar.padc9.movie_assignment.data.model.MovieModelImpl

class MovieApp:Application() {
    override fun onCreate() {
        super.onCreate()
        MovieModelImpl.initDatabase(applicationContext)
    }
}