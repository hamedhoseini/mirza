package com.example.almas.data.service

import com.example.almas.data.model.Kala
import com.example.almas.data.model.LoginResponse
import com.example.almas.data.model.Moshtari
import com.example.almas.data.model.SahebKala
import com.example.almas.util.PreferenceUtils
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @POST("/login")
    suspend fun postLogin(@Query("UserName_n") userName: String,
                          @Query("Pass_n") password: String): List<LoginResponse>

    @GET("/kala")
    suspend fun getAllKala(@Header("token") token: String = PreferenceUtils.getToken(),
    ): List<Kala>


    @GET("/sahebkala")
    suspend fun getAllSahebKala(@Header("token") token: String = PreferenceUtils.getToken()): List<SahebKala>

    @GET("/mosh")
    suspend fun getAllMoshtari(@Header("token") token: String = PreferenceUtils.getToken()): List<Moshtari>

}