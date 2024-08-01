package com.example.newbusinesscard

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.newbusinesscard.ui.theme.NewBusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewBusinessCardTheme {
                BusinessCard()
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.LightGray)
    ){
        FirstHalf(modifier = modifier
            .weight(1f)
            .padding(16.dp))
        SecondHalf(modifier = modifier
            .weight(1f)
            .padding(bottom = 50.dp))
    }
}

@Composable
fun FirstHalf(modifier: Modifier = Modifier){
    Row (
        modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(id = R.drawable.android_logo_business),
                contentDescription = null,
                Modifier.height(100.dp).padding(bottom = 20.dp)
            )
            Text(
                text = "Omar El-Ali El-Mohamed",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive
            )
            Text(
                text = "Junior Developer",
                fontSize = 20.sp,
                fontFamily = FontFamily.Cursive
            )

        }
    }
}

@Composable
fun SecondHalf(modifier: Modifier = Modifier){
    Row (
        modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.Bottom
    ){
        Column (
            verticalArrangement = Arrangement.Bottom,

        ){
            Text(
                text = "+962 7 8735 7955",
                fontSize = 20.sp,
                modifier = Modifier.padding(bottom = 5.dp)
            )
            Text(
                text = "@omar__elali",
                fontSize = 20.sp,
                modifier = Modifier.padding(bottom = 5.dp)
            )
            Text(
                text = "o.elali@outlook.com",
                fontSize = 20.sp,
                modifier = Modifier.padding(bottom = 5.dp)
            )


        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NewBusinessCardTheme {
        BusinessCard()
    }
}