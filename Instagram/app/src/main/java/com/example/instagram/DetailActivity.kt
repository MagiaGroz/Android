package com.example.instagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val item = intent.extras?.getSerializable("item_el") as Item
        description.text = item.description
        author.text=item.author1
        author2.text=item.author2
        person.setImageResource(item.icon)
        placeholder.setImageResource(item.ImageRes1)

        val back_button = findViewById<ImageView>(R.id.back_button)

        //handle button click
        back_button.setOnClickListener {
           finish()
            // startActivity(Intent(this@DetailActivity, MainActivity::class.java))
        }
        val like = findViewById(R.id.like) as ImageView
        like.setOnClickListener {
            Toast.makeText(this@DetailActivity, "You Liked !!!", Toast.LENGTH_SHORT).show()
        }

    }
}
