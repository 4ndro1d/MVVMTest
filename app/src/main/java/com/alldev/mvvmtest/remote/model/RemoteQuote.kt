package com.alldev.mvvmtest.remote.model

import com.squareup.moshi.Json

data class RemoteQuote(
    @Json(name = "quote") val quote: String
)