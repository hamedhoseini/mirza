package com.example.almas.data.repository

import com.example.almas.data.model.LoginResponse
import com.example.almas.data.service.ApiService

class MirzaRepositoryImpl(private val apiService: ApiService) : MirzaRepository {
    override suspend fun postLogin(username:String, password:String): List<LoginResponse> {
        return apiService.postLogin(userName = username, password = password)
    }
}