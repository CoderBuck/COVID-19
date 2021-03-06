package com.github.coderbuck.covid19

import com.github.coderbuck.covid19.bean.Area
import com.github.coderbuck.covid19.bean.OverAll
import com.github.coderbuck.covid19.bean.Result
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object CovidApiUtils {
    private val okHttpClient = OkHttpClient.Builder()
            .callTimeout(1, TimeUnit.MINUTES)
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(1, TimeUnit.MINUTES)
            .addInterceptor(UserAgentInterceptor("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Safari/537.36"))
            .addInterceptor(createHttpLoggingInterceptor())
            .build()

    private fun createHttpLoggingInterceptor(): Interceptor {
        val log = HttpLoggingInterceptor()
        log.setLevel(HttpLoggingInterceptor.Level.BASIC)
        return log
    }

    private val retrofit = Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(CovidApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    private val covidApi: CovidApi = retrofit.create(CovidApi::class.java)


    val overAllHistory: Call<Result<OverAll>> = covidApi.overAllHistory

    val overAllLatest: Call<Result<OverAll>> = covidApi.overAllLatest

    val areaDataLatest: Call<Result<Area>> = covidApi.areaDataLatest

    val areaDataHistory: Call<Result<Area>> = covidApi.areaDataHistory
}