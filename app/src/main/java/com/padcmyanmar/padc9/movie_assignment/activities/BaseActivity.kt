package com.padcmyanmar.padc9.movie_assignment.activities

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.padcmyanmar.padc9.movie_assignment.data.model.MovieModel
import com.padcmyanmar.padc9.movie_assignment.data.model.MovieModelImpl

abstract class BaseActivity: AppCompatActivity(){
    protected lateinit var movieModel:MovieModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        movieModel = MovieModelImpl
    }
}