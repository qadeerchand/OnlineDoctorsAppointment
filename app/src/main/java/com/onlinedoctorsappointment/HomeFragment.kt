package com.onlinedoctorsappointment


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentContainer
import android.support.v4.app.FragmentTransaction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.activity_find_doctor.*
import kotlinx.android.synthetic.main.activity_home_bottom.*
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(){



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val myView= inflater.inflate(R.layout.fragment_home, container, false)

        val btnDoctor: Button = myView.findViewById(R.id.btn_doctor)
        val btnHostpital: Button = myView.findViewById(R.id.btn_hospital)
        val btnAppointment: Button= myView.findViewById(R.id.btn_appointment)
        btnDoctor.setOnClickListener {
            val fragmentManager = activity!!.supportFragmentManager
            fragmentManager.beginTransaction().replace(R.id.fragment_container, FindDoctor_Fragment()).commit()
        }
        btnHostpital.setOnClickListener {
            val fragmentManager = activity!!.supportFragmentManager
            fragmentManager.beginTransaction().replace(R.id.fragment_container, FindHostpital_Fragment()).commit()
        }
        btnAppointment.setOnClickListener {
            val fragmentManager = activity!!.supportFragmentManager
            fragmentManager.beginTransaction().replace(R.id.fragment_container, AppointmentFragment()).commit()
        }

        return myView
    }


}



