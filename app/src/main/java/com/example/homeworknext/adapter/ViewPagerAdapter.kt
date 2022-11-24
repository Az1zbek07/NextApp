package com.example.homeworknext.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.homeworknext.fragment.FirstFragment
import com.example.homeworknext.fragment.SecondFragment
import com.example.homeworknext.fragment.ThirdFragment

class ViewPagerAdapter(
    manager: FragmentManager,
    lifecycle: Lifecycle
): FragmentStateAdapter(manager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            else -> FirstFragment()
        }
    }
}