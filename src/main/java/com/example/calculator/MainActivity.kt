package com.example.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//       add
        btnAdd.setOnClickListener {
            var result: Double = (txtNumber1.text.toString()).toDouble() + (txtNumber2.text.toString()).toDouble()
            txtResult.text = result.toString()
        }
//        sub
        btnSub.setOnClickListener {
            var result: Double = (txtNumber1.text.toString().toDouble()) - (txtNumber2.text.toString()).toDouble()
            txtResult.text = result.toString()
        }
//        mul
        btnMul.setOnClickListener {
            var result: Double = (txtNumber1.text.toString().toDouble()) * (txtNumber2.text.toString()).toDouble()
            txtResult.text = result.toString()
        }

//        div
        btnDiv.setOnClickListener {
            var result: Double = (txtNumber1.text.toString().toDouble()) / (txtNumber2.text.toString()).toDouble()
            txtResult.text = result.toString()
        }
    }

}