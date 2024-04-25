package com.example.almas.data.model

import com.google.gson.annotations.SerializedName


data class SahebKala (
    @SerializedName("Id_SahebKala")
    val idSahebKala: Long,
    @SerializedName("Id_Action")
    val idAction: Long,
    @SerializedName("SahebKala")
    val sahebKala: String,
    @SerializedName("Neshani")
    val neshani: String,
    @SerializedName("Dis")
    val dis: String,
    @SerializedName("Code_Meli")
    val codeMeli: String,
    @SerializedName("Code_Tejari")
    val codeTejari: String,
    @SerializedName("Shahrestan")
    val shahrestan: String,
    @SerializedName("Ostan")
    val ostan: String,
    @SerializedName("E_Mail")
    val eMail: String,
    @SerializedName("Code_Posti")
    val codePosti: String,
    @SerializedName("BedBes")
    val bedBes: String,
    @SerializedName("BedBesReal")
    val bedBesReal: String,
    @SerializedName("HesabRealCH")
    val hesabRealCH: String,
    @SerializedName("HesabCH")
    val hesabCH: String,
    @SerializedName("Tel")
    val tel: String,
    @SerializedName("Mobile")
    val mobile: String,
    @SerializedName("Mande0")
    val mande0: Long,
    @SerializedName("Hesab")
    val hesab: Long,
    @SerializedName("Hesab_Real")
    val hesabReal: Long
)
