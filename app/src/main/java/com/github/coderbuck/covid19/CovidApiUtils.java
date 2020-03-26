package com.github.coderbuck.covid19;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CovidApiUtils {

    private static final Retrofit retrofit = new Retrofit.Builder()
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
