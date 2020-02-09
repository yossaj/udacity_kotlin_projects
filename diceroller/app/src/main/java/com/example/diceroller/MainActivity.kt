package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numberText: TextView = findViewById(R.id.number_view)
        var counter: Int = 1;



        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            if(counter < 6){
            counter++}else{ counter = 1}
            numberText.setText(counter.toString())
        }



    }



}
