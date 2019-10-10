package com.code.thiru.farmfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class tamilfertilizer extends AppCompatActivity {
    ListView simpleList;
    String plantList[]={"நெல்","கரும்பு","பருத்தி","மக்காச்சோளம்","வாழை","கேழ்வரகு"};
    int plants[]={R.drawable.paddy,R.drawable.sugarcane,R.drawable.cotton,R.drawable.corn,R.drawable.banana,R.drawable.raagi};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamilfertilizer);
        simpleList=(ListView)findViewById(R.id.tamillist);
        TamilCustomAdapter customAdapter = new TamilCustomAdapter(getApplicationContext(), plantList, plants);
        simpleList.setAdapter(customAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String temp=plantList[i].toString();
                Intent in=new Intent(getApplicationContext(),tamilinorganic.class);
                in.putExtra("ClickValue",temp);
                startActivity(in);
            }
        });
    }
}
