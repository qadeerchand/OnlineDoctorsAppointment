package com.onlinedoctorsappointment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.Toast
import com.rbddevs.splashy.Splashy

class SplashHome : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_home)
        setSplashy()

    }

    private fun setSplashy() {
        val intent = Intent(this@SplashHome, HomeBottom::class.java)
        startActivity(intent)
        finish()
        Splashy(this)
            .setLogo(R.drawable.doctor)
            .setTitle("Digi Doc")
            .setTitleColor("#FFFFFF")
            .setSubTitle("Be Healthy")
            .setProgressColor(R.color.white)
            .setBackgroundResource(R.color.colorPrimaryDark)
            .setFullScreen(true)
            .setTime(3000)
            .showProgress(true)
            .setAnimation(Splashy.Animation.SLIDE_IN_TOP_BOTTOM,800)
            .show()

    }


}
