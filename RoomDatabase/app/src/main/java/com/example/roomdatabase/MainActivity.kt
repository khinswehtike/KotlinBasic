package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.example.roomdatabase.database.BookDatabase
import com.example.roomdatabase.entity.BookEntity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var db=Room.databaseBuilder(applicationContext,BookDatabase::class.java,"BookDb").build()
        Thread{
            var bookEntity=BookEntity()
            bookEntity.bookId=1
            bookEntity.bookname="Kotlin for android developer"
            db.bookDao().saveBooks(bookEntity)
            db.bookDao().getAllbooks().forEach(){
                Log.d("Hello","Hello")
                Log.d("FetchDatabase","id:${it.bookId}")
                Log.d("FetchDatabase","Name:${it.bookname}")
            }
        }.start()
        Log.d("Hi", "hi")
    }
}
