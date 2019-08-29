package com.onlinedoctorsappointment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Spinner


class FindDoctor_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val myView = inflater.inflate(R.layout.activity_find_doctor, container, false)

        val spinner : Spinner = myView.findViewById(R.id.spinner1)

            spinner.setOnClickListener {
                val fragmentManager = activity!!.supportFragmentManager
                fragmentManager.beginTransaction().replace(R.id.fragment_container, FindHostpital_Fragment()).commit()
            }
            return myView
    }


}
