package com.alldev.mvvmtest.common.mapper

interface BiDirectionalMapper<FROM, TO> {

    fun from(from: FROM): TO

    fun to(to: TO): FROM
}