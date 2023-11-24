package com.example.practica4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practica4.Clase.Superhero



fun getSuperheroes():List<Superhero>{
    return listOf(
        Superhero("Spiderman", "Petter Parker", "Marvel", R.drawable.spiderman),
        Superhero("Wolverine", "James Howlett", "Marvel", R.drawable.logan),
        Superhero("Batman", "Bruce Wayne", "DC", R.drawable.batman),
        Superhero("Thor", "Thor Odinson", "Marvel", R.drawable.thor),
        Superhero("Flash", "Jay Garrick", "DC", R.drawable.flash),
        Superhero("Green Lantern", "Alan Scott", "DC", R.drawable.green_lantern),
        Superhero("Wonder Woman", "Princess Diana", "DC", R.drawable.wonder_woman)
    )
}
@Preview(showBackground = true)
@Composable
fun SuperHeroView() {
    LazyRow() {
        items(getSuperheroes()) {
            ItemHero(superhero = it)
        }
    }
}

@Composable
fun ItemHero(superhero: Superhero){
    Card( modifier = Modifier
        .size(200.dp)
        .background(Color.Red, shape = RoundedCornerShape(2.dp))) {
        Column {
            Image(painter = painterResource(id = superhero.photo), contentDescription = "SuperHero Avatar" , contentScale = ContentScale.Crop, modifier = Modifier.width(200.dp))
            
        }

    }

}
