package com.example.domain.model

data class Blog(val owner: Owner,
                val image: String = "",
                val publishDate: String = "",
                val id: String = "",
                val text: String = "",
                val likes: Int = 0,
                val tags: List<String>?)
