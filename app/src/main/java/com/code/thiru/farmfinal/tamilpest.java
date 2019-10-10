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

public class tamilpest extends AppCompatActivity {
    TextView t1,t2;
    EditText et1;
    Button btn1;
    String over,val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamilpest);
        t1=(TextView)findViewById(R.id.view5);
        t2=(TextView)findViewById(R.id.view6);
        et1=(EditText)findViewById(R.id.edit5);
        btn1=(Button) findViewById(R.id.but5);
        final String temp=getIntent().getStringExtra("Clicke");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int a=Integer.parseInt(et1.getText().toString());
                if(temp.equals("Gundhi bug")){
                    String url = "http://thirukkumaran.6te.net/login/pestbug.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String name="",benefits="",quantity="";
                                    int q,k=0;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            name=name+"\n"+jsonobject.optString("name");
                                            q=jsonobject.optInt("quantity");
                                            k=q*a;
                                            quantity=quantity+"\n"+k;
                                            benefits=benefits+"\n"+jsonobject.optString("benefits");
                                        }
                                        over=name;
                                        val=quantity;
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
                if(temp.equals("Green leafhopper")){
                    String url = "http://thirukkumaran.6te.net/login/glh.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String name="",quantity="";
                                    int q,k=0;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            name=name+"\n"+jsonobject.optString("name");
                                            q=jsonobject.optInt("quantity");
                                            k=q*a;
                                            quantity=quantity+"\n"+k;
                                        }
                                        over=name;
                                        val=quantity;
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
                if(temp.equals("Worm turn")){
                    String url = "http://thirukkumaran.6te.net/login/worm.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String name="",quantity="";
                                    int q,k=0;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            name=name+"\n"+jsonobject.optString("name");
                                            q=jsonobject.optInt("quantity");
                                            k=q*a;
                                            quantity=quantity+"\n"+k;
                                        }
                                        over=name;
                                        val=quantity;
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
                if(temp.equals("Corn Beetle")){
                    String url = "http://thirukkumaran.6te.net/login/corn_beetle.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String name="",quantity="";
                                    int q,k=0;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            name=name+"\n"+jsonobject.optString("name");
                                            q=jsonobject.optInt("quantity");
                                            k=q*a;
                                            quantity=quantity+"\n"+k;
                                        }
                                        over=name;
                                        val=quantity;
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
                if(temp.equals("Dupont pioneer")){
                    String url = "http://thirukkumaran.6te.net/login/dupont.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String name="",quantity="";
                                    int q,k=0;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            name=name+"\n"+jsonobject.optString("name");
                                            q=jsonobject.optInt("quantity");
                                            k=q*a;
                                            quantity=quantity+"\n"+k;
                                        }
                                        over=name;
                                        val=quantity;
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
                if(temp.equals("Ladybird")){
                    String url = "http://thirukkumaran.6te.net/login/bird.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String name="",quantity="";
                                    int q,k=0;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            name=name+"\n"+jsonobject.optString("name");
                                            q=jsonobject.optInt("quantity");
                                            k=q*a;
                                            quantity=quantity+"\n"+k;
                                        }
                                        over=name;
                                        val=quantity;
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
                if(temp.equals("Swarming Caterpiller")){
                    String url = "http://thirukkumaran.6te.net/login/cater.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String name="",quantity="";
                                    int q,k=0;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            name=name+"\n"+jsonobject.optString("name");
                                            q=jsonobject.optInt("quantity");
                                            k=q*a;
                                            quantity=quantity+"\n"+k;
                                        }
                                        over=name;
                                        val=quantity;
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
                if(temp.equals("Whorl Maggot")){
                    String url = "http://thirukkumaran.6te.net/login/whorl.php";
                    StringRequest stringRequest = new StringRequest(Request.Method.GET,
                            url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    String name="",quantity="";
                                    int q,k=0;
                                    try {
                                        System.out.println(response);
                                        String no_o = response.replaceAll("<div style=\"text-align: right;position: fixed;top: 5px;right:5px;width: 100%;z-index:999999;cursor: pointer;line-height: 0;display:block;\"><a target=\"_blank\" href=\"https://www.freewebhostingarea.com\" title=\"Free Web Hosting with php7\"><img alt=\"Free Web Hosting\" width=\"350\" height=\"25\" src=\"https://www.freewebhostingarea.com/images/poweredby.gif\" style=\"border-width: 0px;\"></a></div>", "");
                                        Log.d("msg", no_o+" ");
                                        JSONArray jsonarray = new JSONArray(no_o+" ");
                                        for (int i = 0; i < jsonarray.length(); i++) {
                                            JSONObject jsonobject = jsonarray.getJSONObject(i);
                                            name=name+"\n"+jsonobject.optString("name");
                                            q=jsonobject.optInt("quantity");
                                            k=q*a;
                                            quantity=quantity+"\n"+k;
                                        }
                                        over=name;
                                        val=quantity;
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


                t1.setText(over);
                t2.setText(val);
            }
        });
    }
}
