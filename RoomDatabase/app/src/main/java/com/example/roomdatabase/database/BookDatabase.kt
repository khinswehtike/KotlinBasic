package com.example.roomdatabase.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomdatabase.dao.bookDAO
import com.example.roomdatabase.entity.BookEntity

//tables in Bookentity
@Database(entities = [(BookEntity::class)],version = 1)
abstract class BookDatabase:RoomDatabase(){
    abstract fun bookDao():bookDAO
}