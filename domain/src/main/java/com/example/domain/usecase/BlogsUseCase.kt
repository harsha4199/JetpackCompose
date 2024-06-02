package com.example.domain.usecase

/*** Created by
Harsha Devnani
 ***/

import com.example.common.Resource
import com.example.domain.model.Blog
import com.example.domain.repository.BlogsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception
import javax.inject.Inject

class BlogsUseCase @Inject constructor(private val repository: BlogsRepository){

     operator fun invoke():Flow<Resource<List<Blog>>> = flow {
        emit(Resource.Loading(null))
        try {
            val response = repository.getBlogs()
            emit(Resource.Success(data = response))
        }catch (e:Exception){
            emit(Resource.Error("error occured :$e"))
        }
    }
}