package groceries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.improve10x.recyclerviewpractice.R;

import java.util.ArrayList;

public class GroceriesActivity extends AppCompatActivity {

    public ArrayList<Grocery> groceriesId;
    public GroceriesAdapter groceriesAdapter;
    public  RecyclerView groceriesRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groceries);
        getSupportActionBar().setTitle("Groceries");
        setData();
        groceriesRecyclerView();
    }

    public void groceriesRecyclerView() {
        groceriesRv = findViewById(R.id.grocires_rv);
        groceriesRv.setLayoutManager(new GridLayoutManager(this,3));
        groceriesAdapter = new GroceriesAdapter();
        groceriesAdapter.setData(groceriesId);
        groceriesRv.setAdapter(groceriesAdapter);
    }

    public void setData() {
        groceriesId = new ArrayList<>();

        Grocery freshFruits = new Grocery();
        freshFruits.title = "Fresh Fruits";
        freshFruits.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-fresh-fruits-3b26c10dc05d15fbe45ceb3d0eaa816d.png";
        groceriesId.add(freshFruits);

        Grocery onionsTomatoes = new Grocery();
        onionsTomatoes.title = "onions&Tomatoes";
        onionsTomatoes.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-onions-and-tomatos-1986e0017a966f57a20fce08853c25ad.png";
        groceriesId.add(onionsTomatoes);

        Grocery freshVegetables = new Grocery();
        freshVegetables.title = "Fresh Vegetables";
        freshVegetables.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-fresh-vegetables-9799bef8ba92fd03c53f0546ae404a55.png";
        groceriesId.add(freshVegetables);

        Grocery exoticFruits = new Grocery();
        exoticFruits.title = "Exotic Fruits";
        exoticFruits.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-exotic-fruits-d5fb208beef0323598ebd4e0c676d2b8.png";
        groceriesId.add(exoticFruits);

        Grocery mangoes = new Grocery();
        mangoes.title = "Mangoes";
        mangoes.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-mangoes-5dec36e3d054464908f125421f2748c2.png";
        groceriesId.add(mangoes);

        Grocery dairy = new Grocery();
        dairy.title = "Dairy";
        dairy.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-dairy-91f031697f2e433799e567f021460f9b.png";
        groceriesId.add(dairy);

        Grocery breadBuns = new Grocery();
        breadBuns.title = "Bread & Buns";
        breadBuns.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-bread-and-buns-ea6fc0dcbc8cd860c88cc1310c64e8d6.png";
        groceriesId.add(breadBuns);

        Grocery cerealsOats = new Grocery();
        cerealsOats.title = "Cereals Oats";
        cerealsOats.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-cereal-and-oats-4578a048785cef3231ce946e0385e320.png";
        groceriesId.add(cerealsOats);

        Grocery healthDrinks = new Grocery();
        healthDrinks.title = "Health Drinks";
        healthDrinks.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-horlicks-25492b5096ad52bcd21607c6fc3f03d9.png";
        groceriesId.add(healthDrinks);

        Grocery readyToEat = new Grocery();
        readyToEat.title = "Ready-to-eat";
        readyToEat.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-ready-to-eat-9f44b2f69ef008732be5de955293bfe5.png";
        groceriesId.add(readyToEat);

        Grocery biscuitsCookies = new Grocery();
        biscuitsCookies.title = "Biscuits Cookies";
        biscuitsCookies.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-biscuits-and-cookies-ee0423b9d3478a4c7499cf7f1d32e4bf.png";
        groceriesId.add(biscuitsCookies);

        Grocery chipsNamkeen = new Grocery();
        chipsNamkeen.title = "Chips Namkeen";
        chipsNamkeen.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-chips-and-namkeen-e3d8b0e18b4b6721cc565d03922ca3d5.png";
        groceriesId.add(chipsNamkeen);

        Grocery teaCoffee = new Grocery();
        teaCoffee.title = "Tea & Coffee";
        teaCoffee.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-tea-and-coffee-683381e7427398452e760dfb6c816e1e.png";
        groceriesId.add(teaCoffee);

        Grocery softDrinksJuice = new Grocery();
        softDrinksJuice.title = "Soft Drinks & Juice";
        softDrinksJuice.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-softdrinks-and-juice-09a3e724b1b1851ffe9747d4c03eb3b7.png";
        groceriesId.add(softDrinksJuice);

        Grocery energySportsDrinks = new Grocery();
        energySportsDrinks.title = "Energy & SportsDrinks";
        energySportsDrinks.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-energy-and-sportsdrinks-8dc82b984a9a536206aa8685dce463b8.png";
        groceriesId.add(energySportsDrinks);

        Grocery attaFlours = new Grocery();
        attaFlours.title = "Atta & Flours";
        attaFlours.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-atta-and-flours-b85c359a33d1a017df2ddc830dbb3172.png";
        groceriesId.add(attaFlours);

        Grocery bakingEssentials = new Grocery();
        bakingEssentials.title = "Baking Essentials";
        bakingEssentials.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-baking-essentials-5b3a70840b2f29a6bfd8f08bbc62c339.png";
        groceriesId.add(bakingEssentials);

        Grocery cookingPastes = new Grocery();
        cookingPastes.title = "Cooking Pastes";
        cookingPastes.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-cooking-pastes-75b2e7ccc1255261d1a277d63209b1ae.png";
        groceriesId.add(cookingPastes);

        Grocery masalaSpices = new Grocery();
        masalaSpices.title = "Masala Spices";
        masalaSpices.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-masala-and-spices-985e3e74c25545edecc6e13b3f3728fb.png";
        groceriesId.add(masalaSpices);

        Grocery cannedFruitsVegetables = new Grocery();
        cannedFruitsVegetables.title = "Canned Fruits & Vegetables";
        cannedFruitsVegetables.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-canned-fruit-and-vegetables-c6adef7534b8faa7100c671daab54e2f.png";
        groceriesId.add(cannedFruitsVegetables);

        Grocery chicken = new Grocery();
        chicken.title = "Chicken";
        chicken.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-chicken-8883976089fb7016f8b1e0f058fcdd8a.png";
        groceriesId.add(chicken);

        Grocery fishSeaFood = new Grocery();
        fishSeaFood.title = "Fish & SeaFood";
        fishSeaFood.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-fish-and-seafood-b692e65b128c6dc49d42a4c39b8dac92.png";
        groceriesId.add(fishSeaFood);

        Grocery mutton = new Grocery();
        mutton.title = "Mutton";
        mutton.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-mutton-af19fffe878f5d0e057cc44865967cb5.png";
        groceriesId.add(mutton);

        Grocery marinatedCuts = new Grocery();
        marinatedCuts.title = "Marinated Cuts";
        marinatedCuts.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-marinated-cuts-daf965857a0904ab3cc263e2e3c1f672.png";
        groceriesId.add(marinatedCuts);

        Grocery eggs = new Grocery();
        eggs.title = "Eggs";
        eggs.imageUrl = "https://resources.dunzo.com/web-assets/prod/_next/static/images/dunzo-daily-eggs-e1f42bcafd6d5cd04084de21bad9c494.png";
        groceriesId.add(eggs);
    }
}