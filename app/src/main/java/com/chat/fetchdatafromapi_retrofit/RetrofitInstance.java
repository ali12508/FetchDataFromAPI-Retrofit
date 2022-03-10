package com.chat.fetchdatafromapi_retrofit;

import java.security.PrivateKey;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitInstance {
    private  static Retrofit retrofit;
    private static final String BASEURl= "https://jsonplaceholder.typicode.com";
    public  static Retrofit getRetrofit(){
        if (retrofit == null) {

            retrofit=new Retrofit.Builder().baseUrl(BASEURl).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }


}
