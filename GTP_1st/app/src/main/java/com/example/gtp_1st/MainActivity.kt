package com.example.gtp_1st

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gtp_1st.ui.theme.GTP_1stTheme
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : ComponentActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set up the traditional Android View-based UI
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)

        // Set up the Compose-based UI
        setContent {
            GTP_1stTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }

        // Set the click listener for the button
        button.setOnClickListener {
            onButtonClick(it)
        }
    }

    fun onButtonClick(view: View) {
        textView.text = "Button Clicked!"
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GTP_1stTheme {
        Greeting("Android")
    }
}
