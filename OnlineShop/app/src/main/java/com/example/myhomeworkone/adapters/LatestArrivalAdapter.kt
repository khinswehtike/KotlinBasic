package com.example.myhomeworkone.adapters

import android.media.Rating
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myhomeworkone.R
import com.example.myhomeworkone.model.Latestarrival
import com.example.myhomeworkone.model.Mainitem
import kotlinx.android.synthetic.main.latest_arrival.view.*

class ArrivalViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
    var arrivalimg=itemView.findViewById<ImageView>(R.id.img_arrival)
    var arrivalname=itemView.findViewById<TextView>(R.id.arrival_name)
    var arrivalcode=itemView.findViewById<TextView>(R.id.code)
    var arrivalbrand=itemView.findViewById<TextView>(R.id.brand)
    var arrivalrating=itemView.findViewById<RatingBar>(R.id.rating)
    var arrivalprie=itemView.findViewById<TextView>(R.id.arrivaldiscountprice)
}
class LatestArrivalAdapter (var arrivalList: ArrayList<Latestarrival>):RecyclerView.Adapter<ArrivalViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArrivalViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.latest_arrival,parent,false)
        return ArrivalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrivalList.size
    }

    override fun onBindViewHolder(holder: ArrivalViewHolder, position: Int) {
        holder.arrivalimg.setImageResource(arrivalList[position].arrivalimg)
        holder.arrivalname.text=arrivalList[position].arrivalname
        holder.arrivalcode.text=arrivalList[position].arrivalcode
        holder.arrivalbrand.text=arrivalList[position].arrivalbrand
        holder.arrivalprie.text="${arrivalList[position].arrivalprice.toString()}KS"
        holder.arrivalrating.rating=arrivalList[position].arrivalrating.toFloat()

    }

}