package templates;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface TemplateService {
    @GET("todoTemplates")
    Call<List<Template>> fetchTasks();

    @POST("todoTemplates")
    Call<Template> createTask(@Body Template template);
}
