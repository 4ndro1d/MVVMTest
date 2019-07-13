package com.alldev.mvvmtest.data.repository

import io.reactivex.Single

interface QuoteRemoteSource {

    fun getQuote(): Single<String>
}
