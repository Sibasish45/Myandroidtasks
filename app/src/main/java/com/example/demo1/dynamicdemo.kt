package com.example.demo1

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class dynamicdemo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(50, 50, 50, 50)

        val textView = TextView(this)
        textView.text = "GIET University!"
        textView.textSize = 24f
        textView.setPadding(20, 20, 20, 20)

        val button1 = Button(this)
        button1.text = "btn1"

        val button2 = Button(this)
        button2.text = "btn2"

        button1.setOnClickListener {
            textView.setTextColor(Color.RED)
            layout.setBackgroundColor(Color.GREEN)
        }

        button2.setOnClickListener {
            textView.setTextColor(Color.BLUE)
            layout.setBackgroundColor(Color.YELLOW)
        }

        layout.addView(textView)
        layout.addView(button1)
        layout.addView(button2)

        setContentView(layout)
    }
}