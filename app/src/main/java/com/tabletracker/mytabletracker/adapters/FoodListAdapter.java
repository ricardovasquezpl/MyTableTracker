package com.tabletracker.mytabletracker.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tabletracker.mytabletracker.R;
import com.tabletracker.mytabletracker.models.Food;

import java.util.ArrayList;

/**
 * Created by FTF-ANDREA on 27/03/2018.
 */

public class FoodListAdapter extends BaseAdapter{
    Context context;
    ArrayList<Food> foodList;

    public FoodListAdapter(Context context, ArrayList<Food> spacecrafts) {
        this.context = context;
        this.foodList = spacecrafts;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int i) {
        return foodList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            view = LayoutInflater.from(context).inflate(R.layout.food,viewGroup,false);
        }

        final Food s = (Food) this.getItem(i);

        ImageView img    = (ImageView) view.findViewById(R.id.spacecraftImg);
        TextView nameTxt = (TextView) view.findViewById(R.id.nameTxt);

        nameTxt.setText(s.getName());
        img.setImageResource(s.getImage());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, s.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
