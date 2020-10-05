package com.example.thedailystar;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.thedailystar.model.News;
import com.example.thedailystar.repository.NewsRepo;

import java.util.List;

public class NewsViewModel extends ViewModel {

    private MutableLiveData<List<News>> newses=new MutableLiveData<>();
    private NewsRepo newsRepo;

    public void init(){
        Log.d("aaaaaaaaaaaaaaaaaaa","yyyyy");
        newsRepo =NewsRepo.getInstance();
        newses=newsRepo.getNewsList();
    }

    public LiveData<List<News>> getNews(){
        return newses;
    }
}
