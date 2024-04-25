package com.example.almas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import androidx.cardview.widget.CardView
import com.example.almas.data.repository.MirzaRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.runBlocking
import javax.inject.Inject
import kotlin.math.log

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var titrBtn : CardView
    private lateinit var saleBtn : CardView
    private lateinit var productSubmitBtn : CardView
    private lateinit var customerSubmitBtn : CardView

    @Inject
    lateinit var mirzaRepository: MirzaRepository

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
        productSubmitBtn = findViewById(R.id.product_submit_btn)
        productSubmitBtn.setOnClickListener {
            var intent3 = Intent(this , ProductSubmit :: class.java )
            startActivity(intent3)
        }

        customerSubmitBtn = findViewById(R.id.customer_submit_btn)
        customerSubmitBtn.setOnClickListener {
            var intent4 = Intent(this , CustumerSubmit :: class.java )
            startActivity(intent4)
        }


    }
}