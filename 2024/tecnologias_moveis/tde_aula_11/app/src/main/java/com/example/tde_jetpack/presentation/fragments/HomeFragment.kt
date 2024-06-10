package com.example.tde_jetpack.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.tde_jetpack.presentation.adapters.ProductAdapter
import com.example.tde_jetpack.R
import com.example.tde_jetpack.presentation.viewmodel.ProductViewModel

class HomeFragment : Fragment() {
    private lateinit var productAdapter: ProductAdapter
    private lateinit var mainViewModel: ProductViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mainViewModel = ViewModelProvider(this)[ProductViewModel::class.java]

        val recycler = view.findViewById<RecyclerView>(R.id.recyclerView)

        val listOfProducts = mainViewModel.getProducts()
        productAdapter = ProductAdapter(listOfProducts) {
            val bundle = bundleOf("data" to it)
            findNavController().navigate(R.id.action_homeFragment_to_productDetailActivity, bundle)
        }

        recycler.adapter = productAdapter
    }
}