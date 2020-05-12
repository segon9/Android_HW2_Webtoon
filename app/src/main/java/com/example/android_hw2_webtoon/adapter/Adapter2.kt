package com.example.android_hw2_webtoon.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.android_hw2_webtoon.frag.*

class Adapter2(fm : FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> MonFragment()
            1 -> TueFragment()
            2 -> WedFragment()
            3 -> ThurFragment()
            4 -> FriFragment()
            5 -> fragment_sat()
            6 -> fragment_sun()
            else -> fragment_end()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {return "월"}
            1 -> {return "화"}
            2 -> {return "수"}
            3 -> {return "목"}
            4 -> {return "금"}
            5 -> {return "토"}
            6 -> {return "일"}
            else -> {return "완결"}
        }
        return super.getPageTitle(position)
    }

    override fun getCount() = 8
}