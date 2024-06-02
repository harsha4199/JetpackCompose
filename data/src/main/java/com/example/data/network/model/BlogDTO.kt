package com.example.data.network.model

/*** Created by
Harsha Devnani
 ***/

data class BlogDTO(val owner: OwnerDTO,
                   val image: String = "",
                   val publishDate: String = "",
                   val id: String = "",
                   val text: String = "",
                   val likes: Int = 0,
                   val tags: List<String>?)