package com.example.demo1

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class calculator : AppCompatActivity() {

    lateinit var num1: EditText
    lateinit var num2: EditText
    lateinit var result: TextView

    lateinit var add: Button
    lateinit var sub: Button
    lateinit var mul: Button
    lateinit var div: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)
        result = findViewById(R.id.result)

        add = findViewById(R.id.btnAdd)
        sub = findViewById(R.id.btnSub)
        mul = findViewById(R.id.btnMul)
        div = findViewById(R.id.btnDiv)

        add.setOnClickListener {
            val a = num1.text.toString().toDouble()
            val b = num2.text.toString().toDouble()
            result.text = "Result: ${a + b}"
        }

        sub.setOnClickListener {
            val a = num1.text.toString().toDouble()
            val b = num2.text.toString().toDouble()
            result.text = "Result: ${a - b}"
        }

        mul.setOnClickListener {
            val a = num1.text.toString().toDouble()
            val b = num2.text.toString().toDouble()
            result.text = "Result: ${a * b}"
        }

        div.setOnClickListener {
            val a = num1.text.toString().toDouble()
            val b = num2.text.toString().toDouble()
            result.text = "Result: ${a / b}"
        }
    }
}