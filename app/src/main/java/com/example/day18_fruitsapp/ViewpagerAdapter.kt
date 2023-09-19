package com.example.day18_fruitsapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.day18_fruitsapp.AllFruits
import com.example.day18_fruitsapp.HotFruits
import com.example.day18_fruitsapp.NewFruits


class ViewPagerAdapter(
    fm: FragmentManager
) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        if (position == 0) fragment = HotFruits() else if (position == 1) fragment =
            NewFruits() else if (position == 2) fragment = AllFruits()
        return fragment!!
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        if (position == 0) title = "HOT" else if (position == 1) title =
            "NEW" else if (position == 2) title = "ALL"
        return title
    }
}
