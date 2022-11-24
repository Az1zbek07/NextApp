package com.example.homeworknext

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.homeworknext.adapter.ViewPagerAdapter
import com.example.homeworknext.databinding.ActivityMainBinding
import com.zhpan.indicator.enums.IndicatorSlideMode

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.viewPager.adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        binding.indicator.apply {
            setSliderColor(Color.GRAY, Color.WHITE)
            setSliderWidth(30f)
            setSliderHeight(30f)
            setSlideMode(IndicatorSlideMode.COLOR)
            setPageSize(3)
            notifyDataChanged()
        }
        binding.indicator.setupWithViewPager(binding.viewPager)
        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                window.statusBarColor = Color.parseColor("#092F4C")
            }
        })
    }

    override fun onBackPressed() {
        if (binding.viewPager.currentItem == 0){
            super.onBackPressed()
        } else{
            binding.viewPager.currentItem = 0
        }
    }
}