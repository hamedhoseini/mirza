package com.example.almas.data.repository

import com.example.almas.data.model.LoginResponse

interface MirzaRepository {
    suspend fun postLogin(username: String, password: String): List<LoginResponse>
}