package com.alldev.mvvmtest.di

import com.alldev.mvvmtest.data.repository.QuoteRemoteSource
import com.alldev.mvvmtest.data.repository.QuoteRepositoryImpl
import com.alldev.mvvmtest.domain.QuoteViewModel
import com.alldev.mvvmtest.domain.repository.QuoteRepository
import com.alldev.mvvmtest.domain.usecase.GetQuoteUseCase
import com.alldev.mvvmtest.presentation.QuotePresenter
import com.alldev.mvvmtest.presentation.QuoteView
import com.alldev.mvvmtest.remote.api.QuoteApi
import com.alldev.mvvmtest.remote.repository.QuoteRemoteSourceImpl
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

val appModule = module {

    single<QuoteApi> {
        Retrofit.Builder()
            .baseUrl("https://api.kanye.rest")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(QuoteApi::class.java)
    }

    single<QuoteRemoteSource> { QuoteRemoteSourceImpl(get()) }
    single<QuoteRepository> { QuoteRepositoryImpl(get()) }
    single { GetQuoteUseCase(get()) }
    single { (view: QuoteView) -> QuotePresenter(view, get()) }
    viewModel { QuoteViewModel(get()) }
}