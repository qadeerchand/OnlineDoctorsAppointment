package com.onlinedoctorsappointment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_find_doctor.*

class FindDoctor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_doctor)



        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Find Doctor"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
        // Create an ArrayAdapter
        val adapter = ArrayAdapter.createFromResource(this,
            R.array.doctor_list, android.R.layout.simple_spinner_item)
        // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Apply the adapter to the spinner
       // spinner.adapter = adapter

    }


    }

