package com.example.myhomeworkone.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myhomeworkone.R
import com.example.myhomeworkone.model.Countrylist
import com.example.myhomeworkone.model.Latestarrival
import kotlinx.android.synthetic.main.choose_country.view.*

class chooseCoountryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var imgcountry=itemView.findViewById<ImageView>(R.id.img_coountry)
    var txtcountry=itemView.findViewById<TextView>(R.id.txtcountry)
}
class ChooseCountryAdapter  (var countrylist: ArrayList<Countrylist>):RecyclerView.Adapter<chooseCoountryViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): chooseCoountryViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.choose_country,parent,false)
        return chooseCoountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countrylist.size

    }

    override fun onBindViewHolder(holder: chooseCoountryViewHolder, position: Int) {
        holder.imgcountry.setImageResource(countrylist[position].imgcountry)
        holder.txtcountry.text=countrylist[position].txtcoountry

    }
}