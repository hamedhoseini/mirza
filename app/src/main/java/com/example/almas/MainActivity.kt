package com.example.almas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var titrBtn : CardView
    private lateinit var saleBtn : CardView
    private lateinit var productSubmitBtn : CardView
    private lateinit var customerSubmitBtn : CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main)

        saleBtn = findViewById(R.id.sale_btn)
        saleBtn.setOnClickListener {
            val salePageIntent = Intent(this , SalePage :: class.java )
            startActivity(salePageIntent)
        }



        titrBtn = findViewById(R.id.title_btn)

        titrBtn.setOnClickListener{

           val titlePageIntent = Intent(this , Title :: class.java )
            startActivity(titlePageIntent)

        }
        productSubmitBtn = findViewById(R.id.product_submit_btn)
        productSubmitBtn.setOnClickListener {
            val productSubmitIntent = Intent(this , ProductSubmit :: class.java )
            startActivity(productSubmitIntent)
        }

        customerSubmitBtn = findViewById(R.id.customer_submit_btn)
        customerSubmitBtn.setOnClickListener {
            val customerSubmitIntent = Intent(this , CustumerSubmit :: class.java )
            startActivity(customerSubmitIntent)
        }


    }
}