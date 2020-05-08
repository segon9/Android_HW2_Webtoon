package com.example.android_hw2_webtoon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_viewPager.adapter = Adapter2(supportFragmentManager)
        main_viewPager.offscreenPageLimit = 4
        main_viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                //네비게이션 메뉴 아이템 체크
                topNavigationView.menu.getItem(position).isChecked = true
            }

        })

        topNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.monday -> main_viewPager.currentItem = 0
                R.id.tuesday -> main_viewPager.currentItem = 1
                R.id.wednesday -> main_viewPager.currentItem = 2
                R.id.thursday -> main_viewPager.currentItem = 3
                R.id.friday -> main_viewPager.currentItem = 4
            }
            true
        }



//        sub_viewPager.adapter = Adapter1(supportFragmentManager)
//        sub_viewPager.offscreenPageLimit = 2
//
//
//        bottomNavigationView.setOnNavigationItemSelectedListener {
//            when(it.itemId) {
//                R.id.menu_webtoon -> sub_viewPager.currentItem = 0
//                R.id.menu_best -> sub_viewPager.currentItem = 1
//                R.id.menu_my -> sub_viewPager.currentItem = 2
//
//
//            }
//            true
//        }
    }
}
