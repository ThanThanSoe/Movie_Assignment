package com.padcmyanmar.padc9.movie_assignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.padc9.movie_assignment.R
import com.padcmyanmar.padc9.movie_assignment.viewholders.ScreenShotItemViewHolder

class ScreenShotAdapter:RecyclerView.Adapter<ScreenShotItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScreenShotItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.screen_shot_view,parent,false)
        return ScreenShotItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 6
    }

    override fun onBindViewHolder(holder: ScreenShotItemViewHolder, position: Int) {

    }
}