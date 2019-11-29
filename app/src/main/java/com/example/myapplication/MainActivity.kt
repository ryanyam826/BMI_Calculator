package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCal.setOnClickListener(){
            val weight = weightValue.text.toString().toDouble()
            val height = heightValue.text.toString().toDouble()
            val bmi = weight / (height * height)


            if (bmi < 18.5){
                imageView.setImageResource(R.drawable.under)
                bmiResult.text = String.format("%.2f",bmi) + " (Underweight)"
            }else if (bmi <= 24.9 ){
                imageView.setImageResource(R.drawable.normal)
                bmiResult.text = String.format("%.2f",bmi) + " (Normal)"
            }else if(bmi > 25){
                imageView.setImageResource(R.drawable.over)
                bmiResult.text = String.format("%.2f",bmi) + " (Overweight)"
            }


        }

        btnReset.setOnClickListener(){
            bmiResult.setText("")
            weightValue.setText("")
            heightValue.setText("")
            imageView.setImageResource(R.drawable.empty)
        }
    }


}
