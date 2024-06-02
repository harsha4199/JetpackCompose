package com.example.domain.di

/*** Created by
Harsha Devnani
 ***/

import com.example.domain.repository.BlogsRepository
import com.example.domain.usecase.BlogsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {

    @Provides
    fun provideBlogsUseCase(blogsRepository: BlogsRepository):BlogsUseCase{
        return BlogsUseCase(blogsRepository)
    }
}