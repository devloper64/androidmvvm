package com.example.thedailystar.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.thedailystar.api.APIClient;
import com.example.thedailystar.model.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsRepo {

    private MutableLiveData<List<News>> newsList= new MutableLiveData<List<News>>();
    private static  NewsRepo newsRepo;

    public static NewsRepo getInstance(){
        if (newsRepo==null){
            newsRepo=new NewsRepo();
        }
        return newsRepo;
    }

    public MutableLiveData<List<News>> getNewsList() {

        APIClient.getClient().getNews("status:published","0","10","publishDate,desc").enqueue(new Callback<List<News>>() {
            @Override
            public void onResponse(Call<List<News>> call, Response<List<News>> response) {
                newsList.setValue(response.body());
                Log.d("aaaaaaaaaaaaaaaaaaa","success");
            }

            @Override
            public void onFailure(Call<List<News>> call, Throwable t) {

                Log.d("aaaaaaaaaaaaaaaaaaa","aa:"+t.getMessage());
            }
        });

        return newsList;
    }
}
