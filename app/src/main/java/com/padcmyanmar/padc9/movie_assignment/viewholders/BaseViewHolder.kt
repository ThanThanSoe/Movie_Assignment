package com.padcmyanmar.padc9.movie_assignment.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView){
    var data: T? = null
        set(value) {
            field = value

            //non_null data pass to bind with views
            if(value != null){
                bindData(value)
            }
        }

    protected abstract fun bindData(data: T)
}