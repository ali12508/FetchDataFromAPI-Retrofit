package com.chat.fetchdatafromapi_retrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
APiInterface aPiInterface;
RecyclerView recyclerView;
PostAdapter postAdapter;
ArrayList<Post> postArrayList =null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     recyclerView=findViewById(R.id.recylerview);

        aPiInterface=RetrofitInstance.getRetrofit().create(APiInterface.class);
        aPiInterface.getposts().enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if(response.body().size()>0){
                    List<Post>postLists=response.body();
                    PostAdapter postAdapterr=new PostAdapter(MainActivity.this,postLists);
                    LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setAdapter(postAdapterr);
                    Toast.makeText(MainActivity.this, "data...", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(MainActivity.this, "no data...", Toast.LENGTH_SHORT).show();

                }

            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

            }
        });

    }
}