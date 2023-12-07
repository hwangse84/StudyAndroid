package com.example.project01_hsetalk.friend;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_hsetalk.databinding.ItemFriendRecvBinding;

import java.util.ArrayList;

public class FriendRecvAdapter extends RecyclerView.Adapter<FriendRecvAdapter.ViewHolder>{
    LayoutInflater inflater;//parent를 이용해서 초기화하는 방법은 나중에...
    ArrayList<FriendDTO> list;
    Context context;

    public FriendRecvAdapter(LayoutInflater inflater, ArrayList<FriendDTO> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
    }

    public FriendRecvAdapter(LayoutInflater inflater, ArrayList<FriendDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
        @Override
        public ViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType){
            ItemFriendRecvBinding binding = ItemFriendRecvBinding.inflate(inflater, parent, false);
            return new ViewHolder(binding);
        }

        @Override
        public void onBindViewHolder (@NonNull ViewHolder h,int i){
            h.binding.imgvProfile.setImageResource(list.get(i).getProfileImg());
            h.binding.tvName.setText(list.get(i).getName());
            h.binding.tvMsg.setText(list.get(i).getMsg());

            h.binding.lnFriend.setOnClickListener(v->{
                Intent intent=new Intent(context,FriendDetailActivity.class);
                intent.putExtra("dto",list.get(i));
                context.startActivity(intent);
            });
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        //1.ViewHolder(viex)->Binding을 사용해보기
        public class ViewHolder extends RecyclerView.ViewHolder {
            ItemFriendRecvBinding binding;//모든 위젝 종류를 씀(사용할꺼)

            public ViewHolder(@NonNull ItemFriendRecvBinding binding) {
                super(binding.getRoot());
                this.binding = binding;
            }
        }
    }
