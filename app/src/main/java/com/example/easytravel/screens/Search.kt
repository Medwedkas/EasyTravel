package com.example.easytravel.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun SearchScreen(navController: NavHostController) {
    var arrivalDate by remember { mutableStateOf("Сегодня") }
    var departureDate by remember { mutableStateOf("Завтра") }
    var direction by remember { mutableStateOf("Москва") }
    var room by remember { mutableStateOf("1 взрослый, 1 ребенок") }

    Card(
        shape = RoundedCornerShape(14.dp),
        backgroundColor = Color.White,
        modifier = Modifier
            .padding(10.dp)
            .width(280.dp)
            .height(300.dp)
            .clip(shape = RoundedCornerShape(10.dp))
    ) {
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Gray)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                Text(text = "Поиск отелей")
                TextField(
                    value = direction,
                    onValueChange = { direction = it },
                    label = { Text("Направление") },
                    modifier = Modifier
                        .padding(10.dp)
                        .width(200.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                )
                Row(
                    modifier = Modifier.padding(0.5.dp)
                ) {
                    TextField(
                        value = arrivalDate,
                        onValueChange = { arrivalDate = it },
                        label = { Text("Дата заезда") },
                        modifier = Modifier
                            .width(100.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .padding(1.dp)
                    )
                    TextField(
                        value = departureDate,
                        onValueChange = { departureDate = it },
                        label = { Text("Дата выезда") },
                        modifier = Modifier
                            .width(100.dp)
                            .clip(shape = RoundedCornerShape(10.dp))
                            .padding(1.dp)
                    )
                }
                TextField(
                    value = room,
                    onValueChange = { room = it },
                    label = { Text("1 номер для") },
                    modifier = Modifier
                        .padding(10.dp)
                        .width(200.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                )
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(10.dp)
                        .width(200.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(Color.Blue)
                )
                {
                    Text(text = "Найти")

                }
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun PrevSearchScreen() {
    SearchScreen(navController = rememberNavController())
}