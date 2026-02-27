package com.example.demo1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class Dynamicimg : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamicimg)

        val layout = findViewById<LinearLayout>(R.id.main)
        val button = findViewById<Button>(R.id.btn1img)

        val imageView = ImageView(this)
        imageView.setImageResource(R.drawable.img11)

        val params = LinearLayout.LayoutParams(500, 500)
        imageView.layoutParams = params

        layout.addView(imageView)

        button.setOnClickListener {
           imageView.setImageResource(R.drawable.img12)
        }
    }
}
