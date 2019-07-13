package com.alldev.mvvmtest.common.domain

interface UseCase<PARAMS, RETURN> {

    fun execute(params: PARAMS): RETURN
}