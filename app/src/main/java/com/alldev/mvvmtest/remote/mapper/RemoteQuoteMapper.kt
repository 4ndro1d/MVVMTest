package com.alldev.mvvmtest.remote.mapper

import com.alldev.mvvmtest.common.mapper.Mapper
import com.alldev.mvvmtest.remote.model.RemoteQuote

class RemoteQuoteMapper : Mapper<RemoteQuote, String> {

    override fun map(from: RemoteQuote): String = with(from) {
        quote
    }
}