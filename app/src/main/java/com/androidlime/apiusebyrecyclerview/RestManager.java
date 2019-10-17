package com.androidlime.apiusebyrecyclerview;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Mithun on 10/16/2019.
 */

public class RestManager {


    private FlowerService mFlowerService;

    public FlowerService getmFlowerService(){

        if (mFlowerService==null){

            Retrofit retrofit=new Retrofit.Builder()

                    .baseUrl(Constants.HTTP.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            mFlowerService=retrofit.create(FlowerService.class);
        }

        return mFlowerService;

    }
}
