package com.code.thiru.farmfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class insects extends AppCompatActivity {
        ListView simpleList;
        String plantList[]={"Gundhi bug","Worm turn","Corn Beetle","Dupont pioneer","Green leafhopper","Ladybird","Swarming Caterpiller","Whorl Maggot"};
        int plants[]={R.drawable.gundhi_bug,R.drawable.worm_turn,R.drawable.corn_beetle,R.drawable.dupont_pioneer,R.drawable.green_leafhopper,R.drawable.ladybird,R.drawable.swarming_caterpiller,R.drawable.whorl_maggot};
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_insects);
            simpleList=(ListView)findViewById(R.id.listView);
            Custom customAdapter = new Custom(getApplicationContext(), plantList, plants);
            simpleList.setAdapter(customAdapter);
           simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String temp=plantList[i].toString();
                    Intent in=new Intent(getApplicationContext(),tamilpest.class);
                    in.putExtra("Clicke",temp);
                    startActivity(in);
                }
            });
    }
}
