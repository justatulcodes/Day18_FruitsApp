package com.example.day18_fruitsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.day18_fruitsapp.data.fruitsList
import com.example.day18_fruitsapp.databinding.ActivityDetailsPageBinding

class DetailsPage : AppCompatActivity() {

    private lateinit var binding : ActivityDetailsPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.setStatusBarColorAndAppearance("#91e8b5", true)

        binding.arrowBack.setOnClickListener {
            finish()
        }

        val index = intent.getIntExtra("position", 0)
        val product = fruitsList.get(index)

        binding.ivFruit.setImageResource(product.imageID)
        binding.tvFruitName.text = product.name
        binding.price.text = product.price.toString()
        binding.tvFruitWeight.text = product.weight.toString() + "g"
        binding.tvFruitBenefit.text = product.keyBenefit
    }
}