package com.github.coderbuck.covid19.bean

data class Area(
        val cities: Any,
        val comment: String,
        val confirmedCount: Int,
        val continentEnglishName: String,
        val continentName: String,
        val countryEnglishName: String,
        val countryName: String,
        val curedCount: Int,
        val currentConfirmedCount: Int,
        val deadCount: Int,
        val locationId: Int,
        val provinceEnglishName: String,
        val provinceName: String,
        val provinceShortName: String,
        val suspectedCount: Int,
        val updateTime: Long
)


