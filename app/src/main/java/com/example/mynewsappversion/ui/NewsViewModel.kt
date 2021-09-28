package com.example.mynewsappversion.ui

import androidx.lifecycle.ViewModel
import com.example.mynewsappversion.repository.NewsRepository

class NewsViewModel(
    val repository : NewsRepository
) : ViewModel() {
}