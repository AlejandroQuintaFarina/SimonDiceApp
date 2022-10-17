package com.example.simondiceapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var secuencia = ArrayList<String>()
    var ronda = 0
    var numero = 4
    var comprobaciones = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutsimon)

        binicio.setOnClickListener {
            toast("Nueva partida")
            ronda=1
            numero=4
            comprobaciones =4
            nronda.setText(ronda.toString())
            ncomprobaciones.setText("0")

        }

        bazul.setOnCLickListener {

        }

        bamarillo.setOnClickListener {

        }

        bverde.setOnClickListener {

        }

        brojo.setOnClickListener {

        }






    }


}