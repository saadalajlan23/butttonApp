package com.example.butttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var number = 0
    private lateinit var numberText : TextView
    private lateinit var plusButton: Button
    private lateinit var minusButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var saad = findViewById<TextView>(R.id.id)
//        saad.text= "saad-1996"
         numberText = findViewById(R.id.numText)
         plusButton = findViewById(R.id.buttonP)
        minusButton = findViewById(R.id.button2N)

        if (number==0){
            numberText.setTextColor(Color.BLACK)
        }


        minusButton.setOnClickListener{
            number-=1
            if (number==0){
                numberText.setTextColor(Color.BLACK)
            }
            else if (number <0) {
                numberText.setTextColor(Color.RED)
            }

            numberText.text= number.toString()


        }
        plusButton.setOnClickListener{
            number+=1
            if (number==0){
                numberText.setTextColor(Color.BLACK)
            }

            else if(number>0){
                numberText.setTextColor(Color.GREEN)
            }

            numberText.text= number.toString()
        }


    }
}