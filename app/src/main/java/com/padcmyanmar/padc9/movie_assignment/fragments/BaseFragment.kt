package com.padcmyanmar.padc9.movie_assignment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.padcmyanmar.padc9.movie_assignment.data.model.MovieModel
import com.padcmyanmar.padc9.movie_assignment.data.model.MovieModelImpl

abstract class BaseFragment: Fragment() {
    protected lateinit var movieModel: MovieModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        movieModel = MovieModelImpl
    }
}