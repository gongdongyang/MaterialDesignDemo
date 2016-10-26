package com.xpp.news.materialdesigndemo.service;

import com.xpp.news.materialdesigndemo.entity.AliAddrsBean;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by gongdongyang on 2016/10/26.
 */

public interface APIService {

    @GET("geocoding?a=上海市&aa=松江区&aaa=车墩镇")
    Call<AliAddrsBean> getIndexContent();

    @POST("geocoding?")
    Call<AliAddrsBean> getIndexContentTow(
            @Query("a") String key1,
            @Query("aa") String key2,
            @Query("aaa") String key3
    );


}
