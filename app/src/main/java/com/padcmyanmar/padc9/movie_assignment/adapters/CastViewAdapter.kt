package com.padcmyanmar.padc9.movie_assignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.padc9.movie_assignment.R
import com.padcmyanmar.padc9.movie_assignment.viewholders.CastItemViewHolder

class CastViewAdapter: RecyclerView.Adapter<CastItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CastItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cast_view,parent,false)
        return CastItemViewHolder(view)
    }

    override fun getItemCount(): Int {
         return 6
    }

    override fun onBindViewHolder(holder: CastItemViewHolder, position: Int) {

    }
}