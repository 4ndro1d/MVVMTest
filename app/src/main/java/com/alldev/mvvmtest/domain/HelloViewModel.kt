package com.alldev.mvvmtest.domain

import androidx.lifecycle.ViewModel
import com.alldev.mvvmtest.domain.repository.HelloRepository

class HelloViewModel(
    private val repository: HelloRepository
) : ViewModel() {

    fun giveHello() =
        repository.getHello()
}