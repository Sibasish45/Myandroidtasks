package com.example.demo1

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResourceDemo : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource_demo)

        var mybtn1=findViewById<Button>(R.id.btnsubmit1)
        var mybtn2=findViewById<Button>(R.id.btnsubmit2)
        var mybtn3=findViewById<Button>(R.id.btnsubmit3)
        var myLayout=findViewById<LinearLayout>(R.id.main)
        mybtn1.setOnClickListener{

            myLayout.setBackgroundColor(Color.CYAN)
        }
        mybtn2.setOnClickListener{

            myLayout.setBackgroundColor(Color.RED)
        }
        mybtn3.setOnClickListener{

            myLayout.setBackgroundColor(Color.GREEN)
        }
    }
}

