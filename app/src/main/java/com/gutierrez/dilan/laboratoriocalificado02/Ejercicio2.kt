package com.gutierrez.dilan.laboratoriocalificado02

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gutierrez.dilan.laboratoriocalificado02.databinding.ActivityEjercicio2Binding

class Ejercicio2 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityEjercicio2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnRegistrar.setOnClickListener {

            val nombre = binding.inputNombre.text.toString()
            val numero = binding.inputNumero.text.toString()
            val productos = binding.inputProductos.text.toString()
            val ciudad = binding.inputCiudad.text.toString()
            val direccion = binding.inputDireccion.text.toString()

            val intent = Intent(this, Pedidos_activity::class.java).apply {
                putExtra("nombre", nombre)
                putExtra("numero", numero)
                putExtra("productos", productos)
                putExtra("ciudad", ciudad)
                putExtra("direccion", direccion)
            }
            startActivity(intent)
        }
    }
}
