package com.alldev.mvvmtest.viewmodel

import androidx.lifecycle.MutableLiveData
import com.alldev.mvvmtest.common.extensions.observeOnMain
import com.alldev.mvvmtest.common.extensions.subscribeOnIo
import com.alldev.mvvmtest.common.viewmodel.RxViewModel
import com.alldev.mvvmtest.domain.usecase.GetQuoteUseCase
import io.reactivex.rxkotlin.plusAssign
import io.reactivex.rxkotlin.subscribeBy
import timber.log.Timber

class QuoteViewModel(
    private val useCase: GetQuoteUseCase
) : RxViewModel() {

    val quoteLiveData: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun getQuote() {
        disposables += useCase.execute()
            .subscribeOnIo()
            .observeOnMain()
            .subscribeBy(
                onSuccess = ::handleSuccess,
                onError = Timber::e
            )
    }

    private fun handleSuccess(quote: String) {
        Timber.e(quote)
        quoteLiveData.value = quote
    }
}