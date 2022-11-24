package historical;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.recyclerviewpractice.R;

public class HistoricalViewHolder extends RecyclerView.ViewHolder {

    public TextView titleTxt;
    public ImageView historicalImg;

    public HistoricalViewHolder(@NonNull View itemView) {
        super(itemView);
        titleTxt = itemView.findViewById(R.id.title_txt);
        historicalImg = itemView.findViewById(R.id.historical_img);
    }
}
