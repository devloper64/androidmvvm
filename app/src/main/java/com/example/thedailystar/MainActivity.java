package com.example.thedailystar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.thedailystar.model.News;
import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private  NewsViewModel newsViewModel;
    private RecyclerView recyclerView,recyclerView1;
    private  NewsAdapter newsAdapter;
    private  NewsAdapterHorizental newsAdapterHorizental;
    private ShimmerFrameLayout mShimmerViewContainer;
    private TextView top,pop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.newsView);
        recyclerView1=findViewById(R.id.newsView1);
        top=findViewById(R.id.top);
        pop=findViewById(R.id.pop);
        mShimmerViewContainer = findViewById(R.id.shimmer_view_container);
        recyclerView.setHasFixedSize(true);
        recyclerView1.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        newsViewModel= new ViewModelProvider(this).get(NewsViewModel.class);
        newsViewModel.init();
        top.setVisibility(View.GONE);
        pop.setVisibility(View.GONE);
        newsViewModel.getNews().observe(this, new Observer<List<News>>() {
            @Override
            public void onChanged(List<News> newsList) {

                newsAdapter=new NewsAdapter(newsList,MainActivity.this);
                newsAdapterHorizental=new NewsAdapterHorizental(newsList,MainActivity.this);
                recyclerView.setAdapter(newsAdapterHorizental);
                recyclerView1.setAdapter(newsAdapter);
                mShimmerViewContainer.stopShimmerAnimation();
                mShimmerViewContainer.setVisibility(View.GONE);
                top.setVisibility(View.VISIBLE);
                pop.setVisibility(View.VISIBLE);

            }
        });
    }
    @Override
    public void onResume() {
        super.onResume();
        mShimmerViewContainer.startShimmerAnimation();
    }

    @Override
    public void onPause() {
        mShimmerViewContainer.stopShimmerAnimation();
        super.onPause();
    }
}