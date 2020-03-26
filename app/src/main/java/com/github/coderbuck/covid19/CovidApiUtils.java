package com.github.coderbuck.covid19;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CovidApiUtils {

    private static OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .callTimeout(1, TimeUnit.MINUTES)
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(1, TimeUnit.MINUTES)
            .build();

    private static final Retrofit retrofit = new Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(CovidApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static CovidApi covidApi;

    public static CovidApi getApi() {
        if (covidApi == null) {
            covidApi = retrofit.create(CovidApi.class);
        }
        return covidApi;
    }


    public static Call<OverAll> getOverAllHistory() {
        return getApi().getOverAllHistory();
    }

    public static Call<OverAll> getOverAllLatest() {
        return getApi().getOverAllLatest();
    }

    public static Call<AreaData> getAreaDataLatest() {
        return getApi().getAreaDataLatest();
    }

    public static Call<AreaData> getAreaDataHistory() {
        return getApi().getAreaDataHistory();
    }
}
