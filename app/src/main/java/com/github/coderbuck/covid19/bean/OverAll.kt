package com.github.coderbuck.covid19.bean

data class OverAll(
        val confirmedCount: Int,        //累计确诊人数
        val confirmedIncr: Int,         //
        val curedCount: Int,
        val curedIncr: Int,
        val currentConfirmedCount: Int,
        val currentConfirmedIncr: Int,
        val deadCount: Int,
        val deadIncr: Int,
        val generalRemark: String,
        val note1: String,
        val note2: String,
        val note3: String,
        val remark1: String,
        val remark2: String,
        val remark3: String,
        val remark4: String,
        val remark5: String,
        val seriousCount: Int,
        val seriousIncr: Int,
        val suspectedCount: Int,
        val suspectedIncr: Int,
        val updateTime: Long
)


