package com.example.jetpackcompose.screens.home

/*** Created by
Harsha Devnani
 ***/

import com.example.domain.model.Blog

data class HomeState (
    var isLoading:Boolean=false,
    var data: List<Blog>?=null,
    var error: String=""
)