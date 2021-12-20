package com.example.foodieindividualproject2madzhunovaanelyadht_2_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class The_Order_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_order)

        val Button = findViewById<Button>(R.id.Button1)

        Button.setOnClickListener {
            startActivity(Intent(this,The_Order_Activity::class.java))
        }
    }
}