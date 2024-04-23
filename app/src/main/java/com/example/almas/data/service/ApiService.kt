package com.example.almas.data.service

import com.example.almas.data.model.LoginResponse
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @POST("/login")
    suspend fun postLogin(@Query("UserName_n") userName: String,
                          @Query("Pass_n") password: String): List<LoginResponse>

}