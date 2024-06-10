package com.example.tde_jetpack.presentation.commons.extensions

import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.configureToolbar(title: String, enableBackButton: Boolean){
    supportActionBar?.apply {
        this.title = title
        setDisplayHomeAsUpEnabled(enableBackButton)
    }
}


