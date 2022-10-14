package com.cafelogstudio.kotlinprincipiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variablesYConstantes()
    }

    /* Aqui vamos a hablar de variables y constantes */

    private fun variablesYConstantes(){

        // Variables
        var myFirstVariable = "Hello Hackermen!"

        println(myFirstVariable)
    }
}