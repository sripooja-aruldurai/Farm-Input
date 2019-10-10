package com.code.thiru.farmfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Custom extends BaseAdapter {
    Context context;
    String plantList[];
    int plants[];
    LayoutInflater inflter;

    public Custom(Context applicationContext, String[] InsectList, int[] insects) {
        this.context = context;
        this.plantList =InsectList;
        this.plants = insects;
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
        view = inflter.inflate(R.layout.insect_xml, null);
        TextView plant = (TextView) view.findViewById(R.id.text);
        ImageView icon = (ImageView) view.findViewById(R.id.ic);
        plant.setText(plantList[i]);
        icon.setImageResource(plants[i]);
        return view;
    }
}
