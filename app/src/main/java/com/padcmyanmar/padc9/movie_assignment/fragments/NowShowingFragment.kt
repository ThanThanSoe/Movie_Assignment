package com.padcmyanmar.padc9.movie_assignment.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.padc9.movie_assignment.R
import com.padcmyanmar.padc9.movie_assignment.activities.MoviesListDetailFragmentActivity
import com.padcmyanmar.padc9.movie_assignment.adapters.EventListAdapter
import com.padcmyanmar.padc9.movie_assignment.dalegates.EventItemDelegate
import com.padcmyanmar.padc9.movie_assignment.data.vos.MoviesVO
import kotlinx.android.synthetic.main.now_showing.*

class NowShowingFragment: BaseFragment(), EventItemDelegate {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.now_showing,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var adapter = EventListAdapter(this)
        LinearSnapHelper().attachToRecyclerView(rvMovies)

        val layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL,false)
        rvMovies.layoutManager = layoutManager

        movieModel.getAllMovies(
            onSuccess = {moviesVO ->
                adapter.setNewData(moviesVO as MutableList<MoviesVO>)
                rvMovies.adapter = adapter
            },
            onFailure = {

            }
        )
    }

    override fun onTapEventItem(movieId: Int) {
        //startActivity(Intent(this.context,MoviesListDetailFragmentActivity::class.java))
        startActivity(MoviesListDetailFragmentActivity.newIntent(context!!,movieId))
    }

}