package com.code.thiru.farmfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class amir extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amir);
        tv=(TextView)findViewById(R.id.text1);
        String temp=getIntent().getStringExtra("value");
        if(temp.equals("Amirdhakaraisal")){
            tv.setText(R.string.amir_text);
        }
        if(temp.equals("Panchakaavuyam")){
            tv.setText(R.string.pancha_text);
        }
        if(temp.equals("Green mannure")){
            tv.setText(R.string.green_text);
        }
        if(temp.equals("jeevaamirdham")){
            tv.setText(R.string.jeeva_text);
        }
        if(temp.equals("அமிர்தகரைசல்")){
            tv.setText(R.string.ami_text);
        }
        if(temp.equals("பஞ்சகாவ்யம்")){
            tv.setText(R.string.panch_text);
        }
        if(temp.equals("பசுந்தாள் உரம்")){
            tv.setText(R.string.gree_text);
        }
        if(temp.equals("ஜீவாமிர்தம்")){
            tv.setText(R.string.jeev_text);
        }
    }
}
