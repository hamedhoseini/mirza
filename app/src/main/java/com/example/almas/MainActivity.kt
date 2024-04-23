package com.example.almas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var userNameTV : TextView
    private lateinit var passwordTV : TextView
    private lateinit var enterBtn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        userNameTV = findViewById(R.id.userName_tv)
        passwordTV = findViewById(R.id.password_tv)
        enterBtn = findViewById(R.id.enter_btn)


        enterBtn.setOnClickListener{
            if (userNameTV.text.toString() == "User1" && passwordTV.text.toString() == "1234"){
                val intent = Intent(this , MainMenuActivity2 :: class.java)
                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this,"نام کاربری یا رمز عبور اشتباه است." , Toast.LENGTH_SHORT).show()
            }
        }
    }
}