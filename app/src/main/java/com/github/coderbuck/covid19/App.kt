package com.github.coderbuck.covid19

import android.app.Application
import com.blankj.utilcode.util.CrashUtils
import com.blankj.utilcode.util.Utils
import com.jakewharton.threetenabp.AndroidThreeTen

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
        Utils.init(this)
        CrashUtils.init()
    }
}