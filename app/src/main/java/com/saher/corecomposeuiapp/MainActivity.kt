package com.saher.corecomposeuiapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    /**
     * [Surface] a block of UI that is displayed in the screen.
     */
    Surface(
        color = Color.DarkGray,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                HorizontalColoredBar(Color.Magenta)
                HorizontalColoredBarWithText(Color.Red, Color.Gray)
            }
            HorizontalColoredBar(Color.Blue)
            HorizontalColoredBarWithText(Color.White, Color.LightGray)
            HorizontalColoredBar(Color.Cyan)
            HorizontalColoredBarWithText(Color.Yellow, Color.White)

        }
    }
}

@Composable
fun HorizontalColoredBar(color: Color) {
    Surface(
        color = color,
        modifier = Modifier
            .height(100.dp)
            .width(200.dp)
    ) { }
}

@Composable
fun HorizontalColoredBarWithText(color: Color, color2: Color) {
    Surface(
        color = color,
        modifier = Modifier
            .height(100.dp)
            .width(200.dp)
    ) {
        Column() {
            Text(
                text = "Wrapped Content",
                style = MaterialTheme.typography.h6,
                modifier = Modifier.weight(0.1f)
            )
            Text(
                text = "Another Wrapped Content",
                style = MaterialTheme.typography.h6,
                modifier = Modifier
                    .weight(0.1f)
                    .background(color = color2)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}