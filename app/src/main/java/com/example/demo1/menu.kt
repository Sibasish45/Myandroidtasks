package com.example.demo1

import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class menu : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var popupBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        textView = findViewById(R.id.textView)
        popupBtn = findViewById(R.id.popupBtn)

        registerForContextMenu(textView)

        popupBtn.setOnClickListener {
            val popup = PopupMenu(this, popupBtn)
            popup.menuInflater.inflate(R.menu.menu_main, popup.menu)

            popup.setOnMenuItemClickListener {
                Toast.makeText(this, it.title, Toast.LENGTH_SHORT).show()
                true
            }

            popup.show()
        }
    }

    // Options Menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
        return true
    }

    // Context Menu
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        menuInflater.inflate(R.menu.menu_main, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        Toast.makeText(this, item.title, Toast.LENGTH_SHORT).show()
        return true
    }
}