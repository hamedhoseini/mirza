package com.example.almas

import android.app.Application
import android.content.Context
import com.orhanobut.hawk.Hawk
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class MirzaApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Hawk.init(applicationContext).build();
    }
}