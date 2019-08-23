package com.onlinedoctorsappointment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.splash.*

class Splashscreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)


        val splashhome = AnimationUtils.loadAnimation(this,R.anim.splashhome)
        val splash_text = AnimationUtils.loadAnimation(this,R.anim.splash_text)
        val btn_start = AnimationUtils.loadAnimation(this,R.anim.btn_start)

        val imageview = findViewById(R.id.imageView) as ImageView
        val splashtextview = findViewById(R.id.splashTextView) as TextView
        val splashtext = findViewById(R.id.nextTextView) as TextView
        val btnstart = findViewById(R.id.btnsplash) as Button

        imageview.startAnimation(splashhome)
        splashtextview.startAnimation(splashhome)
        splashtext.startAnimation(splash_text)
        btnstart.startAnimation(btn_start)

        btnsplash.setOnClickListener {
            val intent = Intent(this,Splashscreen1::class.java)
            startActivity(intent)
            finish()
        }

        }
    }

