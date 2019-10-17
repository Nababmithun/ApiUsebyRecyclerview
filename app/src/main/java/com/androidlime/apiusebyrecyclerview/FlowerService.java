package com.androidlime.apiusebyrecyclerview;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Mithun on 10/16/2019.
 */

public interface FlowerService   {



    @GET("/feeds/flowers.json")
    Call<List<Flower>> getallFlower();
}
