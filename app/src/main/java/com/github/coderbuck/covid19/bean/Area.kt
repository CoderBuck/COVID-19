package com.github.coderbuck.covid19.bean

data class Area(
        val cities: List<CityInfo>?,
        val comment: String?,
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

data class CityInfo(
        val cityName: String,
        val confirmedCount: Int,
        val curedCount: Int,
        val currentConfirmedCount: Int,
        val deadCount: Int,
        val locationId: Int,
        val suspectedCount: Int
)


