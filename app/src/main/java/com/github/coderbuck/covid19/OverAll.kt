package com.github.coderbuck.covid19

import kotlinx.serialization.Serializable

class OverAll {
    var isSuccess = false
    var results: List<ResultsBean>? = null

    class ResultsBean {
        var currentConfirmedCount = 0
        var confirmedCount = 0
        var suspectedCount = 0
        var curedCount = 0
        var deadCount = 0
        var seriousCount = 0
        var currentConfirmedIncr = 0
        var confirmedIncr = 0
        var suspectedIncr = 0
        var curedIncr = 0
        var deadIncr = 0
        var seriousIncr = 0
        var generalRemark: String? = null
        var abroadRemark: String? = null
        var remark1: String? = null
        var remark2: String? = null
        var remark3: String? = null
        var remark4: String? = null
        var remark5: String? = null
        var note1: String? = null
        var note2: String? = null
        var note3: String? = null
        var updateTime: Long = 0

    }
}