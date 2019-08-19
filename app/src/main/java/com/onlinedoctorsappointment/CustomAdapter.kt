package com.onlinedoctorsappointment

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.login.view.*

class CustomAdapter (val doctorList: ArrayList<doctor_list>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
    val v = LayoutInflater.from(p0?.context).inflate(R.layout.list, p0, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
    return doctorList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        val list = doctorList[p1]
        p0?.textdoctor?.text = list.doctor_name
        p0?.textspecialty?.text = list.specialty


    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val textdoctor = itemView.findViewById(R.id.textDoctor) as TextView
        val textspecialty = itemView.findViewById(R.id.textspecialty) as TextView
        val imagephoto = itemView.findViewById(R.id.imagePhoto) as ImageView


    }
}