package com.example.jetpackcompose.screens.home

/*** Created by
Harsha Devnani
 ***/

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.common.Resource
import com.example.domain.usecase.BlogsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val blogsUseCase: BlogsUseCase):ViewModel() {

    private val _blogs= mutableStateOf<HomeState>(HomeState())
    val blogs:State<HomeState> =_blogs

    init {
        getBlogs()
    }

    fun getBlogs(){
        blogsUseCase().onEach {
            when (it) {
                is Resource.Loading -> {
                    _blogs.value= HomeState(isLoading = true)
                }
                is Resource.Success -> {
                    _blogs.value=HomeState(data = it.data)
                }
                is Resource.Error -> {
                    _blogs.value=HomeState(error = it.message.toString())

                }
            }
        }.launchIn(viewModelScope)
    }
}