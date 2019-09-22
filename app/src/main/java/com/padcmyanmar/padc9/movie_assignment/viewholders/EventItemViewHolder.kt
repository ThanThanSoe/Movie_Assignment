package com.padcmyanmar.padc9.movie_assignment.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.padcmyanmar.padc9.movie_assignment.dalegates.EventItemDelegate
import com.padcmyanmar.padc9.movie_assignment.data.vos.MoviesVO
import kotlinx.android.synthetic.main.show_movie_list_fragment.view.*

class EventItemViewHolder(itemView: View, private val delegate: EventItemDelegate):
BaseViewHolder<MoviesVO>(itemView){

    init {
        itemView.setOnClickListener{
            val id = data?.id
            if(id != null){
                delegate.onTapEventItem(id)
            }

        }
    }
    override fun bindData(data: MoviesVO) {
        itemView.movie_name.text = data.movie_name
        itemView.imdb.text = data.imdb.toString()
        itemView.rotten_tomato.text = data.rotten_tomato.toString()
        itemView.meta_centric.text = data.meta_centric.toString()
        Glide.with(itemView).load(data.poster).into(itemView.poster)

    }
}