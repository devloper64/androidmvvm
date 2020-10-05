package com.example.thedailystar.api;




import com.example.thedailystar.model.News;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {

    @GET(HttpParam.GET_NEWS)
    Call<List<News>> getNews(@Query("query")String query, @Query("page")String page, @Query("size")String size, @Query("sort")String sort);

}
