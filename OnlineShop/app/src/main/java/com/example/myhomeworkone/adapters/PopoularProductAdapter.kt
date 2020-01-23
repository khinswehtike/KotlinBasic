package com.example.myhomeworkone.adapters

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myhomeworkone.R
import com.example.myhomeworkone.model.Latestarrival
import com.example.myhomeworkone.model.Popularproduct
import kotlinx.android.synthetic.main.popular_products.view.*

class PopularProductViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
    var pnew=itemView.findViewById<TextView>(R.id.txtnew)
    var pdiscount=itemView.findViewById<TextView>(R.id.txtdiscount)
    var pmodel=itemView.findViewById<TextView>(R.id.txtpopularmodel)
    var pname=itemView.findViewById<TextView>(R.id.txtname)
    var prating=itemView.findViewById<RatingBar>(R.id.popularrating)
    var pprice=itemView.findViewById<TextView>(R.id.popularprice)
    var pdiscountprice=itemView.findViewById<TextView>(R.id.populardiscountprice)
    var pimage=itemView.findViewById<ImageView>(R.id.imgpopular)
}



class PopoularProductAdapter(var popularList: ArrayList<Popularproduct>):RecyclerView.Adapter<PopularProductViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularProductViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.popular_products,parent,false)
        return PopularProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return popularList.size
    }

    override fun onBindViewHolder(holder: PopularProductViewHolder, position: Int) {
        holder.pnew.text=popularList[position].popularnew
        holder.pname.text=popularList[position].popularname
        holder.pmodel.text=popularList[position].popularmodel
        holder.pdiscount.text="${popularList[position].populardiscount.toString()}%"
        holder.prating.rating=popularList[position].popularrating.toFloat()
        holder.pprice.text="${popularList[position].popularprice.toString()}KS"
        holder.pdiscountprice.text="${popularList[position].populardiscountprice.toString()}KS"
        holder.pimage.setImageResource(popularList[position].popularimage)

    }
}