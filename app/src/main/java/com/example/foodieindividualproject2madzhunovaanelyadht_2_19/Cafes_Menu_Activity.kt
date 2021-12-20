package com.example.foodieindividualproject2madzhunovaanelyadht_2_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Cafes_Menu_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cafes_menu)

        val ImageView = findViewById<ImageView>(R.id.imageView18)

        ImageView.setOnClickListener{
            startActivity(Intent(this,Cafes_Menu_Activity::class.java))
        }
    }
}