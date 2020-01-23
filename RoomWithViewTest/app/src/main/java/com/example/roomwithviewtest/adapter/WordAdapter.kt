package com.example.roomwithviewtest.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.roomwithviewtest.R
import com.example.roomwithviewtest.entity.Word
import kotlinx.android.synthetic.main.item_word.view.*

class WordViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val wordItem=itemView.findViewById<TextView>(R.id.txt_word)
}
class WordAdapter(context: Context):RecyclerView.Adapter<WordViewHolder>(){
    private var words= emptyList<Word>()//
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_word,parent,false)
        return WordViewHolder(view)
    }
     internal fun setWords(words:List<Word>){
     this.words= words
         notifyDataSetChanged()
     }
    override fun getItemCount()=words.size

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        holder.wordItem.text=words[position].word

    }

}