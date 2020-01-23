package com.example.myhomeworkone.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myhomeworkone.R
import com.example.myhomeworkone.model.Mainitem

import kotlinx.android.synthetic.main.main_item.view.*

class MainItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var mainimg=itemView.findViewById<ImageView>(R.id.image_one)
    var mainname=itemView.findViewById<TextView>(R.id.mainname)
    var maindisc=itemView.findViewById<TextView>(R.id.maindiscription)
}
class MainitemAdapter(var mainitemList: ArrayList<Mainitem>):RecyclerView.Adapter<MainItemViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainItemViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.main_item,parent,false)
        return MainItemViewHolder(view)

    }

    override fun getItemCount(): Int {
        return mainitemList.size

    }

    override fun onBindViewHolder(holder: MainItemViewHolder, position: Int) {
        holder.mainimg.setImageResource(mainitemList[position].imgmain)
        holder.mainname.text=mainitemList[position].mainname
        holder.maindisc.text=mainitemList[position].maindiscription

    }

}