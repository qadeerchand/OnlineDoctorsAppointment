package com.onlinedoctorsappointment

import android.app.Dialog
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.profile.*
import kotlinx.android.synthetic.main.signup.*

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)
        this.setTitle("User Profile");

        btnlogout.setOnClickListener {
        showConfirmationDialog()
        }
        btnshare.setOnClickListener {
            showImplicit()
        }
        val bundle:Bundle?=intent.extras
        val user_1=bundle!!.getString("username")
        val phn_1=bundle!!.getString("phon")
        val email_1=bundle!!.getString("mail")
        val pswd_1=bundle!!.getString("pswd")
        val dob_1=bundle!!.getString("dob")
        val gndr_1=bundle!!.getString("gend")
        val gndr_2=bundle!!.getString("gend1")
        filuser.text=user_1
        filphon.text=phn_1
        fil_email.text=email_1
        fil_pswrd.text=pswd_1
        fil_dob2.text=dob_1
        fil_gndr.text=gndr_1
    }

    private fun showConfirmationDialog() {
        var builder=AlertDialog.Builder(this@Profile)
        builder.setTitle("Logout Confirmation")
        builder.setMessage("are you sure you want to logout?")
        builder.setPositiveButton("Yes"){Dialog,which->}
        logout()
        builder.setNegativeButton("No"){Dialog,which ->}
        builder.create().show()
    }

    private fun logout() {
        val intent=Intent(this@Profile,SignUp::class.java)
intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
        finish()
    }
    fun showImplicit() {
        val implicitIntent =Intent()
        implicitIntent.action=Intent.ACTION_SEND
        implicitIntent.putExtra(Intent.EXTRA_TEXT,"where i'm")
        implicitIntent.type="text/plain"
        val intent=Intent.createChooser(implicitIntent,"Share with")
        startActivity(intent)
    }

}



