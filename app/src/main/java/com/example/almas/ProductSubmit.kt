package com.example.almas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class ProductSubmit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_submit)

        val productGroupSpinner : Spinner = findViewById(R.id.product_group_spinner)
        val productGroupSpinnerArray = arrayOf("انتخاب کنید","فرنگیجات","سبزیجات","مرکبات")
        val productGroupSpinnerAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, productGroupSpinnerArray)
        productGroupSpinner.adapter = productGroupSpinnerAdapter


        val unitSpinner : Spinner = findViewById(R.id.product_group_spinner)
        val unitSpinnerArray = arrayOf("انتخاب کنید","کیلوگرم","عدد")
        val unitSpinnerAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, unitSpinnerArray)
        unitSpinner.adapter = unitSpinnerAdapter


    }
}