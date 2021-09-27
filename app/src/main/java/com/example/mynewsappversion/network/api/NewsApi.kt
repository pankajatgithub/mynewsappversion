package com.example.mynewsappversion.network.api

import com.example.mynewsappversion.network.response.NewsResponse
import com.example.mynewsappversion.utils.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")countyCode:String = "in",
        @Query("page")pageNumber:Int = 1,
        @Query("apiKey")apiKey:String = API_KEY,
    ):Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")searchQuery:String,
        @Query("page")pageNumber:Int = 1,
        @Query("apiKey")apiKey:String = API_KEY,
    ):Response<NewsResponse>
}