package com.example.project01_hsetalk.chat;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_hsetalk.R;
import com.example.project01_hsetalk.databinding.FragmentChatBinding;
import com.example.project01_hsetalk.databinding.FragmentFriendBinding;
import com.example.project01_hsetalk.friend.FriendRecvAdapter;


public class ChatFragment extends Fragment {
FragmentChatBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // binding= FragmentFriendBinding.inflate(inflater,container,false);
         binding=FragmentChatBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public class ChatRecvAdapter extends RecyclerView.Adapter<ChatRecvAdapter, FriendRecvAdapter.ViewHolder>{

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull ChatRecvAdapter holder, int position) {
            
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }