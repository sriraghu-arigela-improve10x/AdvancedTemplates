package series;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.recyclerviewpractice.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SeriesActivity extends AppCompatActivity {

    public ArrayList<Series> seriesId;
    public  RecyclerView seriesRv;
    public SeriesAdapter seriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);
        getSupportActionBar().setTitle("Series");
        setData();
        seriesRecyclerView();
        fetchData();
    }

    public void fetchData() {
        SeriesApi seriesApi = new SeriesApi();
        SeriesService seriesService = seriesApi.createSeriesService();
        Call<List<Series>> call = seriesService.fetchTasks();
        call.enqueue(new Callback<List<Series>>() {
            @Override
            public void onResponse(Call<List<Series>> call, Response<List<Series>> response) {
                List<Series> series = response.body();
                seriesAdapter.setData(series);

            }

            @Override
            public void onFailure(Call<List<Series>> call, Throwable t) {
                Toast.makeText(SeriesActivity.this, "Try after Some time", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void seriesRecyclerView() {
        seriesRv = findViewById(R.id.series_rv);
        seriesRv.setLayoutManager(new LinearLayoutManager(this));
        seriesAdapter = new SeriesAdapter();
        seriesAdapter.setData(seriesId);
        seriesRv.setAdapter(seriesAdapter);
    }

    public void setData() {
        seriesId = new ArrayList<>();

        /*Series kungFuPanda = new Series();
        kungFuPanda.title = "Kung FU Panda Movie Series";
        kungFuPanda.imageUrl = "https://m.media-amazon.com/images/I/91JsBXjXApL._SL1500_.jpg";
        seriesId.add(kungFuPanda);

        Series harryPotter = new Series();
        harryPotter.title = "Harry Potter Movie Series";
        harryPotter.imageUrl = "https://m.media-amazon.com/images/M/MV5BMzkyZGFlOWQtZjFlMi00N2YwLWE2OWQtYTgxY2NkNmM1NjMwXkEyXkFqcGdeQXVyNjY1NTM1MzA@._V1_FMjpg_UX1000_.jpg";
        seriesId.add(harryPotter);*/
    }
}