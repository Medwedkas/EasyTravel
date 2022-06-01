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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun AuthenticationScreen(navController: NavHostController) {
    var login by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
            .background(Color.Blue)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Text(
                text = "Авторизуйтесь или зарегестрируйтесь",
                fontSize = 20.sp,
                fontFamily = FontFamily.Monospace,
                textAlign = TextAlign.Center

            )
            TextField(
                value = login,
                onValueChange = { login = it },
                label = { Text("login") },
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(10.dp))
            )
            TextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("password") },
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(10.dp))
            )
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .padding(10.dp)
                    .width(200.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(Color.Blue)

            ) {
                Text(text = "Авторизироваться")
            }

        }


    }
}

@Preview(showBackground = true)
@Composable
fun PrevAuthenticationScreenScreen() {
    AuthenticationScreen(navController = rememberNavController())
}
