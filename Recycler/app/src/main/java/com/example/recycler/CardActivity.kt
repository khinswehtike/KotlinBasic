package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class CardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)
        val fruitName=intent.getStringExtra("FRUIT_NAME")
        val fruitimage=intent.getIntExtra("FRUIT_IMAGE",R.drawable.aa)
        val name=findViewById<TextView>(R.id.name).apply {
            text=fruitName
        }
        val image=findViewById<ImageView>(R.id.imageft).apply {
            setImageResource(fruitimage)
        }
    }
}
