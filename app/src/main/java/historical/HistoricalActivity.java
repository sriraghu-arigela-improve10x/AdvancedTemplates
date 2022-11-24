package historical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.improve10x.recyclerviewpractice.R;

import java.security.PublicKey;
import java.util.ArrayList;

public class HistoricalActivity extends AppCompatActivity {

    public ArrayList<Historical> historicalId;
    public RecyclerView historicalRv;
    public HistoricalAdapter historicalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical);
        getSupportActionBar().setTitle("Historical");
        setData();
        historicalRecyclerView();
    }

    public void historicalRecyclerView() {
        historicalRv = findViewById(R.id.historical_rv);
        historicalRv.setLayoutManager(new GridLayoutManager(this, 3));
        historicalAdapter = new HistoricalAdapter();
        historicalAdapter.setData(historicalId);
        historicalRv.setAdapter(historicalAdapter);
    }

    public void setData() {
        historicalId = new ArrayList<>();

        Historical tajMahal = new Historical();
        tajMahal.title = "Taj Mahal";
        tajMahal.imageUrl = "https://img.traveltriangle.com/blog/wp-content/uploads/2017/07/Agra1.jpg";
        historicalId.add(tajMahal);

        Historical ajantaElloraCaves = new Historical();
        ajantaElloraCaves.title = "Ajanta-Ellora caves";
        ajantaElloraCaves.imageUrl = "https://assets.traveltriangle.com/blog/wp-content/uploads/2016/08/Cave_26_Ajanta.jpg";
        historicalId.add(ajantaElloraCaves);

        Historical agraFort = new Historical();
        agraFort.title = "Agra Fort";
        agraFort.imageUrl = "https://img.traveltriangle.com/blog/wp-content/uploads/2019/02/Agra-Fort-Uttar-Pradesh-400x267.jpg";
        historicalId.add(agraFort);

        Historical redFort = new Historical();
        redFort.title = "Red Fort";
        redFort.imageUrl = "https://img.traveltriangle.com/blog/wp-content/uploads/2019/02/Red-Fort-Delhi-400x267.jpg";
        historicalId.add(redFort);

        Historical qutubMinar = new Historical();
        qutubMinar.title = "Qutub Minar";
        qutubMinar.imageUrl = "https://img.traveltriangle.com/blog/wp-content/uploads/2019/02/Qutub-Minar-Delhi-400x265.jpg";
        historicalId.add(qutubMinar);

        Historical humayunsTomb = new Historical();
        humayunsTomb.title = " Humayun’s Tomb";
        humayunsTomb.imageUrl = "https://img.traveltriangle.com/blog/wp-content/uploads/2019/02/Humayun%E2%80%99s-Tomb-Delhi-400x267.jpg";
        historicalId.add(humayunsTomb);

        Historical fatehpurSikri = new Historical();
        fatehpurSikri.title = "Fatehpur Sikri";
        fatehpurSikri.imageUrl = "https://img.traveltriangle.com/blog/wp-content/uploads/2019/02/Fatehpuri-Sikri-Uttar-Pradesh1-400x267.jpg";
        historicalId.add(fatehpurSikri);

        Historical khajurahoTemples = new Historical();
        khajurahoTemples.title = " Khajuraho temples";
        khajurahoTemples.imageUrl = "https://img.traveltriangle.com/blog/wp-content/uploads/2019/02/Khajuraho-Temples-Madhya-Pradesh-400x267.jpg";
        historicalId.add(khajurahoTemples);

        Historical konarkTemple = new Historical();
        konarkTemple.title = "Konark Temple";
        konarkTemple.imageUrl = "https://img.traveltriangle.com/blog/wp-content/uploads/2019/02/Konark-Temple-Odisha-400x267.jpg";
        historicalId.add(konarkTemple);

        Historical hawaMahal = new Historical();
        hawaMahal.title = "Hawa Mahal ";
        hawaMahal.imageUrl = "https://img.traveltriangle.com/blog/wp-content/uploads/2019/02/Hawa-Mahal-Jaipur-400x267.jpg";
        historicalId.add(hawaMahal);

        Historical mahabodhiTemple = new Historical();
        mahabodhiTemple.title = "Mahabodhi temple";
        mahabodhiTemple.imageUrl = "https://img.traveltriangle.com/blog/wp-content/uploads/2019/02/Mahabodhi-Temple-Bodh-Gaya-400x261.jpg";
        historicalId.add(mahabodhiTemple);

        Historical ranikiVav = new Historical();
        ranikiVav.title = "Rani ki Vav";
        ranikiVav.imageUrl = "https://img.traveltriangle.com/blog/wp-content/uploads/2019/02/Rani-ki-Vav-Gujarat-400x267.jpg";
        historicalId.add(ranikiVav);

        Historical jallianwalaBagh = new Historical();
        jallianwalaBagh.title = "Jallianwala Bagh ";
        jallianwalaBagh.imageUrl = "https://img.traveltriangle.com/blog/wp-content/uploads/2019/02/Rani-ki-Vav-Gujarat-400x267.jpg";
        historicalId.add(jallianwalaBagh);

        Historical gwaliorFort = new Historical();
        gwaliorFort.title = "Gwalior Fort";
        gwaliorFort.imageUrl = "https://img.traveltriangle.com/blog/wp-content/uploads/2019/02/Gwalior-Fort-400x267.jpg";
        historicalId.add(gwaliorFort);

        Historical goldenTemple = new Historical();
        goldenTemple.title = "Golden Temple";
        goldenTemple.imageUrl = "https://img.traveltriangle.com/blog/wp-content/uploads/2019/02/Golden-Temple-400x267.jpg";
        historicalId.add(goldenTemple);
    }
}