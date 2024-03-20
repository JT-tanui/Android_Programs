package com.example.myapplication

//import android.R
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Checkable
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
//    private var num1EditText: EditText? = null
//    private var num2EditText: EditText? = null
    private var resultTextView: TextView? = null
    private var text1Edit: EditText? = null
    private var text2Edit: EditText? = null
    private var text3Edit: EditText? = null

    private var checkbox1: CheckBox? = null
    private var checkbox2: CheckBox? = null
    private var checkbox3: CheckBox? = null
    private var checkbox4: CheckBox? = null
    private var checkbox5: CheckBox? = null
    private var checkbox6: CheckBox? = null
    private var checkbox7: CheckBox? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        checkbox1 = findViewById<CheckBox>(R.id.checkBox)
        checkbox2 = findViewById<CheckBox>(R.id.checkBox2)
        checkbox3 = findViewById<CheckBox>(R.id.checkBox3)
        checkbox4 = findViewById<CheckBox>(R.id.checkBox4)
        checkbox5 = findViewById<CheckBox>(R.id.checkBox5)
        checkbox6 = findViewById<CheckBox>(R.id.checkBox6)
        checkbox7 = findViewById<CheckBox>(R.id.checkBox7)
//        num1EditText = findViewById<EditText>(R.id.num1EditText)
//        num2EditText = findViewById<EditText>(R.id.num2EditText)
        resultTextView = findViewById<TextView>(R.id.resultTextView)

        // Set OnClickListener for the calculate button
        findViewById<View>(R.id.calculateButton).setOnClickListener { Diagnose() }
    }

        private fun Diagnose() {
        // Get user input
            // Display results
            resultTextView!!.text = """
                Your results for the diagnosis is as follows:
                
                Results loading....
            """.trimIndent()
        }
    }
