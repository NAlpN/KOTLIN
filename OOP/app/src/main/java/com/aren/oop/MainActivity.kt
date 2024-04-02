package com.aren.oop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.aren.oop.ui.theme.OOPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OOPTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

class Araba(val marka: String, val model: String) {
    private var hiz: Int = 0 // hiz alanını tanımla

    fun hizAyarla(yeniHiz: Int) {
        hiz = yeniHiz
    }

    fun hiziAl(): Int {
        return hiz
    }

    fun bilgiAl(): String {
        return "Marka: $marka, Model: $model, Hız: $hiz km/h"
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OOPTheme {
        Greeting("Android")
    }
}

fun main() {
    val araba1 = Araba("Toyota", "Corolla")
    val araba2 = Araba("Honda", "Civic")

    println("Araba 1: ${araba1.bilgiAl()}")
    println("Araba 2: ${araba2.bilgiAl()}")

    araba1.hizAyarla(100)
    araba2.hizAyarla(150)

    println("Araba 1 Hızı: ${araba1.hiziAl()} km/h")
    println("Araba 2 Hızı: ${araba2.hiziAl()} km/h")
}
