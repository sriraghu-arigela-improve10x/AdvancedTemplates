package Messages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.improve10x.recyclerviewpractice.R;

import java.util.ArrayList;

public class MessageActivity extends AppCompatActivity {

    public ArrayList<Message> messages;
    public RecyclerView messageRv;
    public MessageAdapter messageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        getSupportActionBar().setTitle("Messages");
        setData();
        messageRecyclerView();
    }

    public void messageRecyclerView() {
        messageRv = findViewById(R.id.message_rv);
        messageRv.setLayoutManager(new LinearLayoutManager(this));
        messageAdapter = new MessageAdapter();
        messageAdapter.setData(messages);
        messageRv.setAdapter(messageAdapter);
    }

    public void setData() {
        messages = new ArrayList<>();

        Message aravind = new Message();
        aravind.name = "Aravind";
        aravind.phoneNumber = "+91 9000540052";
        aravind.messageText = "Hi,Welcome to improve10x";
        messages.add(aravind);

        Message ramesh = new Message();
        ramesh.name = "Ramesh";
        ramesh.phoneNumber = "+91 9999999999";
        ramesh.messageText = "Hi,Welcome to improve10x";
        messages.add(ramesh);

        Message r = new Message();
        r.phoneNumber = "+91 9999999991";
        r.messageText = "Hi,call me when you see the message";
        messages.add(r);

        Message kailash = new Message();
        kailash.name = "Kailash";
        kailash.phoneNumber = "+91 999999992";
        kailash.messageText = "-";
        messages.add(kailash);

        Message swiggyDelivery  = new Message();
        swiggyDelivery .name = "Swiggy Delivery ";
        swiggyDelivery .phoneNumber = "+91 999999993";
        swiggyDelivery .messageText = "full address";
        messages.add(swiggyDelivery );

        Message swiggyDelivery1  = new Message();
        swiggyDelivery1 .name = "Swiggy Delivery ";
        swiggyDelivery1 .phoneNumber = "+91 999999993";
        swiggyDelivery1 .messageText = "Are you available for this sunday?\n\nWe can have a call and discuss the movie";
        messages.add(swiggyDelivery1 );
    }
}