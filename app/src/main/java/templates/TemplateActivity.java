package templates;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.improve10x.recyclerviewpractice.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TemplateActivity extends AppCompatActivity {

    public ArrayList<Template> templateId;
    public RecyclerView templateRv;
    public TemplateAdapter templateAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);
        getSupportActionBar().setTitle("Templates");
        templateAddBtn();
        setData();
        templateRecyclerView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        fetchData();
    }

    public void templateAddBtn() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TemplateAddButton.class);
            startActivity(intent);
        });
    }

    public void fetchData() {
        TemplateApi templateApi = new TemplateApi();
        TemplateService templateService = templateApi.createTemplateService();
        Call<List<Template>> call = templateService.fetchTasks();
        call.enqueue(new Callback<List<Template>>() {
            @Override
            public void onResponse(Call<List<Template>> call, Response<List<Template>> response) {
                List<Template> lists = response.body();
                templateAdapter.setData(lists);
            }

            @Override
            public void onFailure(Call<List<Template>> call, Throwable t) {
                Toast.makeText(TemplateActivity.this, "try again", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void templateRecyclerView() {
        templateRv = findViewById(R.id.template_rv);
        templateRv.setLayoutManager(new LinearLayoutManager(this));
        templateAdapter = new TemplateAdapter();
        templateAdapter.setData(templateId);
        templateRv.setAdapter(templateAdapter);
    }

    public void setData() {
        templateId = new ArrayList<>();

        Template template1 = new Template();
        template1.messageText = "Hi,\nWelcome to improve10x.";
        templateId.add(template1);

        Template template2 = new Template();
        template2.messageText = "Hi, i'm busy. I'll call you later";
        templateId.add(template2);

        Template template3 = new Template();
        template3.messageText = "Hi,\ncall me when you see the message";
        templateId.add(template3);

        Template template4 = new Template();
        template4.messageText = "-Hi, Please find my contact details\nName : Viswanath Kumar Sandu\nCompany : Improve10x\nMobile : +919000540052";
        templateId.add(template4);

        Template template5 = new Template();
        template5.messageText = "Hi, Please find my account details\nAccount Number : 6251501515776\nBank : ICCI Bank\nIFSC : ICIC0006251";
        templateId.add(template5);
    }
}