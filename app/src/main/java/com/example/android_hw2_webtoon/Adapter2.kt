package com.example.android_hw2_webtoon

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class Adapter2(fm : FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> MonFragment()
            1 -> TueFragment()
            2 -> WedFragment()
            3 -> ThurFragment()
            else -> FriFragment()
        }
    }

    override fun getCount() = 5
}