package com.example.demo1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.demo1.databinding.ActivityCalculator1Binding

class calculator1 : AppCompatActivity() {

    private lateinit var binding: ActivityCalculator1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // ViewBinding
        binding = ActivityCalculator1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        // Button clicks
        binding.btnadd.setOnClickListener { calculate("+") }
        binding.btnSub.setOnClickListener { calculate("-") }
        binding.btnMul.setOnClickListener { calculate("*") }
        binding.btnDiv.setOnClickListener { calculate("/") }
    }

    private fun calculate(op: String) {
        val n1 = binding.etNum1.text.toString()
        val n2 = binding.etNum2.text.toString()

        if (n1.isEmpty() || n2.isEmpty()) {
            Toast.makeText(this, "Enter both numbers", Toast.LENGTH_SHORT).show()
            return
        }

        val num1 = n1.toDouble()
        val num2 = n2.toDouble()

        val result = when (op) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> {
                if (num2 == 0.0) {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                    return
                }
                num1 / num2
            }
            else -> 0.0
        }

        binding.tvResult.text = "Result: $result"
    }
}
