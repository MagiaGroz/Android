package com.example.instagram


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class Adapter(private val exList: List<Item>, val listener: HomeListener): RecyclerView.Adapter<Adapter.ExViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExViewHolder {
    val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item,
        parent,false)
        return ExViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExViewHolder, position: Int) {
        val currentItem = exList[position]
        holder.imageView1.setImageResource(currentItem.ImageRes1)
        holder.imageView2.setImageResource(currentItem.icon)
        holder.textView1.text = currentItem.author1
        holder.textView2.text = currentItem.author2
        holder.textView3.text = currentItem.description
        holder.itemView.setOnClickListener{
            listener.onClick(exList.get(position))
        }
        holder.like.setOnClickListener(){
            Toast.makeText(holder.like.context, "You Liked !!!", Toast.LENGTH_SHORT).show()

        }

    }

    override fun getItemCount() = exList.size

    class ExViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView2: ImageView = itemView.person
        val imageView1: ImageView = itemView.placeholder

        val textView1 : TextView = itemView.author
        val textView2 : TextView = itemView.author2
        val textView3 : TextView = itemView.description
        val like : ImageView = itemView.like

    }


}

interface HomeListener {
    fun onClick(item: Item)
}