package com.example.roomwithviewtest.database

import android.content.Context
import androidx.annotation.RestrictTo
import androidx.room.CoroutinesRoom
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.roomwithviewtest.dao.WordDao
import com.example.roomwithviewtest.entity.Word
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import java.security.AccessControlContext

@Database(entities = arrayOf(Word::class),version = 1,exportSchema = false)
abstract class WordRoomDatabase:RoomDatabase() {
    abstract fun wordDao():WordDao

    companion object {
        //singleton prevents multiples of database opening
        //at the same time
        private var INSTANCE: WordRoomDatabase? = null

        //?=nullable
        //if it has databases
        fun getDatabase(context: Context,scope: CoroutineScope): WordRoomDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            //else->create database->sychronized(){}
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WordRoomDatabase::class.java,
                    "word_database"
                ).addCallback((WordDatabaseCallback(scope)))
                    .build()
                INSTANCE = instance
                return instance

            }
        }
        private class WordDatabaseCallback(private val scope:CoroutineScope):RoomDatabase.Callback(){
            override fun onOpen(db: SupportSQLiteDatabase) {
                super.onOpen(db)
                INSTANCE?.let { database->
                    scope.launch {
                        populateDatabase(database.wordDao())
                    }

                }
            }
            suspend fun populateDatabase(wordDao:WordDao){
                wordDao.deleteAll()
                var word=Word("Hello")
                wordDao.insert(Word("World"))
            }
        }
    }

}