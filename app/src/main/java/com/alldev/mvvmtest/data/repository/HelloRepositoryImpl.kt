package com.alldev.mvvmtest.data.repository

import com.alldev.mvvmtest.domain.repository.HelloRepository

class HelloRepositoryImpl : HelloRepository {

    override fun getHello(): String =
        "Hello"
}