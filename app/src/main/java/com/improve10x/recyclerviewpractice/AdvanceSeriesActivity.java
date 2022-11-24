package com.improve10x.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import advanceseries.AdvanceSeries;

public class AdvanceSeriesActivity extends AppCompatActivity {

    public ArrayList<AdvanceSeries> advanceSeriesId;
    public RecyclerView advanceSeriesRv;
    public AdvanceSeriesAdapter advanceSeriesAdapter;
    public TextView seriesTitleTxt;
    public ImageView advanceSeriesImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_series);
        getSupportActionBar().setTitle("Series");
        setData();
        advanceSeriesRv();
        seriesTitleTxt = findViewById(R.id.series_title_txt);
        seriesTitleTxt.setText("Harry Potter");
        advanceSeriesId = new ArrayList<>();
        String imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/3/36/Harry-potter-films.png/revision/latest/scale-to-width-down/1000?cb=20110722151247";
        advanceSeriesImg = findViewById(R.id.advance_series_img);
        Picasso.get().load(imageUrl).into(advanceSeriesImg);
    }

    public void advanceSeriesRv() {
        advanceSeriesRv = findViewById(R.id.advance_series_rv);
        advanceSeriesRv.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        advanceSeriesAdapter = new AdvanceSeriesAdapter();
        advanceSeriesAdapter.setData(advanceSeriesId);
        advanceSeriesRv.setAdapter(advanceSeriesAdapter);
    }

    public void setData() {
        advanceSeriesId = new ArrayList<>();

        AdvanceSeries series1 = new AdvanceSeries();
        series1.title = "Harry Potter and the Philosopher's Stone ";
        series1.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/f/f3/Harry_Potter_and_the_Philosopher%27s_Stone_%28film%29%28Movieposter%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004220";
        advanceSeriesId.add(series1);

        AdvanceSeries series2 = new AdvanceSeries();
        series2.title = "Harry Potter and the Chamber of Secrets";
        series2.imageUrl = "https://static.wikia.nocookie.net/harrypotter/images/1/1c/Harry_Potter_and_the_Chamber_of_Secrets_%28film%29%28Movie_Poster%29.jpg/revision/latest/scale-to-width-down/1000?cb=20200928004647";
        advanceSeriesId.add(series2);

        AdvanceSeries series3 = new AdvanceSeries();
        series3.title = "Harry Potter and the Prisoner of Azkaban";
        series3.imageUrl = "https://images.moviesanywhere.com/1da041f4db01054fe099a9be01ddb6a2/f981fa35-0a7a-449a-ba99-f54a724ce278.jpg";
        advanceSeriesId.add(series3);

        AdvanceSeries series4 = new AdvanceSeries();
        series4.title = "Harry Potter and the Goblet of Fire";
        series4.imageUrl = " https://img2.sfilm.hu/original/7VRkmVB23rloRbZHsCRPscXlgQp.jpg";
        advanceSeriesId.add(series4);

        AdvanceSeries series5 = new AdvanceSeries();
        series5.title = "Harry Potter and the Order of the Phoenix";
        series5.imageUrl = "https://images.moviesanywhere.com/e1752b37b6a6277dc16ed75b55b4883f/688a801d-4a1b-424e-b949-80253e07d0e2.jpg";
        advanceSeriesId.add(series5);

        AdvanceSeries series6 = new AdvanceSeries();
        series6.title = "Harry Potter and the Half-Blood Prince";
        series6.imageUrl = "https://images.moviesanywhere.com/144db183a81872d493990cb46599dc92/78f6e38f-1223-4dd9-b5e2-98181d340dde.jpg";
        advanceSeriesId.add(series6);

        AdvanceSeries series7 = new AdvanceSeries();
        series7.title = "Harry Potter and the Deathly Hallows: Part 1";
        series7.imageUrl = "https://images.moviesanywhere.com/de6092b467fc299fdf79a51dfa7f9710/12b877a3-28de-46ff-820f-dd8bf07e8edb.jpg";
        advanceSeriesId.add(series7);

        AdvanceSeries series8 = new AdvanceSeries();
        series8.title = "Harry Potter and the Deathly Hallows: Part 2";
        series8.imageUrl = "https://images.moviesanywhere.com/5f0537520f90b687fc5db7f241affc4c/0280fd81-6b8a-49cc-9b81-5154eee498dc.jpg";
        advanceSeriesId.add(series8);
    }
}