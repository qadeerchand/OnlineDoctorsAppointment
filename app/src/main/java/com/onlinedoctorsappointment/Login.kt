package com.onlinedoctorsappointment

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputEditText
import android.support.design.widget.TextInputLayout
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        this.setTitle("Sign In");


        btn1.setOnClickListener {
            val intent = Intent(this@Login,HomeBottom::class.java)
            startActivity(intent)
        }
        view3.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)

        })

       /* var edittext = findViewById(R.id.edit1) as TextInputEditText
        var edittext1 = findViewById(R.id.edit2) as TextInputEditText
        var btn = findViewById(R.id.btn1) as Button
        btn.setOnClickListener{
            val username = edittext.text;
            val pswrd = edittext1.text;
            Toast.makeText(this@Login,username, Toast.LENGTH_LONG ).show() */
        }
    }
