package com.onlinedoctorsappointment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.splash.*

class Splashscreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        btnsplash.setOnClickListener {
            val intent = Intent(this,Splashscreen1::class.java)
            startActivity(intent)
            finish()
        }

        }
    }

