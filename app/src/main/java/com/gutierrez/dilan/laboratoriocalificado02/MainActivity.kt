package com.gutierrez.dilan.laboratoriocalificado02

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val cardViewCaja = findViewById<CardView>(R.id.cardViewCaja)
        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val btnOcultar = findViewById<Button>(R.id.btnOcultar)


        btnMostrar.setOnClickListener {
            cardViewCaja.visibility = View.VISIBLE
        }

        btnOcultar.setOnClickListener {
            cardViewCaja.visibility = View.GONE
        }

    }
}



