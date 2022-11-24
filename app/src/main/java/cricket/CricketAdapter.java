package cricket;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.recyclerviewpractice.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CricketAdapter extends RecyclerView.Adapter<CricketViewHolder> {

    public ArrayList<Cricket> cricketList;

    public void setData(ArrayList<Cricket> crickets) {
        cricketList = crickets;

    }
    @NonNull
    @Override
    public CricketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cricket_item, parent, false);
        CricketViewHolder cricketViewHolder = new CricketViewHolder(view);
        return cricketViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CricketViewHolder holder, int position) {
        Cricket cricket = cricketList.get(position);
        holder.titleTxt.setText(cricket.title);
        Picasso.get().load(cricket.imageUrl).into(holder.cricketImg);
    }

    @Override
    public int getItemCount() {
        return cricketList.size();
    }
}
