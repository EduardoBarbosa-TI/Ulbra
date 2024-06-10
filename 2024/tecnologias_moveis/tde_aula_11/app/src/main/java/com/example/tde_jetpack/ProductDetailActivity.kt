package com.example.tde_jetpack

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.tde_jetpack.presentation.commons.extensions.configureToolbar
import com.example.tde_jetpack.presentation.domain.model.Product

class ProductDetailActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val productBundle = intent.getSerializableExtra("data") as? Product

        val name =  findViewById<TextView>(R.id.tvProductName)
        val description = findViewById<TextView>(R.id.tvProductDescription)
        val price =  findViewById<TextView>(R.id.tvProductPrice)
        val image = findViewById<ImageView>(R.id.imgProduct)

        price.text = productBundle?.price
        name.text = productBundle?.name
        description.text = productBundle?.description

        Glide
            .with(this)
            .load(productBundle?.urlImage)
            .centerCrop()
            .into(image)

        configureToolbar("Product detail", false)
    }
}