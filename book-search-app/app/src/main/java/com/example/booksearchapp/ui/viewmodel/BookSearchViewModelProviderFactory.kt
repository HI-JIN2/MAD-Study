package com.example.booksearchapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.booksearchapp.data.repository.BookSearchRepository

@Suppress
class BookSearchViewModelProviderFactory (
    private val bookSearchRepository: BookSearchRepository
        ): ViewModelProvider.Factory{
            override fun<T:ViewModel> create(modelClass:Class<T>):T{
                if(modelClass.isAssignableFrom(BookSearchViewModel::class.java)){
                    return BookSearchViewModel(bookSearchRepository) as T
                }
                throw IllegalArgumentException("ViewModel class not fount")
            }


}