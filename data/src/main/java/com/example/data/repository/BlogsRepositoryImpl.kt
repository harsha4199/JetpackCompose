package com.example.data.repository

/*** Created by
Harsha Devnani
 ***/

import com.example.data.mapper.toDomain
import com.example.data.network.ApiService
import com.example.data.network.utils.SafeApiRequest
import com.example.domain.model.Blog
import com.example.domain.repository.BlogsRepository
import retrofit2.Response
import javax.inject.Inject

class BlogsRepositoryImpl @Inject constructor(private val apiService: ApiService): BlogsRepository,SafeApiRequest() {
    override suspend fun getBlogs(): List<Blog> {
        val response = safeApiRequest { apiService.getBlogs() }
        return response.data?.toDomain()?: emptyList()
    }
}