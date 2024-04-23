package com.example.almas.di

import com.example.almas.data.repository.MirzaRepository
import com.example.almas.data.repository.MirzaRepositoryImpl
import com.example.almas.data.service.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MirzaRepositoryModule {

    @Singleton
    @Provides
    fun provideProductsRepository(
        apiService: ApiService
    ): MirzaRepository {
        return MirzaRepositoryImpl(apiService)
    }
}