package com.example.simondiceapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutsimon)
    }

    var resultado : String = "Correcto"
    var secuencia = ArrayList<String>()
    var select = ArrayList<String>()
    val binicio : Button = findViewById(R.id.binicio)

    fun iniciarPartida(){
        GenerarSecuencia()
        if(resultado=="Acierto"){
            GenerarSecuencia()
        }
        else{
            println("Fallaste, la secuencia era " + secuencia + " y fallaste en " + select + " \n Llegaste hasta la ronda: " + secuencia.size)
        }
    }

        val bamarillo : Button = findViewById(R.id.bamarillo)
        val bazul : Button = findViewById(R.id.bazul)
        val bverde : Button = findViewById(R.id.bverde)
        val brojo : Button = findViewById(R.id.brojo)

    }


