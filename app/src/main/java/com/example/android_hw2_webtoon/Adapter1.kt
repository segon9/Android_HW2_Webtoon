package com.example.android_hw2_webtoon

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class Adapter1(fm : FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> WebtoonFragment()
            1 -> BestFragment()
            else -> MyFragment()
        }
    }

    override fun getCount() = 3
}