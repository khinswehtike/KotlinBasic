package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var txtcount:TextView
    lateinit var btntoast:Button
    lateinit var btncount:Button
    lateinit var btnrandom:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var txtcount:TextView=findViewById(R.id.txt)
        //var txtcount=findViewById<TextView>R.id.txt)
        txtcount=findViewById(R.id.txt)
        btntoast=findViewById(R.id.btn1)
        btncount=findViewById(R.id.btn2)
        btnrandom=findViewById(R.id.btn3)
        btntoast.setOnClickListener{
            Toast.makeText(this,"Click Toast Button",Toast.LENGTH_LONG).show()
        }
        btncount.setOnClickListener{
            var count:Int=txtcount.text.toString().toInt()
            count++
            txtcount.text=count.toString()
        }
        btnrandom.setOnClickListener{
            val random=(0 until 100).shuffled().last()
            //shuffled() is ramdomming the numbers and last() is last number in randomming numbers
            txtcount.text=random.toString()
        }
    }
}
