package com.example.foodieindividualproject2madzhunovaanelyadht_2_19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val CardView = findViewById<CardView>(R.id.cardView)

        CardView.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

        }
    }
}