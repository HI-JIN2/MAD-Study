package com.example.booksearchapp.data.repository

import com.example.booksearchapp.data.model.SearchResponse
import retrofit2.Response
import retrofit2.http.Query

interface BookSearchRepository {
    suspend fun searchBooks(
        query: String,
        sort: String,
        page: Int,
        size: Int
    ): Response<SearchResponse>
}