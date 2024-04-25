package com.example.almas.data.model

import com.google.gson.annotations.SerializedName

data class Kala (
    @SerializedName("Id_Kala")
    val idKala: Long,
    @SerializedName("Id_Action")
    val idAction: Long,
    @SerializedName("Active")
    val active: Boolean,
    @SerializedName("Id_Group")
    val idGroup: Long,
    @SerializedName("KalaName")
    val kalaName: String,
    @SerializedName("KalaNamePrint")
    val kalaNamePrint: String,
    @SerializedName("GroupCH")
    val groupCH: Enums.GroupCH,
    @SerializedName("MabFrush")
    val mabFrush: String,
    @SerializedName("Id_Vahed")
    val idVahed: Long,
    @SerializedName("Vahed")
    val vahed: Enums.Vahed,
    @SerializedName("Virtual_Mojudi")
    val virtualMojudi: Long,
    @SerializedName("Mojudi")
    val mojudi: Long,
    @SerializedName("ArzeshKala")
    val arzeshKala: Long,
    @SerializedName("Dis")
    val dis: String,
    @SerializedName("Mojudi0")
    val mojudi0: Long
)


