package com.example.newprojectdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:Button = findViewById(R.id.nextactivity)
        val textView:EditText = findViewById(R.id.textView)
        button.setOnClickListener(){
      /*      val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
      */

        }
    }
}