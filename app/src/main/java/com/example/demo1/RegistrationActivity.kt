package com.example.demo1

import android.os.Bundle
import android.util.Patterns
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {

    lateinit var name: EditText
    lateinit var email: EditText
    lateinit var mobile: EditText
    lateinit var registerBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        name = findViewById(R.id.etName)
        email = findViewById(R.id.etEmail)
        mobile = findViewById(R.id.etMobile)
        registerBtn = findViewById(R.id.btnRegister)

        registerBtn.setOnClickListener {

            val nameText = name.text.toString().trim()
            val emailText = email.text.toString().trim()
            val mobileText = mobile.text.toString().trim()

            if (nameText.isEmpty()) {
                name.error = "Name is required"
                name.requestFocus()
                return@setOnClickListener
            }

            if (emailText.isEmpty()) {
                email.error = "Email is required"
                email.requestFocus()
                return@setOnClickListener
            }

            if (!Patterns.EMAIL_ADDRESS.matcher(emailText).matches()) {
                email.error = "Enter valid email"
                email.requestFocus()
                return@setOnClickListener
            }

            if (mobileText.isEmpty()) {
                mobile.error = "Mobile number required"
                mobile.requestFocus()
                return@setOnClickListener
            }

            if (mobileText.length != 10) {
                mobile.error = "Enter valid 10 digit mobile number"
                mobile.requestFocus()
                return@setOnClickListener
            }

            Toast.makeText(this, "Registration Successful", Toast.LENGTH_LONG).show()
        }
    }
}