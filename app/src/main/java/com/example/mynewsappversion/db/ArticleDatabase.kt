package com.example.mynewsappversion.db


import android.content.Context
import androidx.room.*
import com.example.mynewsappversion.network.models.Article

//Database class for Room is always abstract class
@Database(
    entities = [Article::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class ArticleDatabase : RoomDatabase() {

    abstract fun getArticleDao() : ArticleDao

    companion object {
        @Volatile  //volatile means other threads immediately see when a thread changes this instance
        private var instance : ArticleDatabase? = null
        private val lock = Any() //it is used to synchronize setting this instance,we will make sure that there only instance of database
        //Everything that happens inside the synchronized block can be accessed by other threads at the same time,hence we make sure other will not set this instnace while it is already set.
        operator fun invoke(context:Context)= instance ?: synchronized(lock){
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) =
             Room.databaseBuilder(
                 context.applicationContext,
                 ArticleDatabase::class.java,
                 "article.db"
             ).build()

    }
}