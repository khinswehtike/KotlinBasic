package com.example.roomwithviewtest.repository

import com.example.roomwithviewtest.dao.WordDao
import com.example.roomwithviewtest.entity.Word

class WordReposity(private val wordDao:WordDao){
    val allWords=wordDao.getAlphabetizedWords()
    suspend fun insert(word:Word){
        wordDao.insert(word)
    }

}