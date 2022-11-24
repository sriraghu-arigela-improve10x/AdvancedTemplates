package cricket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.CheckBox;

import com.improve10x.recyclerviewpractice.R;

import java.util.ArrayList;

public class CricketActivity extends AppCompatActivity {

    public ArrayList<Cricket> cricketId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket);
        getSupportActionBar().setTitle("Cricket");
        setData();
        cricketRecyclerView();
    }

    public void cricketRecyclerView() {
        RecyclerView cricketRv = findViewById(R.id.cricket_rv);
        cricketRv.setLayoutManager(new GridLayoutManager(this, 2));
        CricketAdapter cricketAdapter = new CricketAdapter();
        cricketAdapter.setData(cricketId);
        cricketRv.setAdapter(cricketAdapter);
    }

    public void setData() {
        cricketId = new ArrayList<>();

        Cricket rohitSharma = new Cricket();
        rohitSharma.title = "Rohit Sharma";
        rohitSharma.imageUrl = "https://pbs.twimg.com/media/FGF025IVkAA7LE4?format=jpg&name=900x900";
        cricketId.add(rohitSharma);

        Cricket klRahul = new Cricket();
        klRahul.title = "KL Rahul";
        klRahul.imageUrl = "https://i.pinimg.com/474x/48/37/af/4837af17a9f1bf260a2a1065332d9cd1.jpg";
        cricketId.add(klRahul);

        Cricket viratKohli = new Cricket();
        viratKohli.title = "Virat Kohli";
        viratKohli.imageUrl = "https://wallpaper.dog/large/20475475.jpg";
        cricketId.add(viratKohli);

        Cricket suryaKumarYadav = new Cricket();
        suryaKumarYadav.title = "Surya Kumar yadav";
        suryaKumarYadav.imageUrl = "https://i.pinimg.com/originals/d8/fa/9f/d8fa9f70ae7de974bce8d9bfc7d9b1a1.jpg";
        cricketId.add(suryaKumarYadav);

        Cricket hardikPndya = new Cricket();
        hardikPndya.title = "Hardik Pndya";
        hardikPndya.imageUrl = "https://w0.peakpx.com/wallpaper/138/813/HD-wallpaper-hardik-pandya-cricket-hardik-hardik-pandya-33-ipl-mi-mumbai-indians-pandya.jpg";
        cricketId.add(hardikPndya);

        Cricket dINESHKARTHIK = new Cricket();
        dINESHKARTHIK.title = "DINESH KARTHIK";
        dINESHKARTHIK.imageUrl = "https://cdn.mwallpapers.com/photos/celebrities/dinesh-karthik/dinesh-karthikhd-wallpapers-desktop-background-android-iphone-1080p-4k-vrnfi.jpg";
        cricketId.add(dINESHKARTHIK);

        Cricket axarPatel = new Cricket();
        axarPatel.title = "Axar Patel";
        axarPatel.imageUrl = "https://media.gettyimages.com/id/1347541003/photo/axar-patel-of-india-poses-for-a-headshot-prior-to-the-icc-mens-t20-world-cup-at-on-october-17.jpg?s=612x612&w=gi&k=20&c=c5lYM1ALwvxFK3HyUvz-dvLMPvH_EgLcDulNsE9iIxs=";
        cricketId.add(axarPatel);

        Cricket raviChandranAswin = new Cricket();
        raviChandranAswin.title = "Ravichandran Aswin";
        raviChandranAswin.imageUrl = "https://indianexpress.com/wp-content/uploads/2022/06/Ravi-5.jpg";
        cricketId.add(raviChandranAswin);

        Cricket bhuvaneswarKumar = new Cricket();
        bhuvaneswarKumar.title = " Bhuvaneswar Kumar";
        bhuvaneswarKumar.imageUrl = "https://cdn.mwallpapers.com/photos/sports/bhuvneshwar-kumar/bhuvneshwar-kumar-best-hd-photos-1080p-oahz92.jpg\n";
        cricketId.add(bhuvaneswarKumar);

        Cricket arshdeepSing = new Cricket();
        arshdeepSing.title = "ARSHDEEP SING";
        arshdeepSing.imageUrl = "https://celebwale.com/wp-content/uploads/2022/09/Arshdeep-Singh.jpg";
        cricketId.add(arshdeepSing);

        Cricket mahammadShami = new Cricket();
        mahammadShami.title = "MOHAMMED SHAMI";
        mahammadShami.imageUrl = "https://im.rediff.com/cricket/2022/oct/21shami.gif";
        cricketId.add(mahammadShami);
    }
}