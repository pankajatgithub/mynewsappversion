package com.example.mynewsappversion.ui.Fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mynewsappversion.R
import com.example.mynewsappversion.ui.NewsActivity
import com.example.mynewsappversion.ui.NewsViewModel

class ArticleFragment:Fragment(R.layout.fragment_article) {
    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = (activity as NewsActivity).viewModel
    }
}