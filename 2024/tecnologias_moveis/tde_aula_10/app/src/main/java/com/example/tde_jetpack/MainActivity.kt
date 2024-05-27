package com.example.tde_jetpack

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recyclerView)

        val listOfProducts = mainViewModel.getProducts()
        val adapter = ProductAdapter(listOfProducts, ::goToDetail)

        recycler.adapter = adapter
    }

    private fun goToDetail(item: Product) {
        Intent(this, ProductDetailActivity::class.java).apply {
            putExtra("data", item)
            startActivity(this)
        }
    }
}