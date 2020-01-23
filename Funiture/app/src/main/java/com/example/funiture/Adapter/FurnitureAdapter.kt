package com.example.funiture.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.funiture.R
import com.example.funiture.model.Furniture
import kotlinx.android.synthetic.main.item_trending.*

class FunitureViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var name=itemView.findViewById<TextView>(R.id.name_trending)
    var pric=itemView.findViewById<TextView>(R.id.price_tranding)
    var image=itemView.findViewById<ImageView>(R.id.image_trending)
}

class FurnitureAdapter(var furniturelist:ArrayList<Furniture>) :RecyclerView.Adapter<FunitureViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FunitureViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_trending,parent,false)
        return FunitureViewHolder(view)
    }

    override fun getItemCount(): Int {

      return furniturelist.size
    }

    override fun onBindViewHolder(holder: FunitureViewHolder, position: Int) {
        holder.name.text=furniturelist[position].name
        holder.pric.text=furniturelist[position].price.toString()
        holder.image.setImageResource(furniturelist[position].image)
    }
}