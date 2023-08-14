package com.example.telalogin_arquiteturadedados

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.telalogin_arquiteturadedados.ui.theme.TelaLoginArquiteturaDeDadosTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaLoginArquiteturaDeDadosTheme {
                Main()
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Main() {

    val email by remember { mutableStateOf("") }
    val senha by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Arquitetura de Dados",
                    fontSize = 25.sp)
                },
                backgroundColor = Color(247, 130, 6, 255),
                contentColor = Color.White,
            )
        },
        modifier = Modifier.fillMaxSize()

    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = email,
                onValueChange = { it },
                placeholder = {
                    Text(text = "Email",
                        fontSize = 18.sp)
                },
                maxLines = 1,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 45.dp)
                    .padding(bottom = 30.dp)
            )

            OutlinedTextField(
                value = senha,
                onValueChange = { it },
                placeholder = {
                    Text(text = "Senha",
                    fontSize = 18.sp)
                },
                maxLines = 1,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 45.dp)
                    .padding(bottom = 30.dp)
            )
            
            Button(onClick = {

            },
                colors = ButtonDefaults.buttonColors(

                    backgroundColor = Color(247, 130, 6, 255),
                    contentColor = Color.White,
                ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 45.dp)

                ) {
                    Text(text = "Logar",
                    fontSize = 18.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Main()
}