package com.example.almas.data.model

import com.google.gson.annotations.SerializedName

data class Moshtari(
    @SerializedName("Id_Mosh")
    val idMosh: Long,
    @SerializedName("Id_Action")
    val idAction: Long,
    @SerializedName("MName")
    val mName: String,
    @SerializedName("MFam")
    val mFam: String,
    @SerializedName("MNF")
    val mnf: String,
    @SerializedName("MFN")
    val mfn: String,
    @SerializedName("Neshani")
    val neshani: String,
    @SerializedName("Onvan")
    val onvan: String,
    @SerializedName("Shakhsi")
    val shakhsi: String,
    @SerializedName("Dis")
    val dis: String,
    @SerializedName("BedBes")
    val bedBes: String,
    @SerializedName("BedBesReal")
    val bedBesReal: String,
    @SerializedName("HesabCH")
    val hesabCH: String,
    @SerializedName("HesabRealCH")
    val hesabRealCH: String,
    @SerializedName("ChekNoPass")
    val chekNoPass: String,
    @SerializedName("T1")
    val t1: String,
    @SerializedName("Hesab_Real")
    val hesabReal: Long,
    @SerializedName("Hesab")
    val hesab: Long,
    @SerializedName("HSB")
    val hsb: Long,
    @SerializedName("TempFrushCount")
    val tempFrushCount: Long
)
