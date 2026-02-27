package com.example.demo1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class autocomplete_tv : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autocomplete_tv)

        val myauto = findViewById<AutoCompleteTextView>(R.id.autoCountry)
        val mybtn = findViewById<Button>(R.id.btnShow)

        val countries = resources.getStringArray(R.array.country_list)


        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,countries)

        myauto.setAdapter(adapter)
        myauto.threshold = 1

        mybtn.setOnClickListener {
            val s = myauto.text.toString()
            Toast.makeText(this, "You have selected: $s", Toast.LENGTH_SHORT).show()
        }
    }
}








//package com.example.demo1
//
//import android.os.Bundle
//import android.widget.ArrayAdapter
//import android.widget.AutoCompleteTextView
//import android.widget.Button
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//
//class autocomplete_tv : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_autocomplete_tv)
//
//        val myauto = findViewById<AutoCompleteTextView>(R.id.autoCountry)
//        val mybtn = findViewById<Button>(R.id.btnShow)
//
//        val countries = resources.getStringArray(R.array.country_list)
//        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,countries)
//
//        myauto.setAdapter(adapter)
//        mybtn.setOnClickListener {
//            val s = myauto.text.toString()
//
//            Toast.makeText(this,"You have selected: $s",Toast.LENGTH_SHORT).show()
//        }
//    }
//}
