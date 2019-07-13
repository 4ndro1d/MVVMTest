package com.alldev.mvvmtest.common.extensions

import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

fun <T> Single<T>.observeOnMain() = observeOn(AndroidSchedulers.mainThread())
fun <T> Single<T>.subscribeOnIo() = subscribeOn(Schedulers.io())