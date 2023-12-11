package com.example.project01_hsetalk.opentalk;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_hsetalk.databinding.ItemOpentalkChat2Binding;
import com.example.project01_hsetalk.opentalk.OpenSubDTOS;

import java.util.ArrayList;

public class OpenSubAdapter2 extends RecyclerView.Adapter<OpenSubAdapter2.ViewHolder> {
    ArrayList<OpenSubDTOS.OpenSub2DTO> list ;

    public OpenSubAdapter2(ArrayList<OpenSubDTOS.OpenSub2DTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemOpentalkChat2Binding binding = ItemOpentalkChat2Binding.inflate(LayoutInflater.from(parent.getContext()) , parent , false );
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvProfile.setImageResource(list.get(i).getImgTitle());
        h.binding.tvRecent.setText(list.get(i).getChatCnt()+"명 참여중");
        h.binding.tvRecent.setText(list.get(i).getRecent());
        h.binding.tvName.setText(list.get(i).getRoomTitie());
        String tag = "";


        for (int j = 0; j < list.get(i).getTagArr().length; j++) {
            tag += "#"+list.get(i).getTagArr()[j];
        }

        h.binding.tv.setText(String.join("#" , list.get(i).getTagArr()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemOpentalkChat2Binding binding;
        public ViewHolder(@NonNull ItemOpentalkChat2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}