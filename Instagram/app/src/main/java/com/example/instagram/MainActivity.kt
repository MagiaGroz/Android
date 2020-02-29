package com.example.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val exList = generateList()
        myrecyc.adapter = Adapter(exList)
        myrecyc.layoutManager = LinearLayoutManager(this)
        myrecyc.setHasFixedSize(true)

        val like = findViewById(R.id.bottom_nav) as ImageView
        like.setOnClickListener {
            Toast.makeText(this@MainActivity, "You Liked !!!", Toast.LENGTH_SHORT).show()
        }
    }
private fun generateList(): List<Item>{
    val list = ArrayList<Item>()
    val item1 = Item(R.drawable.ic_wc3,R.drawable.img_reforged,"warcraftworld","warcraftworld","Warcraft 3 Reforged has been released!")
    val item2 = Item(R.drawable.ic_like,R.drawable.comment,"wc3","wc3","Warcraft 3 Reforged has been released!")
    val item3 = Item(R.drawable.ic_like,R.drawable.comment,"wc3","wc3","Warcraft 3 Reforged has been released!")
    list+=item1
    list+=item2
    list+=item3
    return list
}


}



