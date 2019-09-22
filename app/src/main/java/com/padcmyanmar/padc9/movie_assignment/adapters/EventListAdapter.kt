package com.padcmyanmar.padc9.movie_assignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padc9.movie_assignment.R
import com.padcmyanmar.padc9.movie_assignment.dalegates.EventItemDelegate
import com.padcmyanmar.padc9.movie_assignment.data.vos.MoviesVO
import com.padcmyanmar.padc9.movie_assignment.viewholders.EventItemViewHolder

class EventListAdapter(private val mEventItemDelegate: EventItemDelegate):
    BaseAdapter<EventItemViewHolder, MoviesVO>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.show_movie_list_fragment,parent, false)
        return EventItemViewHolder(itemView, mEventItemDelegate)
    }

}