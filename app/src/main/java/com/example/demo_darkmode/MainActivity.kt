package com.example.demo_darkmode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {
    private lateinit var switch: SwitchCompat
    override fun onCreate(savedInstanceState: Bundle?) {
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_NO) {
            setTheme(R.style.Theme_Custom_Light)
        } else {
            setTheme(R.style.Theme_Custom_Dark)
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //requestWindowFeature(Window.FEATURE_NO_TITLE)

        switch = findViewById(R.id.switchDarkMode)
        switch.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (isChecked) {
                // Light Mode
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            } else {
                // Dark Mode
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
        }
    }
}
