package com.example.recycler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.adapter.FruitAdaper
import com.example.recycler.adapter.OnItemClickListener
import com.example.recycler.model.Fruits
//extend appcompactactivity,Onitemclocklistener
class MainActivity : AppCompatActivity(),OnItemClickListener {
    override fun OnItemClicked(fruits: Fruits) {
        Toast.makeText(this,"${fruits.name}",Toast.LENGTH_LONG).show()
        //call CardAcitivity
        //intent is from one activity to another(or from one page to another)
        val intent=Intent(this,CardActivity::class.java).apply {

            putExtra("FRUIT_NAME",fruits.name)
            putExtra("FRUIT_IMAGE",fruits.image

            )
        }
        Log.d("hello","hello")
//        intent.putExtra("FRUIT_NAME",fruits.name)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView:RecyclerView=findViewById(R.id.fruits_recycler)
        val fruitArray=ArrayList<Fruits>()

        fruitArray.add(Fruits("Apple",R.drawable.aa))
        fruitArray.add(Fruits("Orange",R.drawable.bb))
        fruitArray.add(Fruits("Strawberry",R.drawable.cc))
        val fruitadapter=FruitAdaper(fruitArray,this)

//        recyclerView.layoutManager=GridLayoutManger(this,2)
//        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
//        //vertical -> recyclerView.layoutManager=LinearLayoutManager(this)
        // horizontal -> recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,reverseLayout:false)
//        recyclerView.adapter=fruitadapter
//        recyclerView.layoutManager=GridLayoutManager(this,2)
        recyclerView.apply {
            layoutManager=GridLayoutManager(context,2)
            adapter=fruitadapter
        }

    }

}

