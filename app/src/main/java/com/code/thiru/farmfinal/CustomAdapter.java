package com.code.thiru.farmfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String plantList[];
    int plants[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] plantList, int[] plants) {
        this.context = context;
        this.plantList = plantList;
        this.plants = plants;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return plantList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.farm_plan, null);
        TextView plant = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        plant.setText(plantList[i]);
        icon.setImageResource(plants[i]);
        return view;
    }
}
