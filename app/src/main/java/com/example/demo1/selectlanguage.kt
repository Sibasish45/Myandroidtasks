package com.example.demo1

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class selectlanguage : AppCompatActivity() {

    lateinit var spinner: Spinner
    lateinit var button: Button
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selectlanguage)

        spinner = findViewById(R.id.spinnerLang)
        button = findViewById(R.id.btnShow)
        result = findViewById(R.id.result)

        val languages = arrayOf(
            "Java",
            "Kotlin",
            "Python",
            "C",
            "C++",
            "JavaScript"
        )

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            languages
        )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        button.setOnClickListener {
            val selectedLang = spinner.selectedItem.toString()
            result.text = "Your favourite language is: $selectedLang"
        }
    }
}