package com.alldev.mvvmtest.common.presenter

import io.reactivex.disposables.CompositeDisposable

abstract class Presenter {

    internal val disposables = CompositeDisposable()

    fun onViewDestroyed() {
        disposables.clear()
    }
}