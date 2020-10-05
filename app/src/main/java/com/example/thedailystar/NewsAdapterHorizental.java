package com.example.thedailystar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.thedailystar.model.News;

import java.util.List;

public class NewsAdapterHorizental extends RecyclerView.Adapter<NewsAdapterHorizental.ViewHolder>  {

    private List<News> newsList;
    private Context context;

    public NewsAdapterHorizental(List<News> newsList,Context context){
        this.newsList=newsList;
        this.context=context;
    }


    @NonNull
    @Override
    public NewsAdapterHorizental.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_adapter_horizental, parent, false);
        return new NewsAdapterHorizental.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapterHorizental.ViewHolder holder, int position) {

        holder.tittle.setText(newsList.get(position).getTittle());
        Glide.with(context)
                .load("https://img.thedailystar.net/"+newsList.get(position).getFeaturedImage())
                .centerCrop()
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tittle;
        ImageView image;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tittle=itemView.findViewById(R.id.tittle);
            image=itemView.findViewById(R.id.image);
        }


    }
}
