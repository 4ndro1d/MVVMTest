package com.alldev.mvvmtest.domain

import androidx.lifecycle.ViewModel
import com.alldev.mvvmtest.domain.repository.QuoteRepository

class QuoteViewModel(
    private val repository: QuoteRepository
) : ViewModel() {

    fun getQuote() =
        repository.getQuote()
}