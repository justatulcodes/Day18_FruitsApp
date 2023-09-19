package com.example.day18_fruitsapp

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowInsetsControllerCompat
import com.example.day18_fruitsapp.adapter.ProductItemsAdapter
import com.example.day18_fruitsapp.data.fruitsList
import com.example.day18_fruitsapp.databinding.ActivityMainBinding

//https://dribbble.com/shots/6798936-Food-fruits/attachments/6798936-Food-fruits?mode=media

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        binding.viewPager.adapter = viewPagerAdapter

        binding.tablayout.setupWithViewPager(binding.viewPager)

        this.setStatusBarColorAndAppearance("#ffffff", true)

        val adapter = ProductItemsAdapter(fruitsList)
        adapter.setOnClickListener(object : ProductItemsAdapter.OnClickListener{
            override fun onClick(position: Int) {
                val intent = Intent(this@MainActivity, DetailsPage::class.java)
                intent.putExtra("position", position)
                startActivity(intent)
            }

        })

        binding.rvProductList.adapter = adapter
    }


}