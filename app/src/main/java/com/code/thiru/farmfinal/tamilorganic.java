package com.code.thiru.farmfinal;

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

public class tamilorganic extends AppCompatActivity {
    TextView t1,t2;
    EditText et1;
    Button btn1;
    String over;
    String s="நாட்கள்"+"\n"+"நைட்ரஜன்(கிகி)"+"\n"+"பாஸ்பரஸ்(கிகி)"+"\n"+"பொட்டாசியம்(கிகி)";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamilorganic);
        t1=(TextView)findViewById(R.id.text2);
        t2=(TextView)findViewById(R.id.view1);
        et1=(EditText)findViewById(R.id.edit);
        btn1=(Button)findViewById(R.id.search1);
        final String temp=getIntent().getStringExtra("Click");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int a=Integer.parseInt(et1.getText().toString());
                if(temp.equals("நெல்")){
                    String url = "http://thirukkumaran.6te.net/login/paddy.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String data = "";
                                    String day="";
                                    String nitrogen="",phosphorous="",potassium="";
                                    int n,p,k;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            day =day+"\t\t"+jsonobject.optString("days").toString();
                                            n =jsonobject.optInt("nitrogen");
                                            nitrogen=nitrogen+"\t\t\t"+(n*a);
                                            p=jsonobject.optInt("phosphorous");
                                            phosphorous=phosphorous+"\t\t\t"+(p*a);
                                            k=jsonobject.optInt("potassium");
                                            potassium=potassium+"\t\t\t"+(k*a);
                                        }
                                        over=day+"\n"+nitrogen+"\n"+phosphorous+"\n"+potassium;
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
                    String url = "http://thirukkumaran.6te.net/login/sugarcane.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String day="";
                                    String nitrogen="",phosphorous="",potassium="";
                                    int n,p,k;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            day =day+"\t\t"+jsonobject.optString("days").toString();
                                            n =jsonobject.optInt("nitrogen");
                                            nitrogen=nitrogen+"\t\t\t"+(n*a);
                                            p=jsonobject.optInt("phosphorous");
                                            phosphorous=phosphorous+"\t\t\t"+(p*a);
                                            k=jsonobject.optInt("potassium");
                                            potassium=potassium+"\t\t\t"+(k*a);
                                        }
                                        over=day+"\n"+nitrogen+"\n"+phosphorous+"\n"+potassium;
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
                    String url = "http://thirukkumaran.6te.net/login/corn.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String day="";
                                    String nitrogen="",phosphorous="",potassium="";
                                    int n,p,k;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            day =day+"\t\t"+jsonobject.optString("days").toString();
                                            n =jsonobject.optInt("nitrogen");
                                            nitrogen=nitrogen+"\t\t\t"+(n*a);
                                            p=jsonobject.optInt("phosphorous");
                                            phosphorous=phosphorous+"\t\t\t"+(p*a);
                                            k=jsonobject.optInt("potassium");
                                            potassium=potassium+"\t\t\t"+(k*a);
                                        }
                                        over=day+"\n"+nitrogen+"\n"+phosphorous+"\n"+potassium;
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
                if(temp.equals("கேழ்வரகு")){
                    String url = "http://thirukkumaran.6te.net/login/raagi.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String day="";
                                    String nitrogen="",phosphorous="",potassium="";
                                    int n,p,k;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            day =day+"\t\t"+jsonobject.optString("days").toString();
                                            n =jsonobject.optInt("nitrogen");
                                            nitrogen=nitrogen+"\t\t\t"+(n*a);
                                            p=jsonobject.optInt("phosphorous");
                                            phosphorous=phosphorous+"\t\t\t"+(p*a);
                                            k=jsonobject.optInt("potassium");
                                            potassium=potassium+"\t\t\t"+(k*a);
                                        }
                                        over=day+"\n"+nitrogen+"\n"+phosphorous+"\n"+potassium;
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
                if(temp.equals("வாழை")){
                    String url = "http://thirukkumaran.6te.net/login/banana.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String day="";
                                    String nitrogen="",phosphorous="",potassium="";
                                    int n,p,k;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            day =day+"\t\t"+jsonobject.optString("days").toString();
                                            n =jsonobject.optInt("nitrogen");
                                            nitrogen=nitrogen+"\t\t\t"+(n*a);
                                            p=jsonobject.optInt("phosphorous");
                                            phosphorous=phosphorous+"\t\t\t"+(p*a);
                                            k=jsonobject.optInt("potassium");
                                            potassium=potassium+"\t\t\t"+(k*a);
                                        }
                                        over=day+"\n"+nitrogen+"\n"+phosphorous+"\n"+potassium;
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
                    String url = "http://thirukkumaran.6te.net/login/cotton.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String day="";
                                    String nitrogen="",phosphorous="",potassium="";
                                    int n,p,k;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            day =day+"\t\t"+jsonobject.optString("days").toString();
                                            n =jsonobject.optInt("nitrogen");
                                            nitrogen=nitrogen+"\t\t\t"+(n*a);
                                            p=jsonobject.optInt("phosphorous");
                                            phosphorous=phosphorous+"\t\t\t"+(p*a);
                                            k=jsonobject.optInt("potassium");
                                            potassium=potassium+"\t\t\t"+(k*a);
                                        }
                                        over=day+"\n"+nitrogen+"\n"+phosphorous+"\n"+potassium;
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
                t2.setText(s);
                t1.setText(over);
            }
        });

    }
}
