package com.gutierrez.dilan.laboratoriocalificado02

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gutierrez.dilan.laboratoriocalificado02.databinding.ActivityPedidosBinding

class Pedidos_activity : AppCompatActivity() {

    private lateinit var binding: ActivityPedidosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPedidosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nombre = intent.getStringExtra("nombre") ?: "No especificado"
        val numero = intent.getStringExtra("numero") ?: "No especificado"
        val productos = intent.getStringExtra("productos") ?: "No especificado"
        val ciudad = intent.getStringExtra("ciudad") ?: "No especificado"
        val direccion = intent.getStringExtra("direccion") ?: "No especificado"

        binding.tvNombre.text = nombre
        binding.tvNumero.text = numero
        binding.tvProductos.text = productos
        binding.tvUbicacion.text = "$ciudad, $direccion"


        binding.btnLlamar.setOnClickListener {
            val intentLlamar = Intent(Intent.ACTION_DIAL)
            intentLlamar.data = Uri.parse("tel:$numero")
            startActivity(intentLlamar)
        }


        binding.btnWhatsapp.setOnClickListener {
            val mensaje = "Hola $nombre, Tus productos: $productos están en camino a la dirección: $direccion"
            val url = "https://api.whatsapp.com/send?phone=$numero&text=${Uri.encode(mensaje)}"
            val intentWhatsapp = Intent(Intent.ACTION_VIEW)
            intentWhatsapp.data = Uri.parse(url)
            startActivity(intentWhatsapp)
        }

        binding.btnMaps.setOnClickListener {
            val uri = "geo:0,0?q=$direccion"
            val intentMaps = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
            intentMaps.setPackage("com.google.android.apps.maps")
            startActivity(intentMaps)
        }
    }
}
