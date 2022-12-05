package com.androidenavanzado.hellowordcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.androidenavanzado.hellowordcompose.ui.theme.HelloWordComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
              app()
                }
            }
        }
@Preview
@Composable
fun app(){
    Column(modifier = Modifier
        .fillMaxSize().padding(30.dp)
        .background(Color.White)) {
        Image(modifier = Modifier.fillMaxWidth().height(400.dp),
            painter = painterResource(id = R.drawable.programadora_final),
            contentDescription = "logo de Mobdev"

        )
        Text(text = "Mobdev",
            fontSize = 30.sp,
            color = Color.Red,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center )
        Text(text = "Comprometidos con el trabajo remoto",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)
        Text(text = "Es reconocida por su excelente técnica",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)
        Text(text = "Tiene diferentes beneficios para sus trabajadores",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)
    }
}

 