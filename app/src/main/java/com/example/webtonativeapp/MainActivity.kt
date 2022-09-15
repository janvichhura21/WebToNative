package com.example.webtonativeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var onBackPressed=0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController= Navigation.findNavController(this,R.id.fragment)
        NavigationUI.setupWithNavController(bottom_nav,navController)
    }

    override fun onBackPressed() {
        if (onBackPressed + 2000 > System.currentTimeMillis()) {
            super.onBackPressed()
        }else{
            Toast.makeText(applicationContext, "Press Again to Exit", Toast.LENGTH_SHORT).show()
        }
        onBackPressed =System.currentTimeMillis()
    }

}