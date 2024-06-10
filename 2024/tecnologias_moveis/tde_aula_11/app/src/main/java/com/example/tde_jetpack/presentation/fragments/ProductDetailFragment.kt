package com.example.tde_jetpack.presentation.fragments

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.tde_jetpack.presentation.domain.model.Product
import com.example.tde_jetpack.R
import com.example.tde_jetpack.presentation.commons.extensions.configureToolbar
import com.example.tde_jetpack.presentation.commons.extensions.convertToManyWithSymbol
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProductDetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_product_detail, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val productBundle = arguments?.getSerializable("product", Product::class.java)

        (requireActivity() as AppCompatActivity).configureToolbar("Detalhe", true)

        activity?.findViewById<BottomNavigationView>(R.id.bottomNavigation)?.visibility = View.GONE

        val name = view.findViewById<TextView>(R.id.tvProductName)
        val price = view.findViewById<TextView>(R.id.tvProductPrice)
        val image = view.findViewById<ImageView>(R.id.imgProduct)

        price.text = productBundle?.price?.convertToManyWithSymbol()
        name.text = productBundle?.name

        Glide
            .with(this)
            .load(productBundle?.urlImage)
            .centerCrop()
            .into(image)
    }
}