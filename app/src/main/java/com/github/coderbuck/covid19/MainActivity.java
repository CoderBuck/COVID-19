package com.github.coderbuck.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import com.annimon.stream.Stream;
import com.annimon.stream.function.Function;
import com.annimon.stream.function.Predicate;
import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.Gson;
import com.jakewharton.threetenabp.AndroidThreeTen;

import net.dongliu.requests.Requests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private static Logger logger = LoggerFactory.getLogger(MainActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidThreeTen.init(this);
        super.onCreate(savedInstanceState);
        logger.debug("onCreate");
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(CovidApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CovidApi covidApi = retrofit.create(CovidApi.class);
//        Call<OverAll> overAll = covidApi.getOverAllHistory();
//        overAll.enqueue(new Callback<OverAll>() {
//            @Override
//            public void onResponse(Call<OverAll> call, Response<OverAll> response) {
//                OverAll body = response.body();
//                if (body == null || !body.isSuccess() || body.getResults() == null || body.getResults().isEmpty()) {
//                    Log.d(TAG, "onResponse: 数据错误");
//                    return;
//                }
//
//                Log.d(TAG, "onResponse: xx start");
//
//                List<OverAll.ResultsBean> list = Stream.of(body.getResults())
//                        .groupBy(result -> {
//                            long time = result.getUpdateTime();
//                            return Instant.ofEpochMilli(time).atZone(ZoneId.systemDefault()).toLocalDate();
//                        })
//                        .sortBy(Map.Entry::getKey)
//                        .map(map -> Stream.of(map.getValue()).findLast().get())
//                        .toList();
//
//                Log.d(TAG, "onResponse: xx end");
//
//            }
//
//            @Override
//            public void onFailure(Call<OverAll> call, Throwable t) {
//
//            }
//        });

//        Call<ResponseBody> call = covidApi.downloadFileWithFixedUrl();
//        call.enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                logger.info("onResponse");
//                logger.info("onResponse path = {}", getFilesDir().getAbsolutePath());
//                ResponseBody body = response.body();
//                if (body == null){
//                    logger.info("onResponse body == null , headers = {}",response.headers().toString());
//                    return;
//                }
//                File file = new File(getFilesDir(), "data1.json");
//                boolean existsFile = FileUtils.createOrExistsFile(file);
//                FileIOUtils.writeFileFromIS(file, body.byteStream());
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//                logger.info("onFailure");
//            }
//        });

        Call<OverAll> call = covidApi.getOverAllLatest();
        call.enqueue(new Callback<OverAll>() {
            @Override
            public void onResponse(Call<OverAll> call, Response<OverAll> response) {
                logger.info("onResponse");
                OverAll body = response.body();
                if (body != null) {
                    String json = GsonUtils.toJson(body);
                    logger.info(json);
                } else {
                    logger.info("body != null");
                }
            }

            @Override
            public void onFailure(Call<OverAll> call, Throwable t) {
                logger.info("onFailure");
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
