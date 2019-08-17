package com.onlinedoctorsappointment

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class HomeBottom : AppCompatActivity() {


    val manager = supportFragmentManager


    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                addHomeBottom()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_find_doctor -> {
                addFindDoctor()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_Find_Hostpital -> {
                addFindHostpital()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_pharmacy -> {
                addPharmacy()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }


    private fun addHomeBottom() {
        val transaction = manager.beginTransaction()
        val fragment = HomeFragment()
        transaction.replace(R.id.fragment_container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun addFindDoctor() {
        val transaction = manager.beginTransaction()
        val fragment = FindDoctor_Fragment()
        transaction.replace(R.id.fragment_container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    private fun addFindHostpital() {
        val transaction = manager.beginTransaction()
        val fragment = FindHostpital_Fragment()
        transaction.replace(R.id.fragment_container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    private fun addPharmacy() {
        val transaction = manager.beginTransaction()
        val fragment = PharmacyFragment()
        transaction.replace(R.id.fragment_container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_bottom)
        addHomeBottom()
        val navView: BottomNavigationView = findViewById(R.id.btm_nav)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}

