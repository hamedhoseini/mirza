package com.example.almas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class AddProductToTitle : AppCompatActivity() {

    private lateinit var addProductToTitleResultBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product_to_title)

        val addProductNameSpiner: Spinner = findViewById(R.id.add_product_to_title_product_name_spinner)
        val addProductNameArray = arrayOf("انتخاب کنید", "گوجه", "خیار", "سیب", "موز", "پرتقال", "انار", "هندوانه", "طالبی", "خربزه", "کیوی")
        val saleProductNameArrayAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, addProductNameArray)
        addProductNameSpiner.adapter = saleProductNameArrayAdapter

        val packagingTypeSpinner: Spinner = findViewById(R.id.packaging_type_spinner)
        val packagingTypeArray = arrayOf("انتخاب کنید", "فله", "کیسه", "کارتن", "جعبه", "سبد", "گونی")

        val barOwnreArrayAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, packagingTypeArray)
        packagingTypeSpinner.adapter = barOwnreArrayAdapter

        addProductToTitleResultBtn = findViewById(R.id.add_product_to_title_result_btn)

        addProductToTitleResultBtn.setOnClickListener {
            var intent = Intent(this, Title::class.java)
            startActivity(intent)
            Toast.makeText(this,"محصول مورد نظر اضافه شد", Toast.LENGTH_SHORT).show()
            finish()
        }



    }
}