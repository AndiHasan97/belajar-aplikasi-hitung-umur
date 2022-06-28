package com.hitung.umur

import android.app.Activity
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import android.os.Bundle

public class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)
		 
		 var firstYear = findViewById<EditText>(R.id.edt_firstYear)
		 var secondYear = findViewById<EditText>(R.id.edt_secondYear)
		 var btnKlik = findViewById<Button>(R.id.btn)
		 var hasil1 = findViewById<TextView>(R.id.hasil)
		 
		 btnKlik.setOnClickListener {
			 val input1 = firstYear.text.toString()
			 val input2 = secondYear.text.toString()
			 val hasil2 = input2.toInt()-input1.toInt()
			 
			 hasil1.text = "Umur Kamu $hasil2"
		 }
    }
}