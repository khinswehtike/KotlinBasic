package com.example.funiture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.funiture.Adapter.FunitureViewHolder
import com.example.funiture.Adapter.FurnitureAdapter
import com.example.funiture.Adapter.categoryAdapter
import com.example.funiture.model.Category
import com.example.funiture.model.Furniture

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        categoryView()
        trendingView()
        bestSellingview()

    }
    fun categoryView(){
        var categoryRecyclerView: RecyclerView = findViewById(R.id.recycler_discover)
        var categoryList = ArrayList<Category>()
        categoryList.add(Category("Chairs", 222, R.drawable.s1))
        categoryList.add(Category("Chairs", 222, R.drawable.s3))
        categoryList.add((Category("Tables", 12, R.drawable.t1)))
        var categoryAdapter = categoryAdapter(categoryList)
        categoryRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        categoryRecyclerView.adapter = categoryAdapter
    }
    fun trendingView(){
        var trendingRecyclerView:RecyclerView=findViewById(R.id.recycler_trending)
        var trandinglist=ArrayList<Furniture>()
        trandinglist.add(Furniture("Chair,White",2000.00,R.drawable.s2))
        trandinglist.add(Furniture("Seat,Black",3000.00,R.drawable.s3))
        trandinglist.add(Furniture("Seat,White",1200.00,R.drawable.s4))
        var trendingAdapter=FurnitureAdapter(trandinglist)
        trendingRecyclerView.adapter=trendingAdapter
        trendingRecyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


    }
    fun bestSellingview(){
        var bestsellingRecycler:RecyclerView=findViewById(R.id.recycler_selling)
        var bestsellinglest=ArrayList<Furniture>()
        bestsellinglest.add(Furniture("Chair",300.00,R.drawable.s4))
        bestsellinglest.add(Furniture("Chair",300.00,R.drawable.s3))
        bestsellinglest.add(Furniture("Chair",300.00,R.drawable.s1))
        var bestselliingAdapter=FurnitureAdapter(bestsellinglest)
        bestsellingRecycler.adapter=bestselliingAdapter
        bestsellingRecycler.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

    }


}
