package com.padcmyanmar.padc9.movie_assignment.persistence.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.padcmyanmar.padc9.movie_assignment.data.vos.MoviesVO
@Dao
abstract class MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertMovies(movies: List<MoviesVO>):LongArray

    @Query("select * from movie")
    abstract fun getMovies(): List<MoviesVO>

    @Query("select * from movie where id= :id")
    abstract fun getMoviesById(id: Int): MoviesVO
}