package com.example.mynewsappversion.network.models

import androidx.room.Entity
import androidx.room.PrimaryKey

//@Entity specify table name
@Entity(
    tableName = "articles"
)
data class Article(
    @PrimaryKey(autoGenerate = true)
    val id : Int? = null,

    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source, //Room only handle  primitive dataTypes,for custom datatype,we have to use Typecoverter to interret Room how to handle them
    val title: String,
    val url: String,
    val urlToImage: String
)