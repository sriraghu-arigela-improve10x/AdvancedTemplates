package groceries;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.improve10x.recyclerviewpractice.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class GroceriesAdapter extends RecyclerView.Adapter<GroceriesViewHolder> {

    public ArrayList<Grocery> groceryList;

    public void setData(ArrayList<Grocery> groceries) {
        groceryList = groceries;
    }
    @NonNull
    @Override
    public GroceriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.groceries_item, parent, false);
        GroceriesViewHolder groceriesViewHolder = new GroceriesViewHolder(view);
        return groceriesViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GroceriesViewHolder holder, int position) {
    Grocery grocery = groceryList.get(position);
    holder.titleTxt.setText(grocery.title);
    Picasso.get().load(grocery.imageUrl).into(holder.groceriesImg);
    }

    @Override
    public int getItemCount() {
        return groceryList.size();
    }
}
