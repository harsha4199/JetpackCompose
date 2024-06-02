package com.example.data.network.model

/*** Created by
Harsha Devnani
 ***/

data class BlogsDTO(val total: Int = 0,
                    val data: List<BlogDTO>?,
                    val limit: Int = 0,
                    val page: Int = 0)