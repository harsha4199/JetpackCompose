package com.example.data.mapper

import com.example.data.network.model.BlogDTO
import com.example.data.network.model.OwnerDTO
import com.example.domain.model.Blog
import com.example.domain.model.Owner

/*** Created by
Harsha Devnani
 ***/

fun List<BlogDTO>.toDomain():List<Blog>{

    return map {
        Blog(
            id = it.id,
            image = it.image,
            likes = it.likes,
            owner = it.owner.toDomain(),
            publishDate = it.publishDate,
            tags = it.tags,
            text = it.text
        )
    }
}

fun OwnerDTO.toDomain():Owner{
    return Owner(
        firstName,
        lastName,
        picture,
        title
    )
}