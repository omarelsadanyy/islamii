package com.example.new_islamii.ui.Home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.new_islamii.R
import com.example.new_islamii.ui.Home.fragments.HadethFragment
import com.example.new_islamii.ui.Home.fragments.QuranFragment
import com.example.new_islamii.ui.Home.fragments.RadioFragment
import com.example.new_islamii.ui.Home.fragments.SebhaFragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class Homeactivity : AppCompatActivity() {
    lateinit var bottom: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeactivity)
        bottom = findViewById(R.id.bottom_navigation_bar)
        bottom.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.navigation_quran) {
                pushfragment(QuranFragment())
            } else if (item.itemId == R.id.navigation_hadeth) {
                pushfragment(HadethFragment())

            } else if (item.itemId == R.id.navigation_sebha) {
                pushfragment(SebhaFragment())

            } else if (item.itemId == R.id.navigation_radio) {
                pushfragment(RadioFragment())

            }
            return@setOnItemSelectedListener true;
        }
        bottom.selectedItemId = R.id.navigation_quran

    }

    private fun pushfragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}