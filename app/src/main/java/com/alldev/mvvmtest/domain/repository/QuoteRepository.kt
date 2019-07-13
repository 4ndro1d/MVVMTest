package com.alldev.mvvmtest.domain.repository

import io.reactivex.Single

interface QuoteRepository {

    fun getQuote(): Single<String>
}
