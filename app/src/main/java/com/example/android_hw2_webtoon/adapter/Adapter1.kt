package com.example.android_hw2_webtoon.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.android_hw2_webtoon.frag.BestFragment
import com.example.android_hw2_webtoon.frag.MyFragment
import com.example.android_hw2_webtoon.frag.WebtoonFragment

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