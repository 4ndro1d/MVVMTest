package com.alldev.mvvmtest.remote.repository

import com.alldev.mvvmtest.data.repository.QuoteRemoteSource
import com.alldev.mvvmtest.remote.api.QuoteApi
import com.alldev.mvvmtest.remote.mapper.RemoteQuoteMapper
import io.reactivex.Single

class QuoteRemoteSourceImpl(
    private val api: QuoteApi,
    private val mapper: RemoteQuoteMapper
) : QuoteRemoteSource {

    override fun getQuote(): Single<String> =
        api.getQuote().map(mapper::map)
}