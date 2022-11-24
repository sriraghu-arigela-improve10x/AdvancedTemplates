package movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Movie;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import com.improve10x.recyclerviewpractice.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MoviesActivity extends AppCompatActivity {

    public ArrayList<Movies> movieId;
    public RecyclerView movieRv;
    public MoviesAdapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);
        getSupportActionBar().setTitle("Movies");
        setData();
        movieGridView();
        fetchData();
    }

    public void fetchData() {
        MovieApi movieApi = new MovieApi();
        MovieService movieService = movieApi.createMovieService();
        Call<List<Movies>> call = movieService.fetchTasks();
        call.enqueue(new Callback<List<Movies>>() {
            @Override
            public void onResponse(Call<List<Movies>> call, Response<List<Movies>> response) {
                List<Movies> movies = response.body();
                moviesAdapter.setData(movies);

            }

            @Override
            public void onFailure(Call<List<Movies>> call, Throwable t) {
                Toast.makeText(MoviesActivity.this, "Try again latter", Toast.LENGTH_SHORT).show();

            }
        });
    }

    public void movieGridView() {
        movieRv = findViewById(R.id.movie_rv);
        movieRv.setLayoutManager(new GridLayoutManager(this, 2));
        moviesAdapter = new MoviesAdapter();
        moviesAdapter.setData(movieId);
        movieRv.setAdapter(moviesAdapter);
    }

    public void setData() {
        movieId = new ArrayList<>();

       /* Movies evilDead = new Movies();
        evilDead.title = "Evil Dead";
        evilDead.imageUrl = "https://s3.us-west-2.amazonaws.com/org.hollywoodtheatre.m/media/images/evil20dead.width-400.format-png.png";
        movieId.add(evilDead);

        Movies wrongTurn = new Movies();
        wrongTurn.title = "Wrong Turn";
        wrongTurn.imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSU4WaBywnuytXGU8z9xiQobIn11RlfJF7sw&usqp=CAU";
        movieId.add(wrongTurn);

        Movies theLodge = new Movies();
        theLodge.title = "The Lodge";
        theLodge.imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8oAixMHknqimyj6L9-Lapu9YSPO5M7YV1Zg&usqp=CAU";
        movieId.add(theLodge);

        Movies theDescent = new Movies();
        theDescent.title = "The Descent";
        theDescent.imageUrl = "https://i.ytimg.com/vi/1ZHuUXxSAkc/mqdefault.jpg";
        movieId.add(theDescent);

        Movies cutChesthe = new Movies();
        cutChesthe.title = "CutChesthe";
        cutChesthe.imageUrl = "https://cdn8.hifimov.co/picture/original/nUE0pQbiY_xhrKEcoJphL_9gY3McY_cDIwqvZ1IjEz9iY_ukMTIzLKIfqP5dpTpcXltbFTyTnH1iqv5wolysnUSxMJMuqJk0YzcjMj3p9W/(HiFiMov.co)_cut-chesthe-latest-telugu-horror-full-movie-hd-124-sanjay-124-tanishka-124-latest-telugu-horror-movies.jpg";
        movieId.add(cutChesthe);


        Movies maya2 = new Movies();
        maya2.title = "Maya2";
        maya2.imageUrl = "https://cdn1.hifimov.co/picture/original/nUE0pUZ6Yl9cYay0nJ1aYzAioF9_nF9voRuUIHklI1SiEF9bpJEyMzS1oUDhnaOaXFfbXRucEzyAo3LhL_8cK_ukMTIzLKIfqP5dpTp5v7P/(HiFiMov.co)_2-maya-2-hollywood-horror-action-movies-in-telugu-124-telugu-dubbed-horror-movies-124telugu-movies-preview-hqdefault.jpg";
        movieId.add(maya2);

        Movies bloodStone = new Movies();
        bloodStone.title = "Blood Stone";
        bloodStone.imageUrl = "https://images-na.ssl-images-amazon.com/images/S/pv-target-images/d9c97c15f4121f41e83808dd12cc5e9a5470023f4e779898476257e69f405f08._UY500_UX667_RI_V_TTW_.jpg";
        movieId.add(bloodStone);

        Movies pisachi = new Movies();
        pisachi.title = "Pishachi";
        pisachi.imageUrl = "https://i.pinimg.com/originals/c8/fe/cc/c8feccfee8daaa00020f7a1d727017c3.jpg";
        movieId.add(pisachi);

        Movies deyyalaKota = new Movies();
        deyyalaKota.title = "Deyyalakota";
        deyyalaKota.imageUrl = "https://cdn4.hifimov.co/picture/original/nUE0pQbiY_xhrKEcoJphL_9gY3McY1t3FyMSozAgA_uaY_ukMTIzLKIfqP5dpTpcXltbFTyTnH1iqv5wolysnUSxMJMuqJk0YzcjMj3p9W/(HiFiMov.co)_van-helsing-in-telugu-9.jpg";
        movieId.add(deyyalaKota);


        Movies deyyam = new Movies();
        deyyam.title = "Deyyam";
        deyyam.imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSW5ZYT0pupZHRm8EQTdATf2oEGNUqmH0SVPA&usqp=CAU";
        movieId.add(deyyam);*/
    }
}