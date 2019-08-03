package com.onlinedoctorsappointment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_doctor.setOnClickListener {
            val intent = Intent(this@Home,FindDoctor::class.java)
            startActivity(intent)
        }


    }
    }
