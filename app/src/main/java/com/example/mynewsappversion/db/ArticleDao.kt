package com.example.mynewsappversion.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mynewsappversion.network.response.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article : Article) : Long

    @Query("SELECT * FROM articles")//function is returning livedata object hence it cant be suspend function
    fun getAllArticles() : LiveData<List<Article>>
//viewmodel enable fragments to subscribe livedata changes,whenever database changes,livedata updates the subscribers about changes.

   @Delete
   suspend fun deleteArticle(article: Article)

}