package com.code.thiru.farmfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class tamilinorganic extends AppCompatActivity {
    EditText e1;
    TextView tv1,tv2;
    Button go,amir,pancha,green,jeeva;
    String over;
    String s="நாட்கள்"+"\n"+"அமிர்தகரைசல்(லி)"+"\n"+"பஞ்சகாவ்யம்(லி)"+"\n"+"பசுந்தாள் உரம்(கிகி)"+"\n"+"ஜீவாமிர்தம்(லி)";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamilinorganic);
        e1=(EditText)findViewById(R.id.edit2);
        tv1=(TextView)findViewById(R.id.text5);
        tv2=(TextView)findViewById(R.id.text4);
        go=(Button)findViewById(R.id.search);
        amir=(Button)findViewById(R.id.ami);
        pancha=(Button)findViewById(R.id.pan);
        green=(Button)findViewById(R.id.gr);
        jeeva=(Button)findViewById(R.id.jeeva);
        final String temp=getIntent().getStringExtra("ClickValue");
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int a=Integer.parseInt(e1.getText().toString());
                if(temp.equals("நெல்")){
                    String url = "http://thirukkumaran.6te.net/login/organicpaddy.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String day="";
                                    String amirdham="",panchaka="",green="",jeevaa="";
                                    int n,p,k,j;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            day =day+"\t\t"+jsonobject.optString("days").toString();
                                            n =jsonobject.optInt("amirdhakaraisal");
                                            amirdham=amirdham+"\t\t\t\t"+(n*a);
                                            p=jsonobject.optInt("panchakaavuyam");
                                            panchaka=panchaka+"\t\t\t\t"+(p*a);
                                            k=jsonobject.optInt("green");
                                            green=green+"\t\t\t\t"+(k*a);
                                            j=jsonobject.optInt("jeevamirdham");
                                            jeevaa=jeevaa+"\t\t\t\t"+(j*a);
                                        }
                                        over=day+"\n"+amirdham+"\n"+panchaka+"\n"+green+"\n"+jeevaa;
                                    } catch (JSONException e) {
                                        Toast.makeText(getApplicationContext(),"No Result",Toast.LENGTH_SHORT).show();
                                        Log.e("JSON Error", "Error converting result " + e.toString());
                                        //e.printStackTrace();
                                    } catch (Exception e) {
                                        Log.e("Buffer Error", "Error converting result " + e.toString());
                                    }
                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(getApplicationContext(), String.valueOf(error), Toast.LENGTH_LONG).show();
                        }
                    }
                    );
                    MySingleton.getInstance(getApplicationContext()).addToRequestQueue(stringRequest);
                }
                if(temp.equals("கரும்பு")){
                    String url = "http://thirukkumaran.6te.net/login/organicsugar.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String day="";
                                    String amirdham="",panchaka="",green="",jeevaa="";
                                    int n,p,k,j;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            day =day+"\t\t"+jsonobject.optString("days").toString();
                                            n =jsonobject.optInt("amirdhakaraisal");
                                            amirdham=amirdham+"\t\t\t"+(n*a);
                                            p=jsonobject.optInt("panchakaavuyam");
                                            panchaka=panchaka+"\t\t\t"+(p*a);
                                            k=jsonobject.optInt("greenmannure");
                                            green=green+"\t\t\t"+(k*a);
                                            j=jsonobject.optInt("jeevamirdham");
                                            jeevaa=jeevaa+"\t\t\t"+(j*a);
                                        }
                                        over=day+"\n"+amirdham+"\n"+panchaka+"\n"+green+"\n"+jeevaa;
                                    } catch (JSONException e) {
                                        Toast.makeText(getApplicationContext(),"No Result",Toast.LENGTH_SHORT).show();
                                        Log.e("JSON Error", "Error converting result " + e.toString());
                                        //e.printStackTrace();
                                    } catch (Exception e) {
                                        Log.e("Buffer Error", "Error converting result " + e.toString());
                                    }
                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(getApplicationContext(), String.valueOf(error), Toast.LENGTH_LONG).show();
                        }
                    }
                    );
                    MySingleton.getInstance(getApplicationContext()).addToRequestQueue(stringRequest);
                }
                if(temp.equals("மக்காச்சோளம்")){
                    String url = "http://thirukkumaran.6te.net/login/organiccorn.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String day="";
                                    String amirdham="",panchaka="",green="",jeevaa="";
                                    int n,p,k,j;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            day =day+"\t\t"+jsonobject.optString("days").toString();
                                            n =jsonobject.optInt("amirdhakaraisal");
                                            amirdham=amirdham+"\t\t\t"+(n*a);
                                            p=jsonobject.optInt("panchakaavuyam");
                                            panchaka=panchaka+"\t\t\t"+(p*a);
                                            k=jsonobject.optInt("greenmannure");
                                            green=green+"\t\t\t"+(k*a);
                                            j=jsonobject.optInt("jeevamirdham");
                                            jeevaa=jeevaa+"\t\t\t"+(j*a);
                                        }
                                        over=day+"\n"+amirdham+"\n"+panchaka+"\n"+green+"\n"+jeevaa;
                                    } catch (JSONException e) {
                                        Toast.makeText(getApplicationContext(),"No Result",Toast.LENGTH_SHORT).show();
                                        Log.e("JSON Error", "Error converting result " + e.toString());
                                        //e.printStackTrace();
                                    } catch (Exception e) {
                                        Log.e("Buffer Error", "Error converting result " + e.toString());
                                    }
                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(getApplicationContext(), String.valueOf(error), Toast.LENGTH_LONG).show();
                        }
                    }
                    );
                    MySingleton.getInstance(getApplicationContext()).addToRequestQueue(stringRequest);
                }
                if(temp.equals("பருத்தி")){
                    String url = "http://thirukkumaran.6te.net/login/organiccotton.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String day="";
                                    String amirdham="",panchaka="",green="",jeevaa="";
                                    int n,p,k,j;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            day =day+"\t\t"+jsonobject.optString("days").toString();
                                            n =jsonobject.optInt("amirdhakaraisal");
                                            amirdham=amirdham+"\t\t\t"+(n*a);
                                            p=jsonobject.optInt("panchakaavuyam");
                                            panchaka=panchaka+"\t\t\t"+(p*a);
                                            k=jsonobject.optInt("greenmannure");
                                            green=green+"\t\t\t"+(k*a);
                                            j=jsonobject.optInt("jeevamirdham");
                                            jeevaa=jeevaa+"\t\t\t"+(j*a);
                                        }
                                        over=day+"\n"+amirdham+"\n"+panchaka+"\n"+green+"\n"+jeevaa;
                                    } catch (JSONException e) {
                                        Toast.makeText(getApplicationContext(),"No Result",Toast.LENGTH_SHORT).show();
                                        Log.e("JSON Error", "Error converting result " + e.toString());
                                        //e.printStackTrace();
                                    } catch (Exception e) {
                                        Log.e("Buffer Error", "Error converting result " + e.toString());
                                    }
                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(getApplicationContext(), String.valueOf(error), Toast.LENGTH_LONG).show();
                        }
                    }
                    );
                    MySingleton.getInstance(getApplicationContext()).addToRequestQueue(stringRequest);
                }
                tv1.setText(s);
                tv2.setText(over);
            }
        });
        amir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String te=amir.getText().toString();
                Intent in=new Intent(getApplicationContext(),amir.class);
                in.putExtra("value",te);
                startActivity(in);
            }
        });
        pancha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String te=pancha.getText().toString();
                Intent in=new Intent(getApplicationContext(),amir.class);
                in.putExtra("value",te);
                startActivity(in);
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String te=green.getText().toString();
                Intent in=new Intent(getApplicationContext(),amir.class);
                in.putExtra("value",te);
                startActivity(in);
            }
        });
        jeeva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String te=jeeva.getText().toString();
                Intent in=new Intent(getApplicationContext(),amir.class);
                in.putExtra("value",te);
                startActivity(in);
            }
        });
    }
}
