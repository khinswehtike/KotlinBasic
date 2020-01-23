package com.example.shopapp.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.shopapp.R
import com.example.shopapp.model.LatestModel
import kotlinx.android.synthetic.main.item_latest.view.*

class LatestViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var name=itemView.findViewById<TextView>(R.id.txt_name)
    var image=itemView.findViewById<ImageView>(R.id.imagelatest)
}
class LatestAdapter(var latestList:ArrayList<LatestModel>):RecyclerView.Adapter<LatestViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_latest,parent,false)
        return LatestViewHolder(view)
    }

    override fun getItemCount(): Int {
       return latestList.size
    }

    override fun onBindViewHolder(holder: LatestViewHolder, position: Int) {
        holder.image.setImageResource(latestList[position].image)
        holder.name.text=latestList[position].name
    }

}