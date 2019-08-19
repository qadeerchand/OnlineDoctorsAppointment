package com.onlinedoctorsappointment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.splash.*

class Splashscreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)


        val splashhome = AnimationUtils.loadAnimation(this,R.anim.splashhome)

        val imageview = findViewById(R.id.imageView) as ImageView
        val splashtextview = findViewById(R.id.splashTextView) as TextView

        imageview.startAnimation(splashhome)
        splashtextview.startAnimation(splashhome)

        btnsplash.setOnClickListener {
            val intent = Intent(this,Splashscreen1::class.java)
            startActivity(intent)
            finish()
        }

        }
    }

