package com.example.formularioapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Switch
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio1 : AppCompatActivity() {

    lateinit var userName : EditText
    lateinit var userPassword : EditText
    lateinit var switchRecordar : Switch
    lateinit var btnLogin : Button
    lateinit var checkBox : CheckBox
    lateinit var btnVolver : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        userName = findViewById(R.id.userName)
        userPassword = findViewById(R.id.userPassword)
        btnLogin = findViewById(R.id.btnLogin)
        switchRecordar = findViewById(R.id.switchRecordar)
        checkBox = findViewById(R.id.checkBox)
        btnVolver = findViewById(R.id.btnVolver)

        btnLogin.setOnClickListener {
            CreateAlert()
        }

        btnVolver.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    fun CreateAlert(){
        if(switchRecordar.isChecked){
            Log.d("Opcion","Contraseña recordada")
        }
        else{
            Log.d("Opcion","Contraseña no recordada")
        }

        if(checkBox.isChecked){
            Log.d("Opcion","Terminos Aceptados")
        }
        else{
            Log.d("Opcion","Terminos no aceptados")
        }
    }
}