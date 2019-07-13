package com.alldev.mvvmtest.di

import com.alldev.mvvmtest.data.repository.HelloRepositoryImpl
import com.alldev.mvvmtest.domain.HelloViewModel
import com.alldev.mvvmtest.domain.repository.HelloRepository
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single<HelloRepository> { HelloRepositoryImpl() }
    viewModel { HelloViewModel(get()) }
}