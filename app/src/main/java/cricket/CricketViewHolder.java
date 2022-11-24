package cricket;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.recyclerviewpractice.R;

public class CricketViewHolder extends RecyclerView.ViewHolder {

    public TextView titleTxt;
    public ImageView cricketImg;

    public CricketViewHolder(@NonNull View itemView) {
        super(itemView);
        titleTxt = itemView.findViewById(R.id.title_txt);
        cricketImg = itemView.findViewById(R.id.cricket_img);
    }
}
