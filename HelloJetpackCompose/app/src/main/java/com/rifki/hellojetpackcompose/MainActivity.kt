package com.rifki.hellojetpackcompose

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.rifki.hellojetpackcompose.ui.theme.HelloJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloJetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Jetpack Compose",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(
    name = "Without Surface",
    group = "Greetings",
    showSystemUi = true,
    uiMode = UI_MODE_NIGHT_YES,
)
@Composable
fun GreetingsPreview() {
    HelloJetpackComposeTheme {
        Greeting("JetpackCompose")
    }
}
@Preview(
    name = "With Surface",
    group = "Greetings",
    showSystemUi = true,
    uiMode = UI_MODE_NIGHT_YES,
)
@Composable
fun GreetingsSurfacePreview() {
    HelloJetpackComposeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Greeting("JetpackCompose")
        }
    }
}

@Preview(
    name = "Single Preview",
    group = "Greetings",
    showBackground = true,
    widthDp = 200,
    heightDp = 200,
)
@Preview(
    name = "Full Device Preview",
    group = "Greetings",
    device = Devices.PIXEL_3A,
    showSystemUi = true,
)
@Composable
fun DefaultPreview() {
    HelloJetpackComposeTheme {
        Greeting("Jetpack Compose")
    }
}