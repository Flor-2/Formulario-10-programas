package com.example.formularioapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var ejercicio1 : Button
    lateinit var ejercicio2 : Button
    lateinit var ejercicio3 : Button
    lateinit var ejercicio4 : Button
    lateinit var ejercicio5 : Button
    lateinit var ejercicio6 : Button
    lateinit var ejercicio7 : Button
    lateinit var ejercicio8 : Button
    lateinit var ejercicio9 : Button
    lateinit var ejercicio10 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        ejercicio1 = findViewById(R.id.Ejercicio1)
        ejercicio2 = findViewById(R.id.Ejercicio2)
        ejercicio3 = findViewById(R.id.Ejercicio3)
        ejercicio4 = findViewById(R.id.Ejercicio4)
        ejercicio5 = findViewById(R.id.Ejercicio5)
        ejercicio6 = findViewById(R.id.Ejercicio6)
        ejercicio7 = findViewById(R.id.Ejercicio7)
        ejercicio8 = findViewById(R.id.Ejercicio8)
        ejercicio9 = findViewById(R.id.Ejercicio9)
        ejercicio10 = findViewById(R.id.Ejercicio10)

        ejercicio1.setOnClickListener {
            val intent = Intent(this, Ejercicio1::class.java)
            startActivity(intent)
        }

        ejercicio2.setOnClickListener {
            val intent = Intent(this, Ejercicio2::class.java)
            startActivity(intent)
        }

        ejercicio3.setOnClickListener {
            val intent = Intent(this, Ejercicio3::class.java)
            startActivity(intent)
        }

        ejercicio4.setOnClickListener {
            val intent = Intent(this, Ejercicio4::class.java)
            startActivity(intent)
        }
        ejercicio5.setOnClickListener {
            val intent = Intent(this, Ejercicio5::class.java)
            startActivity(intent)
        }

        ejercicio6.setOnClickListener {
            val intent = Intent(this, Ejercicio6::class.java)
            startActivity(intent)
        }

        ejercicio7.setOnClickListener {
            val intent = Intent(this, Ejercicio7::class.java)
            startActivity(intent)
        }

        ejercicio8.setOnClickListener {
            val intent = Intent(this, Ejercicio8::class.java)
            startActivity(intent)
        }

        ejercicio9.setOnClickListener {
            val intent = Intent(this, Ejercicio9::class.java)
            startActivity(intent)
        }

        ejercicio10.setOnClickListener {
            val intent = Intent(this, Ejercicio10::class.java)
            startActivity(intent)
        }
    }
}