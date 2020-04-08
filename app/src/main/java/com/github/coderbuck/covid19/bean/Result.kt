package com.github.coderbuck.covid19.bean

data class Result<T>(
        val results: List<T>,
        val success: Boolean
)