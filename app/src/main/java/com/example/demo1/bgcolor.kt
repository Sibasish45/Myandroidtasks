package com.example.demo1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class bgcolor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bgcolor)

        val layout = findViewById<LinearLayout>(R.id.layout1)

        val red = findViewById<Button>(R.id.btnRed)
        val green = findViewById<Button>(R.id.btnGreen)
        val blue = findViewById<Button>(R.id.btnBlue)

        red.setOnClickListener {
            layout.setBackgroundColor(Color.RED)
        }

        green.setOnClickListener {
            layout.setBackgroundColor(Color.GREEN)
        }

        blue.setOnClickListener {
            layout.setBackgroundColor(Color.BLUE)
        }
    }
}