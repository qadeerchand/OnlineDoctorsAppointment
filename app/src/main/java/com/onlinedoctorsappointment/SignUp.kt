package com.onlinedoctorsappointment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.view.ViewDebug
import android.widget.ArrayAdapter
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.signup.*

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)
        this.setTitle("Sign Up");

       btnsignup.setOnClickListener {

           val user: String =editinputuser.text.toString()
           val phn: String =editinputphone.text.toString()
           val email: String =editinputemail.text.toString()
           val pass: String =editinputpass.text.toString()
           val bd: String =editinputBD.text.toString()
          val gndr: String =male.text.toString()
           val gndr1: String =Female.text.toString()
           val explicitIntent = Intent(this@SignUp, Profile::class.java)
           explicitIntent.putExtra("username",user)
           explicitIntent.putExtra("phon",phn)
           explicitIntent.putExtra("mail",email)
           explicitIntent.putExtra("pswd",pass)
           explicitIntent.putExtra("dob",bd)
           explicitIntent.putExtra("gend",gndr)
           explicitIntent.putExtra("gend1",gndr1)
           explicitIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
           startActivity(explicitIntent)
           finish()
       }

    }

}


