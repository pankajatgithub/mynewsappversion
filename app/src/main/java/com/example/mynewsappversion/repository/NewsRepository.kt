package com.example.mynewsappversion.repository

import com.example.mynewsappversion.db.ArticleDatabase
import com.example.mynewsappversion.network.api.RetrofitInstance

//for api we need to call retrofitinstance which we call directly,not need to pass inside parameters
class NewsRepository(
//    val db : ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode : String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)


}