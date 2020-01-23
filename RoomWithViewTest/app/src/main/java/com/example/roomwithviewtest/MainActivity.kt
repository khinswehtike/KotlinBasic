package com.example.roomwithviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.roomwithviewtest.adapter.WordAdapter
import com.example.roomwithviewtest.entity.Word
import com.example.roomwithviewtest.viewmodel.WordViewModel

class MainActivity : AppCompatActivity() {
private lateinit var wordViewModel: WordViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapterWord = WordAdapter(this)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_word).apply {

            layoutManager = LinearLayoutManager(context)
            adapter = adapterWord
        }
        wordViewModel=ViewModelProvider(this).get(WordViewModel::class.java)
        wordViewModel.allWord.observe(this, Observer { word->
            word?.let{adapterWord.setWords(it)}
        })
    }
}