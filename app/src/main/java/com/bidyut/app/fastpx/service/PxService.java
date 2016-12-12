package com.bidyut.app.fastpx.service;

import com.bidyut.app.fastpx.BuildConfig;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PxService {
    String API_URL = "https://api.500px.com/";
    String CONSUMER_KEY = BuildConfig.PX_API_KEY;

    @GET("/v1/photos/search?image_size=4&consumer_key=" + CONSUMER_KEY)
    Call<SearchResults> searchPhotos(@Query("term") String query);

    @GET("/v1/photos?image_size=4&feature=user&consumer_key=" + CONSUMER_KEY)
    Call<SearchResults> usernamePhotos(@Query("username") String username);
}
