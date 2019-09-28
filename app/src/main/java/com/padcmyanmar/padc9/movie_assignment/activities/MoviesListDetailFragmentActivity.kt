package com.padcmyanmar.padc9.movie_assignment.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.padc9.movie_assignment.R
import com.padcmyanmar.padc9.movie_assignment.adapters.CastViewAdapter
import com.padcmyanmar.padc9.movie_assignment.adapters.ScreenShotAdapter
import com.padcmyanmar.padc9.movie_assignment.data.vos.MoviesVO
import kotlinx.android.synthetic.main.show_movie_list_detail.*

class MoviesListDetailFragmentActivity : BaseActivity() {
    private lateinit var castViewAdapter : CastViewAdapter

    private lateinit var screenShotAdapter: ScreenShotAdapter
    companion object{
        const val EXTRA_TO_MOVIE = "movieIdExtra"
        fun newIntent(context: Context, movieId: Int):Intent{
            return Intent(context, MoviesListDetailFragmentActivity::class.java).apply {
                putExtra(EXTRA_TO_MOVIE, movieId)
            }
        }
    }

    /*val MOVIE_ID= "movie_id"*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.show_movie_list_detail)

         val linearLayoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
         rc_cash.layoutManager = linearLayoutManager

         castViewAdapter = CastViewAdapter()
         rc_cash.adapter = castViewAdapter

         val screenLinearLayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL,false)
         rc_screeshot.layoutManager = screenLinearLayoutManager

         screenShotAdapter = ScreenShotAdapter()
         rc_screeshot.adapter = screenShotAdapter

        val movieId: Int = intent.getIntExtra(EXTRA_TO_MOVIE,0)

        if(movieId != 0){
            val movieVO = movieModel.findMovieById(movieId)
            bindData(movieVO)
        }
    }

    private fun bindData(movieVO: MoviesVO){
       movie_name.text = movieVO.movie_name
    }
}