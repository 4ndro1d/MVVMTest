package com.alldev.mvvmtest.remote.repository

import com.alldev.mvvmtest.data.repository.QuoteRemoteSource
import com.alldev.mvvmtest.remote.api.QuoteApi
import io.reactivex.Single

class QuoteRemoteSourceImpl(
    private val api: QuoteApi
) : QuoteRemoteSource {

    override fun getQuote(): Single<String> =
        api.getQuote().map {
            it.quote
        }
}