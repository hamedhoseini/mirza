package com.example.almas

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

import android.content.Intent
import android.os.Handler
import android.preference.PreferenceManager.getDefaultSharedPreferences
import android.util.Log
import com.mihahoni.productslistapp.util.Constants


class StartUpScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler().postDelayed({
            if (isLogin()) {
                val mainActivity = Intent(
                    this,
                    MainActivity::class.java
                )
                startActivity(mainActivity)
            } else {
                val loginActivity = Intent(
                    this,
                    LoginActivity::class.java
                )
                startActivity(loginActivity)
            }

            finish()
        }, 2000)
    }

    private fun isLogin(): Boolean {
        val sharedPref = getDefaultSharedPreferences(this) ?: return false
        val token = sharedPref.getString(Constants.TOKEN_KEY, "")
        Log.i("99999", token.toString() + "  " + !token.isNullOrEmpty())
        return !token.isNullOrEmpty()
    }


}
