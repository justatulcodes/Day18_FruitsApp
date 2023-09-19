package com.example.day18_fruitsapp.data

import com.example.day18_fruitsapp.R

class Fruit (
    val name: String,
    val imageID: Int,
    val weight: Int,
    val price: Float,
    val details: String,
    val description: String,
    val keyBenefit: String
)

val fruitsList = listOf(
    Fruit(
        name = "Avocado",
        imageID = R.drawable.avocado,
        weight = 230,
        price = 13.4f,
        details = "Avocado is a nutrient-rich fruit...",
        description = "Avocado is a creamy and nutritious fruit...",
        keyBenefit = "Anti-aging"
    ),
    Fruit(
        name = "Coconut",
        imageID = R.drawable.cocunut,
        weight = 500,
        price = 2.5f,
        details = "Coconut is a versatile fruit...",
        description = "Coconut is known for its refreshing water and...",
        keyBenefit = "Hydration"
    ),
    Fruit(
        name = "Green Apple",
        imageID = R.drawable.green_apple,
        weight = 150,
        price = 0.8f,
        details = "Green apples are crisp and...",
        description = "Green apples are known for their bright color...",
        keyBenefit = "Digestion"
    ),
    Fruit(
        name = "Kiwi",
        imageID = R.drawable.kiwi,
        weight = 50,
        price = 1.2f,
        details = "Kiwi is a small, flavorful fruit...",
        description = "Kiwi is packed with vitamin C and...",
        keyBenefit = "Immunity"
    ),
    Fruit(
        name = "Pineapple",
        imageID = R.drawable.pineapple,
        weight = 800,
        price = 3.0f,
        details = "Pineapple is a tropical fruit...",
        description = "Pineapple is known for its sweet and tangy flavor...",
        keyBenefit = "Digestion"
    ),
    Fruit(
        name = "Pear",
        imageID = R.drawable.pear,
        weight = 180,
        price = 1.5f,
        details = "Pear is a juicy and delicious fruit...",
        description = "Pear is a good source of dietary fiber...",
        keyBenefit = "Heart health"
    ),
    Fruit(
        name = "Lime",
        imageID = R.drawable.lime,
        weight = 30,
        price = 0.5f,
        details = "Lime is a sour and aromatic fruit...",
        description = "Lime adds a burst of flavor to various dishes...",
        keyBenefit = "Vitamin C"
    )
)
