package com.example.almas.data.model

import com.google.gson.annotations.SerializedName

data class LoginResponse (
    @SerializedName("Id_User")
    val idUser: Long,
    @SerializedName("Token")
    val token: String?,
    @SerializedName("UserName")
    val userName: String,
    @SerializedName("Pass")
    val pass: String,
    @SerializedName("MenuAccess")
    val menuAccess: String,
    @SerializedName("ComAccess")
    val comAccess: String
)
