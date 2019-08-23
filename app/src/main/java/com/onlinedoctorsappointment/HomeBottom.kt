package com.onlinedoctorsappointment

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.widget.TextView
import com.onlinedoctorsappointment.R.*
import kotlinx.android.synthetic.main.activity_home_bottom.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeBottom : AppCompatActivity() {


    val manager = supportFragmentManager


    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            id.navigation_home -> {
                addHomeBottom()
                return@OnNavigationItemSelectedListener true
            }
            id.navigation_find_doctor -> {
                addFindDoctor()
                return@OnNavigationItemSelectedListener true
            }
            id.navigation_Find_Hostpital -> {
                addFindHostpital()
                return@OnNavigationItemSelectedListener true
            }
            id.navigation_pharmacy -> {
                addPharmacy()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }


    private fun addHomeBottom() {
        val transaction = manager.beginTransaction()
        val fragment = HomeFragment()
        transaction.replace(id.fragment_container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun addFindDoctor() {
        val transaction = manager.beginTransaction()
        val fragment = FindDoctor_Fragment()
        transaction.replace(id.fragment_container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    private fun addFindHostpital() {
        val transaction = manager.beginTransaction()
        val fragment = FindHostpital_Fragment()
        transaction.replace(id.fragment_container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
    private fun addPharmacy() {
        val transaction = manager.beginTransaction()
        val fragment = PharmacyFragment()
        transaction.replace(id.fragment_container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_home_bottom)


        addHomeBottom()
        val navView: BottomNavigationView = findViewById(id.btm_nav)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)


        }



    }


