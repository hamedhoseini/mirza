package com.example.almas.util

import com.mihahoni.productslistapp.util.Constants
import com.orhanobut.hawk.Hawk


object PreferenceUtils {

    fun saveTokenToSP(token: String?) {

        Hawk.put(Constants.TOKEN_KEY, token);
    }

    fun getToken(): String {
        return Hawk.get(Constants.TOKEN_KEY)?:""
    }
}