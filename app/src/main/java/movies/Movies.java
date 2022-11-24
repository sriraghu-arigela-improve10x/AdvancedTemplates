package movies;

import com.google.gson.annotations.SerializedName;

public class Movies {
    @SerializedName("name")
    public String title;
    @SerializedName("imageUrl")
    public String imageUrl;
}
