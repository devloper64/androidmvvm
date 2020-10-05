package com.example.thedailystar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.thedailystar.model.News;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private  NewsViewModel newsViewModel;
    private RecyclerView recyclerView,recyclerView1;
    private  NewsAdapter newsAdapter;
    private  NewsAdapterHorizental newsAdapterHorizental;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.newsView);
        recyclerView1=findViewById(R.id.newsView1);
        recyclerView.setHasFixedSize(true);
        recyclerView1.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        newsViewModel= new ViewModelProvider(this).get(NewsViewModel.class);
        newsViewModel.init();
        newsViewModel.getNews().observe(this, new Observer<List<News>>() {
            @Override
            public void onChanged(List<News> newsList) {

                newsAdapter=new NewsAdapter(newsList,MainActivity.this);
                newsAdapterHorizental=new NewsAdapterHorizental(newsList,MainActivity.this);
                recyclerView.setAdapter(newsAdapterHorizental);
                recyclerView1.setAdapter(newsAdapter);

            }
        });
    }
}