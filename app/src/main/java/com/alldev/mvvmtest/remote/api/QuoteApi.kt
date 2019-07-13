package com.alldev.mvvmtest.remote.api

import com.alldev.mvvmtest.remote.model.RemoteQuote
import io.reactivex.Single
import retrofit2.http.GET

interface QuoteApi {

    @GET(".")
    fun getQuote(): Single<RemoteQuote>
}