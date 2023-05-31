package com.example.uitesting;

import android.os.StrictMode;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;

public class Conn_services {

    public void pack_rule(){

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);
        String[] appslist = new String []{};
        try {
            String response = "";
//            URL url = new URL(About+"/apps/list");
            String endpoint= "https://31fe-2401-4900-5292-3df5-f47c-1cac-a932-43f9.ngrok-free.app";
            URL url = new URL(endpoint+"/usageStats/getUsageData?duration=week&userId=231");

            HttpURLConnection urlConn = null;

            urlConn = (HttpURLConnection) url.openConnection();
            urlConn.setRequestMethod("GET");
            urlConn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            urlConn.setRequestProperty("Accept", "application/json");
            urlConn.setDoInput(true);
            int responseCode = urlConn.getResponseCode();
            Log.e("responseee1", String.valueOf(responseCode));
            if (responseCode == HttpsURLConnection.HTTP_OK) {

                String applist;
                BufferedReader br = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));

                while ((applist= br.readLine()) != null) {
                    response += applist;
                    final JSONObject app = new JSONObject(response);
//                     appslist
//
//
//                    JSONArray appsList = app.getJSONArray("data");
//                    for(int i=0;i< appsList.length();i++) {
////                         String fg = app.get("data").getString(i);
////                         appslist[i]= appsList.getString(i);
//                        appl.add(appsList.getString(i));
//
//                    }
                    Log.e("responseee", response);

//                    appslist= appl.toArray(appslist);
//                    appslist

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}


