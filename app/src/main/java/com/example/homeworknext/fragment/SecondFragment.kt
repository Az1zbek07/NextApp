package com.example.homeworknext.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.homeworknext.MainActivity
import com.example.homeworknext.R
import com.example.homeworknext.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val activity = (activity as MainActivity)
        val viewPager: ViewPager2 = activity.findViewById(R.id.viewPager)

        binding.textSkip.setOnClickListener {
            viewPager.currentItem = 2
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}