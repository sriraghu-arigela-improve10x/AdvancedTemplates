package com.improve10x.recyclerviewpractice;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdvanceSeriesViewHolder extends RecyclerView.ViewHolder {

    public TextView titleTxt;
    public ImageView seriesImg;

    public AdvanceSeriesViewHolder(@NonNull View itemView) {
        super(itemView);
        titleTxt = itemView.findViewById(R.id.title_txt);
        seriesImg = itemView.findViewById(R.id.series_img);
    }
}
