package com.example.todoapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class DoesAdapter extends RecyclerView.Adapter<DoesAdapter.MyViewHolder> {

    Context context;
    ArrayList<MyDoes> myDoes;

    public DoesAdapter(Context c,ArrayList<MyDoes> p){
        context = c;
        myDoes = p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_does,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder ViewHolder, int i) {
        ViewHolder.titles.setText(myDoes.get(i).getTitledoes());
        ViewHolder.description.setText(myDoes.get(i).getDescdoes());
        ViewHolder.date.setText(myDoes.get(i).getDate());
    }

    @Override
    public int getItemCount() {
        return myDoes.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titles, description, date;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titles = itemView.findViewById(R.id.titlepage);
            description = itemView.findViewById(R.id.description);
            date = itemView.findViewById(R.id.date);
        }
    }
}
