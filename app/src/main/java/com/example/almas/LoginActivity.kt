package com.example.almas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.almas.data.repository.MirzaRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    private lateinit var userNameTV: TextView
    private lateinit var passwordTV: TextView
    private lateinit var enterBtn: Button

    @Inject
    lateinit var mirzaRepository: MirzaRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        userNameTV = findViewById(R.id.userName_tv)
        passwordTV = findViewById(R.id.password_tv)
        enterBtn = findViewById(R.id.enter_btn)


        enterBtn.setOnClickListener {
            if (userNameTV.text.toString().isNotEmpty() && passwordTV.text.toString()
                    .isNotEmpty()
            ) {
                makeLogin()
            } else {
                showToast("نام کاربری/رمز عبور را وارد کنید.")
            }
        }
    }

    private fun makeLogin() {
        runBlocking {
            try {
                val loginResponse = mirzaRepository.postLogin(
                    userNameTV.text.toString(),
                    passwordTV.text.toString()
                )

                if (loginResponse[0].token != null) {
                    val intent = Intent(this@LoginActivity, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    showToast("نام کاربری یا رمز عبور اشتباه است.")
                }
            } catch (exception: Exception) {
                showToast("نام کاربری یا رمز عبور اشتباه است.")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(
            this@LoginActivity,
            message,
            Toast.LENGTH_SHORT
        ).show()
    }
}