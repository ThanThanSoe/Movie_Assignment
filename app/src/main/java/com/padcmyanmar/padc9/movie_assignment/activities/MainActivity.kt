package com.padcmyanmar.padc9.movie_assignment.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.padcmyanmar.padc9.movie_assignment.R
import com.padcmyanmar.padc9.movie_assignment.adapters.TabPagerAdapter
import com.padcmyanmar.padc9.movie_assignment.dalegates.FragmentDelegates

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity :BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            //setSupportActionBar(toolbar)

            val tabPagerAdapter = TabPagerAdapter(supportFragmentManager)
            viewPager.adapter = tabPagerAdapter
            tablayout.setupWithViewPager(viewPager)

        }

}
