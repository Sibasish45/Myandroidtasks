package com.example.demo1

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.*
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class sharedpref : AppCompatActivity() {

    lateinit var username: EditText
    lateinit var language: Spinner
    lateinit var notification: Switch
    lateinit var saveBtn: Button

    lateinit var sharedPreferences: SharedPreferences

    val languages = arrayOf("English", "Hindi", "Spanish")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sharedpref)

        username = findViewById(R.id.etUsername)
        language = findViewById(R.id.spLanguage)
        notification = findViewById(R.id.swNotification)
        saveBtn = findViewById(R.id.btnSave)

        sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            languages
        )

        language.adapter = adapter

        loadPreferences()

        saveBtn.setOnClickListener {

            val editor = sharedPreferences.edit()

            editor.putString("username", username.text.toString())
            editor.putString("language", language.selectedItem.toString())
            editor.putBoolean("notifications", notification.isChecked)

            editor.apply()

            Toast.makeText(this, "Preferences Saved", Toast.LENGTH_SHORT).show()
        }
    }

    private fun loadPreferences() {

        val savedUsername = sharedPreferences.getString("username", "")
        val savedLanguage = sharedPreferences.getString("language", "English")
        val savedNotification = sharedPreferences.getBoolean("notifications", false)

        username.setText(savedUsername)
        notification.isChecked = savedNotification

        val adapter = language.adapter as SpinnerAdapter

        var position = 0
        for (i in languages.indices) {
            if (languages[i] == savedLanguage) {
                position = i
                break
            }
        }

        language.setSelection(position)
    }
}