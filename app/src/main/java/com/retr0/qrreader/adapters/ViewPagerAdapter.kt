package com.retr0.qrreader.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(suppFragmentManager: FragmentManager) : FragmentPagerAdapter(suppFragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val mFragmentList = mutableListOf<Fragment>()

    override fun getCount(): Int = mFragmentList.size

    override fun getItem(position: Int): Fragment = mFragmentList[position]

    fun addFragment(fragment: Fragment) = mFragmentList.add(fragment)
}