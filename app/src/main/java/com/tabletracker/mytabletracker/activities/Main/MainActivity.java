package com.tabletracker.mytabletracker.activities.Main;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.tabletracker.mytabletracker.fragments.ActionsFragment;
import com.tabletracker.mytabletracker.models.Food;
import com.tabletracker.mytabletracker.adapters.FoodListAdapter;
import com.tabletracker.mytabletracker.fragments.MenuFragment;
import com.tabletracker.mytabletracker.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FoodListAdapter food_list_adapter;
    GridView gv_food_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        if(findViewById(R.id.fragment_menu) != null){
            if(savedInstanceState != null){
                return;
            }

            MenuFragment menuFragment = new MenuFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().add(R.id.fragment_menu, menuFragment,null);
            fragmentTransaction.commit();
        }

        if(findViewById(R.id.fragment_actions) != null){
            if(savedInstanceState != null){
                return;
            }

            ActionsFragment actionsFragment = new ActionsFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction().add(R.id.fragment_actions, actionsFragment,null);
            fragmentTransaction.commit();
        }

        gv_food_list = (GridView) findViewById(R.id.gridview);

        food_list_adapter = new FoodListAdapter(this,getData());
        gv_food_list.setAdapter(food_list_adapter);

    }

    private ArrayList getData()
    {
        ArrayList<Food> spacecrafts=new ArrayList<>();

        Food s=new Food();
        s.setName("Pioneer");
        s.setImage(R.drawable.chicken);
        spacecrafts.add(s);

        s=new Food();
        s.setName("Spitzer");
        s.setImage(R.drawable.jidori);
        spacecrafts.add(s);


        s=new Food();
        s.setName("Enterprise");
        s.setImage(R.drawable.chicken);
        spacecrafts.add(s);


        s=new Food();
        s.setName("Hubble");
        s.setImage(R.drawable.jidori);
        spacecrafts.add(s);


        s=new Food();
        s.setName("Voyager");
        s.setImage(R.drawable.chicken);
        spacecrafts.add(s);


        s=new Food();
        s.setName("Kepler");
        s.setImage(R.drawable.jidori);
        spacecrafts.add(s);


        s=new Food();
        s.setName("Rosetter");
        s.setImage(R.drawable.chicken);
        spacecrafts.add(s);


        s=new Food();
        s.setName("WMAP");
        s.setImage(R.drawable.jidori);
        spacecrafts.add(s);


        s=new Food();
        s.setName("Columbia");
        s.setImage(R.drawable.chicken);
        spacecrafts.add(s);

        s=new Food();
        s.setName("Columbia");
        s.setImage(R.drawable.jidori);
        spacecrafts.add(s);

        s=new Food();
        s.setName("Columbia");
        s.setImage(R.drawable.chicken);
        spacecrafts.add(s);

        s=new Food();
        s.setName("Columbia");
        s.setImage(R.drawable.jidori);
        spacecrafts.add(s);

        s=new Food();
        s.setName("Columbia");
        s.setImage(R.drawable.chicken);
        spacecrafts.add(s);

        s=new Food();
        s.setName("Columbia");
        s.setImage(R.drawable.jidori);
        spacecrafts.add(s);
        s=new Food();
        s.setName("Columbia");
        s.setImage(R.drawable.chicken);
        spacecrafts.add(s);
        s=new Food();
        s.setName("Columbia");
        s.setImage(R.drawable.jidori);
        spacecrafts.add(s);
        s=new Food();
        s.setName("Columbia");
        s.setImage(R.drawable.chicken);
        spacecrafts.add(s);
        s=new Food();
        s.setName("Columbia");
        s.setImage(R.drawable.jidori);
        spacecrafts.add(s);
        s=new Food();
        s.setName("Columbia");
        s.setImage(R.drawable.chicken);
        spacecrafts.add(s);
        s=new Food();
        s.setName("Columbia");
        s.setImage(R.drawable.jidori);
        spacecrafts.add(s);
        s=new Food();
        s.setName("Columbia");
        s.setImage(R.drawable.chicken);
        spacecrafts.add(s);
        s=new Food();
        s.setName("Columbia");
        s.setImage(R.drawable.jidori);
        spacecrafts.add(s);
        s=new Food();
        s.setName("Columbia");
        s.setImage(R.drawable.chicken);
        spacecrafts.add(s);

        return spacecrafts;
    }
}
