package com.example.tde_jetpack.presentation.domain.model

import java.io.Serializable

data class Product(val urlImage: String, val name: String, val description: String,val price: String) : Serializable
