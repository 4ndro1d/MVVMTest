package com.alldev.mvvmtest.common.mapper

interface Mapper<FROM, TO> {

    fun map(from: FROM): TO
}