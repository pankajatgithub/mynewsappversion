package com.example.mynewsappversion.repository

import com.example.mynewsappversion.db.ArticleDatabase

//for api we need to call retrofitinstance which we call directly,not need to pass inside parameters
class NewsRepository(
    val db : ArticleDatabase
) {
}