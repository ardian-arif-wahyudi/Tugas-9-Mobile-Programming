package com.ardian.tugas9layoutmovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ardian.tugas9layoutmovie.fragments.MovieFragment
import com.ardian.tugas9layoutmovie.fragments.TvShowFragment
import com.example.tugas9layoutmovie.R

class MainActivity : AppCompatActivity() {

    private val movieFragment = MovieFragment()
    private val tvShowFragment = TvShowFragment()
    private val profileFragment = ProfileFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceFragment(MovieFragment())

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_movie -> replaceFragment(movieFragment)
                R.id.navigation_tvshow -> replaceFragment(tvShowFragment)
                R.id.navigation_profile -> replaceFragment(profileFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {

        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_layout, fragment)
            transaction.commit()
        }
    }

}