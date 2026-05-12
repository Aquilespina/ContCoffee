package com.example.contcoffee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeeScreen()
        }
    }
}

@Composable
fun CoffeeScreen() {
    var count by remember { mutableStateOf(0) }

    CoffeeCounter(
        count = count,
        onIncrement = { count++ },
        onReset = { count = 0 }
    )
}

@Composable
fun CoffeeCounter(
    count: Int,
    onIncrement: () -> Unit,
    onReset: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Tazas de café: $count", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = onIncrement) {
            Text("Añadir taza")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = onReset) {
            Text("Reiniciar")
        }

        if (count > 10) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "¡Demasiada cafeína!",
                color = Color.Red,
                fontSize = 18.sp
            )
        }
    }
}
