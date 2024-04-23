package com.example.almas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainMenuActivity2 : AppCompatActivity() {

    private lateinit var titrBtn : Button
    private lateinit var saleBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu2)

        saleBtn = findViewById(R.id.sale_btn)
        saleBtn.setOnClickListener {
            var intent2 = Intent(this , SalePage :: class.java )
            startActivity(intent2)
        }



        titrBtn = findViewById(R.id.title_btn)

        titrBtn.setOnClickListener{

           var intent = Intent(this , Title :: class.java )
            startActivity(intent)

        }


    }
}