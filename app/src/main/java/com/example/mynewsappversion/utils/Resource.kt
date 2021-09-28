package com.example.mynewsappversion.utils


//Sealed class is a kind of abstract class in which we define which class we can inherit from Resource class
sealed class Resource <T>(
    val data : T? = null,
    val message : String? = null
        ){

    class Success<T>(data : T) : Resource<T>(data)
    class Error<T>(message : String, data : T?=null) : Resource<T>(data,message)
    class Loading<T> : Resource<T>()

}