package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
var TAG="mmm"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"Activity Created")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Activity Started")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Activity Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Activity Stopped")}

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Activity Created")}
}
