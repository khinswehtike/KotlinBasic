package com.example.recycler.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.R
import com.example.recycler.model.Fruits
import kotlinx.android.synthetic.main.fruit_item.view.*

class FruitViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    var fruitName=itemView.findViewById<TextView>(R.id.fruit_name)
    var image=itemView.findViewById<ImageView>(R.id.img)
    var btncount=itemView.findViewById<Button>(R.id.btncount)
    var txtcount=itemView.findViewById<TextView>(R.id.txtnumber)
    //constructor
    fun  bind(fruits: Fruits, clickListener: OnItemClickListener){
        itemView.setOnClickListener{
            clickListener.OnItemClicked(fruits)
        }
    }
}

//layout input
class FruitAdaper(val fruitlist :ArrayList<Fruits>, val itemClickListener: OnItemClickListener):RecyclerView.Adapter<FruitViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
val view=LayoutInflater.from(parent.context).inflate(R.layout.fruit_item,parent,false)
        return FruitViewHolder(view)
        //function call ->FruitViewHolder(view)
    }

    override fun getItemCount(): Int {
        return fruitlist.size
        //array.size

    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        holder.fruitName.text=fruitlist[position].name
        holder.image.setImageResource(fruitlist[position].image)
        //position is index of array
        holder.btncount.setOnClickListener{
            var count:Int=holder.txtcount.text.toString().toInt()
            count++
            holder.txtcount.text=count.toString()
            //holder.txtcount.text="USD$ ${count.toString()}"
        }
        holder.bind(fruitlist[position],itemClickListener)




    }


}

interface OnItemClickListener{
    fun OnItemClicked(fruits: Fruits)
}