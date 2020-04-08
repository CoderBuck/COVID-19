package com.github.coderbuck.covid19

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.coderbuck.covid19.databinding.ActivityMainBinding
import org.slf4j.LoggerFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    companion object {
        private val logger = LoggerFactory.getLogger(MainActivity::class.java)
    }

    private lateinit var mRvAdapter: RvAdapter

    private lateinit var v: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        logger.debug("onCreate")
        super.onCreate(savedInstanceState)
        v = ActivityMainBinding.inflate(layoutInflater)
        setContentView(v.root)

        mRvAdapter = RvAdapter()
        v.rv.layoutManager = LinearLayoutManager(this)
        v.rv.adapter = mRvAdapter
        requestDatas()


    }

    private fun requestDatas() {
        val call = CovidApiUtils.areaDataLatest
        call.enqueue(object : Callback<AreaInfo> {
            override fun onResponse(call: Call<AreaInfo>, response: Response<AreaInfo>) {
                logger.info("getAreaDataLatest onResponse")
                val body = response.body() ?: return
                val beans = body.results
                        .filter { it.countryName != "中国" || it.countryName == it.provinceName }
                        .sortedBy { -it.confirmedCount }
                        .toList()

                mRvAdapter.setDatas(beans)
                mRvAdapter.notifyDataSetChanged()
            }

            override fun onFailure(call: Call<AreaInfo>, t: Throwable) {
                logger.info("getAreaDataLatest onFailure")
            }
        })
    }
}