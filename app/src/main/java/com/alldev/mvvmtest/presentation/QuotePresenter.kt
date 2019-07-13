package com.alldev.mvvmtest.presentation

import com.alldev.mvvmtest.common.presenter.Presenter
import com.alldev.mvvmtest.domain.usecase.GetQuoteUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import timber.log.Timber

class QuotePresenter(
    private val view: QuoteView,
    private val useCase: GetQuoteUseCase
) : Presenter() {

    fun getQuote() {
        disposables.add(useCase.execute().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                ::onSuccess,
                Timber::e
            )
        )
    }

    private fun onSuccess(quote: String) {
        view.setQuote(quote)
    }
}