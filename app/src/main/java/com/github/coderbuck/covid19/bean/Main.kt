package com.github.coderbuck.covid19.bean

fun main() {
    val bean = Result<OverAll>(listOf(), true)
    println(bean.success)
}