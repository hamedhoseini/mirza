package com.example.almas.util

import android.os.Build
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

object DateTimeUtil {


    @RequiresApi(Build.VERSION_CODES.O)
    fun fillCurrentDateTextView(dateTv: TextView) {

        val current = LocalDateTime.now()
        val gy = current.year
        val gm = current.monthValue
        val gd = current.dayOfMonth
        val jalalDate = gregorianToJalali(gy, gm, gd)
        val jy = jalalDate[0]
        val jm = jalalDate[1]
        val jd = jalalDate[2]


        dateTv.text = "$jy/$jm/$jd"

    }


    fun gregorianToJalali(gy: Int, gm: Int, gd: Int): IntArray {
        var g_d_m: IntArray = intArrayOf(0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334)
        var gy2: Int = if (gm > 2) (gy + 1) else gy
        var days: Int =
            355666 + (365 * gy) + ((gy2 + 3) / 4).toInt() - ((gy2 + 99) / 100).toInt() + ((gy2 + 399) / 400).toInt() + gd + g_d_m[gm - 1]
        var jy: Int = -1595 + (33 * (days / 12053).toInt())
        days %= 12053
        jy += 4 * (days / 1461).toInt()
        days %= 1461
        if (days > 365) {
            jy += ((days - 1) / 365).toInt()
            days = (days - 1) % 365
        }
        var jm: Int;
        var jd: Int;
        if (days < 186) {
            jm = 1 + (days / 31).toInt()
            jd = 1 + (days % 31)
        } else {
            jm = 7 + ((days - 186) / 30).toInt()
            jd = 1 + ((days - 186) % 30)
        }
        return intArrayOf(jy, jm, jd)
    }


}