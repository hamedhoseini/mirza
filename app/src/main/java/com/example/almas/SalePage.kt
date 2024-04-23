package com.example.almas

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi

class SalePage : AppCompatActivity() {

    private lateinit var saleSubmitBtn : Button
    private lateinit var saleDateTv : TextView
    private lateinit var saleWeightEt : EditText
    private lateinit var saleFeeEt : EditText
    private lateinit var salePriceTv : TextView
    private lateinit var saleCalPriceBtn :Button


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sale_page)


        val customerNameSpinner : Spinner = findViewById(R.id.customer_name_spinner)
        val customerNameSpinnerArray = arrayOf("انتخاب کنید","آرشا","کیانوش","هیراد","شروین","ایلیا","آیین")
        val customerNameSpinnerAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, customerNameSpinnerArray)
        customerNameSpinner.adapter = customerNameSpinnerAdapter




        val saleBarOwnerSpiner: Spinner = findViewById(R.id.sale_bar_owner_spinner)
        val saleBarOwnreArray = arrayOf("انتخاب کنید", "احمد", "محمد", "حسین", "اکبر", "اصغر", "حسن")
        val saleBarOwnreArrayAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, saleBarOwnreArray)
        saleBarOwnerSpiner.adapter = saleBarOwnreArrayAdapter



        val saleProductNameSpiner: Spinner = findViewById(R.id.sale_product_name_spinner)
        val saleProductNameArray = arrayOf("انتخاب کنید", "گوجه", "خیار", "سیب", "موز", "پرتقال", "انار", "هندوانه", "طالبی", "خربزه", "کیوی")
        val saleProductNameArrayAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, saleProductNameArray)
        saleProductNameSpiner.adapter = saleProductNameArrayAdapter


        saleSubmitBtn = findViewById(R.id.sale_submit_btn)
        saleSubmitBtn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this,"فاکتور ثبت شد" , Toast.LENGTH_SHORT).show()
            finish()
        }

        saleDateTv = findViewById(R.id.sale_date_tv)
        fillCurrentDateTextView(saleDateTv)

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
