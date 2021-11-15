package com.example.cafesuperlisto.request;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String UrlBase = "https://192.168.0.101:45457/api/";
    private static PostInterface postInterface;
    private static SharedPreferences sp;

    public static SharedPreferences conectar(Context context) {
        if (sp == null) {
            sp = context.getSharedPreferences("token.dat", 0);
        }
        return sp;
    }

    public static PostInterface getMyApiClient() {

        Gson gson = new GsonBuilder().setLenient().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(UrlBase)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        postInterface = retrofit.create(PostInterface.class);

        return postInterface;
    }

    public interface PostInterface {

    }

}
