package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    var person:Person=Person("James","Android Developer")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //content is layout
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
//        binding.txtName.text=person.name
//        binding.txtOccupation.text=person.occupation
        binding.personn=person
    }
}
