package groceries;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.recyclerviewpractice.R;

public class GroceriesViewHolder extends RecyclerView.ViewHolder {

    public TextView titleTxt;
    public ImageView groceriesImg;

    public GroceriesViewHolder(@NonNull View itemView) {
        super(itemView);
        titleTxt = itemView.findViewById(R.id.title_txt);
        groceriesImg = itemView.findViewById(R.id.groceries_img);
    }
}
