package com.example.tde_jetpack


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.tde_jetpack.presentation.commons.extensions.configureToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val menuBottom = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)

        setSupportActionBar(toolbar)

        NavigationUI.setupWithNavController(menuBottom, navController)
        configureToolbar("Home", false)
    }
}