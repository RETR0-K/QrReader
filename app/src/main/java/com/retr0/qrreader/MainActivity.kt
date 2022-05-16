package com.retr0.qrreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.retr0.qrreader.adapters.ViewPagerAdapter
import com.retr0.qrreader.databinding.ActivityMainBinding
import com.retr0.qrreader.fragments.ReadFragment
import com.retr0.qrreader.fragments.WriteFragment



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(ReadFragment())
        adapter.addFragment(WriteFragment())

        binding.viewPager.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewPager)

        binding.tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_qr_code_scanner_24)
        binding.tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_create_24)
    }

}