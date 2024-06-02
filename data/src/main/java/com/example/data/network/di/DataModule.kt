package com.example.data.network.di

import com.example.common.Constants.BASE_URL
import com.example.data.network.ApiService
import com.example.data.repository.BlogsRepositoryImpl
import com.example.domain.repository.BlogsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*** Created by
Harsha Devnani
 ***/

@InstallIn(SingletonComponent::class)
@Module
object DataModule{

    @Provides
    fun provideRetrofit():Retrofit{
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    @Provides
    fun provideApiService(retrofit: Retrofit):ApiService{
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    fun provideBlogsRepository(apiService: ApiService):BlogsRepository{
        return BlogsRepositoryImpl(apiService=apiService)
    }
}