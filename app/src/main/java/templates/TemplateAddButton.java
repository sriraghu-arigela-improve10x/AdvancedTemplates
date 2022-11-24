package templates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.improve10x.recyclerviewpractice.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TemplateAddButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_add_button);
        getSupportActionBar().setTitle("Add Template");
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText templateTxt = findViewById(R.id.template_txt);
            String template = templateTxt.getText().toString();
            createTasks(template);
        });
    }

    public void createTasks(String template) {
        Template template1 = new Template();
        template1.messageText = template;

        TemplateApi templateApi = new TemplateApi();
        TemplateService templateService = templateApi.createTemplateService();
        Call<Template> call = templateService.createTask(template1);
        call.enqueue(new Callback<Template>() {
            @Override
            public void onResponse(Call<Template> call, Response<Template> response) {
                Toast.makeText(TemplateAddButton.this, "Successfully", Toast.LENGTH_SHORT).show();
                finish();
            }

            @Override
            public void onFailure(Call<Template> call, Throwable t) {
                Toast.makeText(TemplateAddButton.this, "Try Again Later", Toast.LENGTH_SHORT).show();
            }
        });
    }
}