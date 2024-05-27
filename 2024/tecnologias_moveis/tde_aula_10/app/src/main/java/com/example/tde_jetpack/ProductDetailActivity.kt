package com.example.tde_jetpack

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val productBundle = intent.getSerializableExtra("data") as? Product

        val name =  findViewById<TextView>(R.id.tvProductName)
        val price =  findViewById<TextView>(R.id.tvProductPrice)
        val image = findViewById<ImageView>(R.id.imgProduct)

        Glide
            .with(this)
            .load(productBundle?.urlImage)
            .centerCrop()
            .into(image)

        price.text = productBundle?.price
        name.text = productBundle?.name
    }
}