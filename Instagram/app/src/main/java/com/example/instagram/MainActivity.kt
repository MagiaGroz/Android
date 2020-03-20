package com.example.instagram

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

// about naming: myrecyc = my recycler view, exList = existing List

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val exList = generateList()

            val itemsListener = object: HomeListener{
                override fun onClick(item: Item) {
                    val intent = Intent(this@MainActivity, DetailActivity::class.java)

                    val bundle = Bundle()
                    bundle.putSerializable("item_el", item)
                    intent.putExtras(bundle)
                    startActivity(intent)

                }
            }

        myrecyc.adapter = Adapter(exList, itemsListener)
        myrecyc.layoutManager = LinearLayoutManager(this)

     //   myrecyc.isNestedScrollingEnabled = false
        myrecyc.setHasFixedSize(true)





    }



    }




private fun generateList(): List<Item>{
    val list = ArrayList<Item>()
    val item1 = Item(R.drawable.img_reforged,R.drawable.ic_wc3,"warcraftworld","warcraftworld","Warcraft 3 Reforged has been released!")
    val item2 = Item(R.drawable.halyk,R.drawable.ic_halyk,"halykbank.kz","halykbank.kz","Our main office in the center of Almaty")
    val item3 = Item(R.drawable.instagram2,R.drawable.instagram,"instagram","instagram","Paris in the night")
    val item4 = Item(R.drawable.meduza,R.drawable.ic_meduza,"meduses","meduses","Beautiful in the simple things")
    val item5 = Item(R.drawable.bioshock,R.drawable.ic_biochock,"2games","2games","Paris in the night")

   val item6 = Item(R.drawable.nature2,R.drawable.ic_halyk,"nature","nature","Paris in the night")
    val item7 = Item(R.drawable.nature3,R.drawable.ic_meduza,"beautiful","beautiful","Imagine")
    val item8 = Item(R.drawable.nature4,R.drawable.ic_wc3,"goodplaces","goodplaces","Paris in the night")
    val item9 = Item(R.drawable.nature5,R.drawable.ic_biochock,"places_to_trips","places_to_trips","Do you want to visit?")
    val item10 = Item(R.drawable.nature6,R.drawable.instagram,"travel","travel","Best place")

    list+=item1
    list+=item2
    list+=item3
    list+=item4
    list+=item5
    list+=item6
    list+=item7
    list+=item8
    list+=item9
    list+=item10
    return list
}






