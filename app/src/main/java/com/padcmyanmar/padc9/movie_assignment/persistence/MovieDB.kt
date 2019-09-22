package com.padcmyanmar.padc9.movie_assignment.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.padcmyanmar.padc9.movie_assignment.data.vos.MoviesVO
import com.padcmyanmar.padc9.movie_assignment.persistence.daos.MovieDao
import com.padcmyanmar.padc9.movie_assignment.persistence.typeconverters.GenreTypeConverter
import com.padcmyanmar.padc9.movie_assignment.utils.MOVIE_DB

@Database(entities = arrayOf(MoviesVO::class), version = 1, exportSchema = false)
@TypeConverters(GenreTypeConverter::class)
abstract class MovieDB: RoomDatabase() {
    abstract fun movieDao(): MovieDao

    companion object{
        var INSTANCE: MovieDB? = null

        fun getInstance(context: Context): MovieDB{
            if (INSTANCE == null){
                INSTANCE = Room.databaseBuilder(context, MovieDB::class.java, MOVIE_DB)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return INSTANCE!!
        }
    }

    fun areDatasExitInDB(): Boolean{
        return movieDao().getMovies().isNotEmpty()
    }
}