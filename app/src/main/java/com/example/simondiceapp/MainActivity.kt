package com.example.simondiceapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.collections.ArrayList

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

    fun Random.nextInt(range: IntRange): Int {
        return range.start + nextInt(range.last - range.start)
    }

    fun generarSecuencia(){
        val colores = ArrayList<String>()
        colores.addAll(listOf("Rojo", "Azul", "Verde", "Amarillo"))
        val random = Random()

        println(random.nextInt(0..4))
        secuencia.add(colores[random.nextInt(0..4)])
        println(secuencia)
        mostrar()
    }

    fun mostrar (){

        for (i in 0..secuencia.size){
            val muestra : String = secuencia[i]

            if (muestra=="Rojo"){
                start.text=""
                start.setBackgroundColor(R.id.brojo)
            }
            else if (muestra=="Amarillo"){
                start.text=""
                start.setBackgroundColor(R.id.bamarillo)
            }
            else if (muestra=="Verde"){
                start.text=""
                start.setBackgroundColor(R.id.bverde)
            }
            else if (muestra=="Azul"){
                start.text=""
                start.setBackgroundColor(R.id.bazul)
            }
            else{
                println("Esto no debería haber pasado")


                val bamarillo : Button = findViewById(R.id.bamarillo)
        val bazul : Button = findViewById(R.id.bazul)
        val bverde : Button = findViewById(R.id.bverde)
        val brojo : Button = findViewById(R.id.brojo)

    }


