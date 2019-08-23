package com.onlinedoctorsappointment

import android.app.Dialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.profile.*
import kotlinx.android.synthetic.main.signup.*

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)
        this.setTitle("Doctors");

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)

        val lists = ArrayList<doctor_list>()

        lists.add(doctor_list("Dr.Suleman Fakih","General Surgeon"))
        lists.add(doctor_list("Dr.Shazia Roman","Gynaecologist"))
        lists.add(doctor_list("Dr.Ihsan","Child Specialist"))
        lists.add(doctor_list("Dr.Furqan","Heart Surgeon"))
        lists.add(doctor_list("Dr.Qadeer","Dentist"))
        lists.add(doctor_list("Dr.Suleman Fakih","General Surgeon"))
        lists.add(doctor_list("Dr.Suleman Fakih","General Surgeon"))
        lists.add(doctor_list("Dr.Shazia Roman","Gynaecologist"))
        lists.add(doctor_list("Dr.Ihsan","Child Specialist"))
        lists.add(doctor_list("Dr.Furqan","Heart Surgeon"))
        lists.add(doctor_list("Dr.Qadeer","Dentist"))
        lists.add(doctor_list("Dr.Suleman Fakih","General Surgeon"))

        val adapter = CustomAdapter(lists)

        recyclerView.adapter = adapter



    }

}



