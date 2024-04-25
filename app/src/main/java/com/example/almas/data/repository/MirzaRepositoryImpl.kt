package com.example.almas.data.repository

import com.example.almas.data.model.Kala
import com.example.almas.data.model.LoginResponse
import com.example.almas.data.model.Moshtari
import com.example.almas.data.model.SahebKala
import com.example.almas.data.service.ApiService

class MirzaRepositoryImpl(private val apiService: ApiService) : MirzaRepository {
    override suspend fun postLogin(username:String, password:String): List<LoginResponse> {
        return apiService.postLogin(userName = username, password = password)
    }
    override suspend fun getAllKala(): List<Kala> {
        return apiService.getAllKala()
    }
    override suspend fun getAllMoshtari(): List<Moshtari> {
        return apiService.getAllMoshtari()
    }
    override suspend fun getAllSahebKala(): List<SahebKala> {
        return apiService.getAllSahebKala()
    }
}