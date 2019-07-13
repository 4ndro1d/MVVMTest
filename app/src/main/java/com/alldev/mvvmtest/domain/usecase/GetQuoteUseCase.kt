package com.alldev.mvvmtest.domain.usecase

import com.alldev.mvvmtest.common.domain.NoArgsUseCase
import com.alldev.mvvmtest.domain.repository.QuoteRepository
import io.reactivex.Single

class GetQuoteUseCase(
    private val repository: QuoteRepository
) : NoArgsUseCase<Single<String>> {

    override fun execute(): Single<String> =
        repository.getQuote()
}