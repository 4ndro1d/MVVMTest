package com.alldev.mvvmtest.common.domain

interface NoArgsUseCase<RETURN> {

    fun execute(): RETURN
}