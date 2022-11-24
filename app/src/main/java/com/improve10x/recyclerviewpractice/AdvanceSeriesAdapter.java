package com.improve10x.recyclerviewpractice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import advanceseries.AdvanceSeries;

public class AdvanceSeriesAdapter extends RecyclerView.Adapter<AdvanceSeriesViewHolder> {

    public ArrayList<AdvanceSeries> advanceSeriesList;

    public void setData(ArrayList<AdvanceSeries> advanceSeries) {
        advanceSeriesList = advanceSeries;
    }
    @NonNull
    @Override
    public AdvanceSeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.advanceseries_item, parent, false);
        AdvanceSeriesViewHolder advanceSeriesViewHolder = new AdvanceSeriesViewHolder(view);
        return advanceSeriesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdvanceSeriesViewHolder holder, int position) {
        AdvanceSeries advanceSeries = advanceSeriesList.get(position);
        holder.titleTxt.setText(advanceSeries.title);
        Picasso.get().load(advanceSeries.imageUrl).into(holder.seriesImg);
    }

    @Override
    public int getItemCount() {
        return advanceSeriesList.size();
    }
}
