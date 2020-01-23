package com.example.roomwithviewtest.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.roomwithviewtest.dao.WordDao
import com.example.roomwithviewtest.database.WordRoomDatabase
import com.example.roomwithviewtest.entity.Word
import com.example.roomwithviewtest.repository.WordReposity
import kotlinx.coroutines.launch

//class extends androidViewModel and requires application as parameter
class WordViewModel(application: Application):AndroidViewModel(application){

    //the viewmodel maintains a reference to the repository to get data
    private val repository:WordReposity

    //LiveData gives us updated words when they changed
    val allWord:LiveData<List<Word>>

    init {
        val wordDao=WordRoomDatabase.getDatabase(application,viewModelScope).wordDao()
        repository= WordReposity(wordDao)
        allWord=repository.allWords
    }

    //to handle the background task
    fun insert(word:Word)=viewModelScope.launch{
        repository.insert(word)

    }
}