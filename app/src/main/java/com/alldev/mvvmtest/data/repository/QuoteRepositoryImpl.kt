package com.alldev.mvvmtest.data.repository

import com.alldev.mvvmtest.domain.repository.QuoteRepository

class QuoteRepositoryImpl(
    private val remote: QuoteRemoteSource
) : QuoteRepository {

    override fun getQuote() =
        remote.getQuote()
}