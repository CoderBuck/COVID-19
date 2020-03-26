package com.github.coderbuck.covid19;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.annimon.stream.Stream;
import com.blankj.utilcode.util.GsonUtils;
import com.jakewharton.threetenabp.AndroidThreeTen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Comparator;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static Logger logger = LoggerFactory.getLogger(MainActivity.class);

    @BindView(R.id.area_rv) RecyclerView mAreaRv;
    private RvAdapter mRvAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        logger.debug("onCreate");
        AndroidThreeTen.init(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mAreaRv.setLayoutManager(new LinearLayoutManager(this));
        mRvAdapter = new RvAdapter();
        mAreaRv.setAdapter(mRvAdapter);

        requestDatas();




    }

    private void requestDatas() {
        Call<AreaData> call = CovidApiUtils.getAreaDataLatest();
        call.enqueue(new Callback<AreaData>() {
            @Override
            public void onResponse(Call<AreaData> call, Response<AreaData> response) {
                logger.info("getAreaDataLatest onResponse");
                AreaData body = response.body();
                if (body == null) return;
                List<AreaData.ResultsBean> results = body.getResults();
                List<AreaData.ResultsBean> beans = Stream.of(results)
                        .filter(value -> {
                            return (!value.getCountryName().equals("中国"))
                                    || (value.getCountryName().equals(value.getProvinceName()));
                        })
                        .sortBy(resultsBean -> -resultsBean.getConfirmedCount())
                        .toList();
                mRvAdapter.setDatas(beans);
                mRvAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<AreaData> call, Throwable t) {
                logger.info("getAreaDataLatest onFailure");
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }



    private void xx() {

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(CovidApi.BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        CovidApi covidApi = retrofit.create(CovidApi.class);
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

//        Call<OverAll> call = covidApi.getOverAllLatest();
//        call.enqueue(new Callback<OverAll>() {
//            @Override
//            public void onResponse(Call<OverAll> call, Response<OverAll> response) {
//                logger.info("onResponse");
//                OverAll body = response.body();
//                if (body != null) {
//                    String json = GsonUtils.toJson(body);
//                    logger.info(json);
//                } else {
//                    logger.info("body != null");
//                }
//            }
//
//            @Override
//            public void onFailure(Call<OverAll> call, Throwable t) {
//                logger.info("onFailure");
//            }
//        });

    }
}
