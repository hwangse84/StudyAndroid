package com.example.and10_fragmentadapter.Exam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and10_fragmentadapter.R;
import com.example.and10_fragmentadapter.recycler.RecyclerAdapter;

public class ExamAdapter extends RecyclerView.Adapter<ExamAdapter.ViewHolder> {
    //1.
    //
LayoutInflater inflater;


    public ExamAdapter(LayoutInflater inflater) {

        this.inflater = inflater;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.item_recv_melon,parent,false);
       ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    //1.
    public class  ViewHolder extends RecyclerView.ViewHolder{
        ImageView Hse;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
