package com.chat.fetchdatafromapi_retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.myViewHolder> {

private Context context;

    public PostAdapter(Context context, List<Post> post) {
        this.context = context;
        this.post = post;
    }

    private List<Post> post;







    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
 View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.smaple_row,parent,false);
 return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
          Post posts=post.get(position);
         holder.t1.setText(posts.getId().toString());
          holder.t2.setText(posts.getTitle());
          holder.t3.setText(posts.getBody());
    }

    @Override
    public int getItemCount() {
        return post.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
        TextView t1,t2,t3;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.pid);
            t2=itemView.findViewById(R.id.ptitle);
            t3=itemView.findViewById(R.id.pdesc);
        }
    }
}
