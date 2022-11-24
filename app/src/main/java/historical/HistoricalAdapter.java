package historical;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.recyclerviewpractice.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class HistoricalAdapter extends RecyclerView.Adapter<HistoricalViewHolder> {

    public ArrayList<Historical> historicalList;

    public void setData(ArrayList<Historical> historical) {
        historicalList = historical;
    }
    @NonNull
    @Override
    public HistoricalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.historical_item, parent, false);
        HistoricalViewHolder historicalViewHolder = new HistoricalViewHolder(view);
        return historicalViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HistoricalViewHolder holder, int position) {
        Historical historical = historicalList.get(position);
        holder.titleTxt.setText(historical.title);
        Picasso.get().load(historical.imageUrl).into(holder.historicalImg);
    }

    @Override
    public int getItemCount() {
        return historicalList.size();
    }
}
