package series;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SeriesService {
    @GET("series")
    Call<List<Series>> fetchTasks();
}
