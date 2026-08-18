package com.example.formularioapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio3 : AppCompatActivity() {

    lateinit var progress : ProgressBar

    lateinit var BtnResult : Button

    lateinit var porcentaje : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        progress = findViewById(R.id.progressBar)

        BtnResult = findViewById(R.id.Ejecutar)

        porcentaje = findViewById(R.id.editTextNumber)

        BtnResult.setOnClickListener {

            val texto : String = porcentaje.text.toString()

            val numeroPorcierto : Int = texto.toInt()

            if(numeroPorcierto >= 0  || numeroPorcierto <= 100){
                progress.progress = numeroPorcierto
            }

        }

    }
}