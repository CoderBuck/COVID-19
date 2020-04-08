package com.github.coderbuck.covid19;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CovidApi {

    String BASE_URL = "https://raw.githubusercontent.com/BlankerL/DXY-COVID-19-Data/master/json/";


    @GET("DXYOverall-TimeSeries.json")
    Call<OverAll> getOverAllHistory();

    @GET("DXYOverall.json")
    Call<OverAll> getOverAllLatest();

    @GET("DXYArea.json")
    Call<AreaInfo> getAreaDataLatest();

    @GET("DXYArea-TimeSeries.json")
    Call<AreaData> getAreaDataHistory();

}
