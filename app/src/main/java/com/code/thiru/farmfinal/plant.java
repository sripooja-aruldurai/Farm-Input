package com.code.thiru.farmfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class plant extends AppCompatActivity {
    ListView simpleList;
    String plantList[]={"Paddy","Sugarcane","Banana","Corn","Raagi","Cotton"};
    int plants[]={R.drawable.paddy,R.drawable.sugarcane,R.drawable.banana,R.drawable.corn,R.drawable.raagi,R.drawable.cotton};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant);
        simpleList=(ListView)findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), plantList, plants);
        simpleList.setAdapter(customAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String tempValue=plantList[i].toString();
                Intent intent=new Intent(getApplicationContext(),organic.class);
                intent.putExtra("ClickedValue",tempValue);
                startActivity(intent);
            }
        });
    }
}
