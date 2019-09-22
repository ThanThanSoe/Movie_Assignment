package com.padcmyanmar.padc9.movie_assignment.adapters

import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.padcmyanmar.padc9.movie_assignment.fragments.NowShowingFragment

class TabPagerAdapter(val fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        if(position == 0){
            return NowShowingFragment()
        }else if(position == 1){
            return  NowShowingFragment()
        }else{
            return NowShowingFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        if(position == 0){
            return "Now Showing"
        }else if(position == 1){
            return "Cinema"
        }else{
            return "Comming Soon"
        }
    }
}