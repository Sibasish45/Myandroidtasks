package com.example.demo1

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class Alertdialog : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alertdialog)  // must match XML file name

        val btnDialog = findViewById<Button>(R.id.btnDialog)

        btnDialog.setOnClickListener {

            val builder = AlertDialog.Builder(this)

            builder.setTitle("Confirmation")
            builder.setMessage("Do you want to proceed?")

            builder.setPositiveButton("Yes") { dialog, _ ->
                Toast.makeText(this, "You clicked Yes", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }

            builder.setNegativeButton("No") { dialog, _ ->
                Toast.makeText(this, "You clicked No", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }

            builder.setNeutralButton("Cancel") { dialog, _ ->
                Toast.makeText(this, "Cancelled", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }

            builder.create().show()
        }
    }
}