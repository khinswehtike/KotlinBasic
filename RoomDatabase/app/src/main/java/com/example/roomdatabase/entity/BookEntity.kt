package com.example.roomdatabase.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// data class BookEntity (var id:Int,var name:String){
//}
@Entity
class BookEntity {
    @PrimaryKey
    var bookId:Int=0

    @ColumnInfo(name="name")
    var bookname:String=""
}