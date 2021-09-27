package com.example.mynewsappversion.network.models

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)