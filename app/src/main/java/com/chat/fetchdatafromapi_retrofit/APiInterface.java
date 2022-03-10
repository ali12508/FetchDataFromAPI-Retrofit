package com.chat.fetchdatafromapi_retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APiInterface {
    @GET("posts")
    Call<List<Post>> getposts();
}
