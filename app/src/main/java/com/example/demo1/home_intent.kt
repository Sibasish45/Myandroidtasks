package com.example.demo1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class home_intent : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_intent)

        val tvWelcome = findViewById<TextView>(R.id.textView3)

        val username = intent.getStringExtra("USERNAME")

        tvWelcome.text = "Welcome $username"
    }
}