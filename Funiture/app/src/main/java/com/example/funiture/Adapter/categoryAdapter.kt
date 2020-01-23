package com.example.funiture.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.funiture.R
import com.example.funiture.model.Category
import kotlinx.android.synthetic.main.item_discover.view.*

class CategoryViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var categoryName=itemView.findViewById<TextView>(R.id.name_discover)
    var categoryCount=itemView.findViewById<TextView>(R.id.count_discover)
    var categoryImage=itemView.findViewById<ImageView>(R.id.image_discover)
}
//categorylist constructor
class categoryAdapter(var categoryList: ArrayList<Category>):RecyclerView.Adapter<CategoryViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
       var view=LayoutInflater.from(parent.context).inflate(R.layout.item_discover,parent,false)
        return CategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categoryList.size

    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.categoryName.text=categoryList[position].name
        holder.categoryCount.text=categoryList[position].categoryItemCount.toString()
        holder.categoryImage.setImageResource(categoryList[position].categoryImage)


    }
}