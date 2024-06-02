package com.example.domain.model

data class Blogs(
    val total: Int = 0,
    val data: List<Blog>?,
    val limit: Int = 0,
    val page: Int = 0)