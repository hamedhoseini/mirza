package com.example.almas

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.almas.util.DateTimeUtil
import java.time.LocalDateTime



class Title : AppCompatActivity() {
    private lateinit var tableRecyclerView: RecyclerView
    private var          userList = ArrayList<TitleProductsTableSpecs>()
    private lateinit var tableRowAdapter: TitleProductsAdapter
    private lateinit var btnAddProduct: Button
    private lateinit var titleSubmitBtn: Button
    private lateinit var titleDateTv: TextView


    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title)

        val barOwnerSpiner: Spinner = findViewById(R.id.bar_owner_spinner)
        val barOwnreArray = arrayOf("انتخاب کنید", "احمد", "محمد", "حسین", "اکبر", "اصغر", "حسن")

        val barOwnreArrayAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, barOwnreArray)
        barOwnerSpiner.adapter = barOwnreArrayAdapter

        val plateSP: Spinner = findViewById(R.id.plate_spinner)
        val plateSPArray = arrayOf("الف", "ب", "پ", "ت", "ث", "ح", "ج")

        val plateSPArrayAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, plateSPArray)
        plateSP.adapter = plateSPArrayAdapter


        userList.add(TitleProductsTableSpecs("جعبه", "بنه 1", 2, "گوجه"))
        userList.add(TitleProductsTableSpecs("سبد", "بنه 2", 2, "خیار"))
        userList.add(TitleProductsTableSpecs("گونی", "بنه 3", 4, "پیاز"))
        userList.add(TitleProductsTableSpecs("جعبه", "بنه 4", 1, "سیب"))
        userList.add(TitleProductsTableSpecs("گونی", "بنه 5", 3, "پرتقال"))
        userList.add(TitleProductsTableSpecs("جعبه", "بنه 1", 2, "موز"))
        userList.add(TitleProductsTableSpecs("سبد", "بنه 2", 2, "انار"))
        userList.add(TitleProductsTableSpecs("گونی", "بنه 3", 4, "کیوی"))
        userList.add(TitleProductsTableSpecs("جعبه", "بنه 4", 1, "طالبی"))
        userList.add(TitleProductsTableSpecs("گونی", "بنه 5", 3, "خربزه"))


        btnAddProduct = findViewById(R.id.btn_add_product)

        btnAddProduct.setOnClickListener {
            var intent = Intent(this, AddProductToTitle::class.java)
            startActivity(intent)

        }


        tableRecyclerView = findViewById(R.id.title_product_recyclerView)
        tableRowAdapter = TitleProductsAdapter(userList)
        tableRecyclerView.layoutManager = LinearLayoutManager(this)
        tableRecyclerView.adapter = tableRowAdapter




        titleSubmitBtn = findViewById(R.id.title_submit_btn)
        titleSubmitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "تیتر ثبت شد", Toast.LENGTH_SHORT).show()
            finish()
        }


        titleDateTv = findViewById(R.id.title_date_tv)


        DateTimeUtil.fillCurrentDateTextView(titleDateTv)


    }




}



