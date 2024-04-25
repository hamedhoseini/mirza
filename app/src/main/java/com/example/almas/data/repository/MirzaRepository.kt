package com.example.almas.data.repository

import com.example.almas.data.model.Kala
import com.example.almas.data.model.LoginResponse
import com.example.almas.data.model.Moshtari
import com.example.almas.data.model.SahebKala

interface MirzaRepository {
    suspend fun postLogin(username: String, password: String): List<LoginResponse>
    suspend fun getAllKala(): List<Kala>
    suspend fun getAllMoshtari(): List<Moshtari>
    suspend fun getAllSahebKala(): List<SahebKala>
}