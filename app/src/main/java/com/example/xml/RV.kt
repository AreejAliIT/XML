package com.example.xml

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RV(private val names: List<StudentData>) : RecyclerView.Adapter<RV.ItemViewHolder>(){
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
   lateinit var textView : TextView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_roe
                ,parent
                ,false
            )
        )

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val name =names [position]

        holder.itemView.apply{
            textView = findViewById(R.id.textView)
            textView.text=name.name+"\n"+name.marks+"\n"+"\n"
        }

    }

    override fun getItemCount() =    names.size

}

