package com.example.practica4.Clase
import androidx.annotation.DrawableRes

data class Superhero( val superheroName: String,
                      val publisher: String,
                      val realName: String,
                    @DrawableRes val photo: Int)

