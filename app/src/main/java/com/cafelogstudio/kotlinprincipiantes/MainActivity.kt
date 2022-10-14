package com.cafelogstudio.kotlinprincipiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variablesYConstantes()

        tiposDeDatos()
    }

    /* Aqui vamos a hablar de variables y constantes */

    private fun variablesYConstantes(){

        // Variables
        // Las variables pueden cambiar el dato, pero no el tipo de dato (Int, string, boolean)
        var myFirstVariable = "Hello Hackermen!"
        println(myFirstVariable)

        myFirstVariable = "Bienvenidos a MoureDev"
        println(myFirstVariable)

        //No podemos asignar un tipo de dato Int a una variable de myFirstVariable = 1
        var mySecondVariable = "Suscribete"
        println(mySecondVariable)

        mySecondVariable = myFirstVariable
        println(mySecondVariable)

        myFirstVariable = "¿Ya te has suscrito?"
        println(myFirstVariable)

        //Constantes
        val myFirstConstant = "¿Te ha gustado el tutorial?"
        println(myFirstConstant)

        //Una constante no puede modificar su valor:
        //myFirstConstant = "Si te ha gustado, dale a LIKE"
        val mySecondConstant = myFirstVariable
        println(mySecondConstant)
    }

    /* Aquí vamos hablar de tipos de datos (data types) */

    private fun tiposDeDatos(){

    }
}