package com.example.almas

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.almas.util.DateTimeUtil
import com.example.almas.viewModels.SaleViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SalePage : AppCompatActivity() {

    private lateinit var saleSubmitBtn: Button
    private lateinit var saleDateTv: TextView
    private lateinit var saleWeightEt: EditText
    private lateinit var saleFeeEt: EditText
    private lateinit var salePriceTv: TextView
    private lateinit var saleCalPriceBtn: Button
    val saleViewModel by viewModels<SaleViewModel>()


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sale_page)


        val customerNameSpinner: Spinner = findViewById(R.id.customer_name_spinner)
        val customerNameLoading: ProgressBar = findViewById(R.id.customer_name_loading)

        saleViewModel.moshtariList.observe(this) {
            customerNameLoading.visibility=View.GONE
            val moshtariArray = it.map { it.mnf }
            val moshtariArrayAdapter =
                ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, moshtariArray)
            customerNameSpinner.adapter = moshtariArrayAdapter
        }

        val saleBarOwnerSpiner: Spinner = findViewById(R.id.sale_bar_owner_spinner)
        val ownerNameLoading: ProgressBar = findViewById(R.id.owner_name_loading)

        saleViewModel.sahebKalaList.observe(this) {
            ownerNameLoading.visibility=View.GONE
            val saleBarOwnreArray = it.map { it.sahebKala }
            val saleBarOwnreArrayAdapter =
                ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, saleBarOwnreArray)
            saleBarOwnerSpiner.adapter = saleBarOwnreArrayAdapter
        }


        val saleProductNameSpiner: Spinner = findViewById(R.id.sale_product_name_spinner)
        val productNameLoading: ProgressBar = findViewById(R.id.product_name_loading)

        saleViewModel.productsList.observe(this) {
            productNameLoading.visibility=View.GONE
            val saleProductNameArray = it.map { it.kalaName }
            val saleProductNameArrayAdapter =
                ArrayAdapter(
                    this,
                    android.R.layout.simple_spinner_dropdown_item,
                    saleProductNameArray
                )
            saleProductNameSpiner.adapter = saleProductNameArrayAdapter

        }


        saleSubmitBtn = findViewById(R.id.sale_submit_btn)
        saleSubmitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "فاکتور ثبت شد", Toast.LENGTH_SHORT).show()
            finish()
        }

        saleDateTv = findViewById(R.id.sale_date_tv)
        DateTimeUtil.fillCurrentDateTextView(saleDateTv)

//        saleWeightEt = findViewById(R.id.sale_weight_et)
//        saleFeeEt = findViewById(R.id.sale_fee_et)
//        salePriceTv = findViewById(R.id.sale_price_tv)
//        saleCalPriceBtn = findViewById(R.id.sale_cal_price_btn)
//
//
//
//
//        saleCalPriceBtn.setOnClickListener {
//
//            if (saleWeightEt.text !== null && saleFeeEt.text !== null  ){
//
//                var x = saleWeightEt.text.toString() * saleFeeEt.text.toString()
//
//            }
//
//
//        }


    }
}
