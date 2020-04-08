package com.github.coderbuck.covid19;

import com.github.coderbuck.covid19.bean.Area;
import com.github.coderbuck.covid19.bean.OverAll;
import com.github.coderbuck.covid19.bean.Result;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CovidApi {

    String BASE_URL = "https://raw.githubusercontent.com/BlankerL/DXY-COVID-19-Data/master/json/";


    @GET("DXYOverall-TimeSeries.json")
    Call<Result<OverAll>> getOverAllHistory();

    @GET("DXYOverall.json")
    Call<Result<OverAll>> getOverAllLatest();

    @GET("DXYArea.json")
    Call<Result<Area>> getAreaDataLatest();

    @GET("DXYArea-TimeSeries.json")
    Call<Result<Area>> getAreaDataHistory();

}
