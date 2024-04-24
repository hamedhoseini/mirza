package com.example.almas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var titrBtn : CardView
    private lateinit var saleBtn : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main)

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