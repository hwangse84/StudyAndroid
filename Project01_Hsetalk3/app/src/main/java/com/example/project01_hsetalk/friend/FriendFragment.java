package com.example.project01_hsetalk.friend;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_hsetalk.R;
import com.example.project01_hsetalk.databinding.FragmentFriendBinding;

import java.util.ArrayList;

public class FriendFragment extends Fragment {
    FragmentFriendBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentFriendBinding.inflate(inflater,container,false);

        binding.recvFriend.setAdapter(new FriendRecvAdapter(inflater,getFriendList(),getContext()));
        binding.recvFriend.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    ArrayList<FriendDTO> getFriendList(){

        ArrayList<FriendDTO> list=new ArrayList<>();
        list.add(new FriendDTO(R.drawable.friend_profile_img1,R.drawable.friend_back_img1,"김이름","👌💖헤헤"));
        list.add(new FriendDTO(R.drawable.friend_profile_img2,R.drawable.friend_back_img2,"김이영","나는"));
        list.add(new FriendDTO(R.drawable.friend_profile_img3,R.drawable.friend_back_img3,"서이름","담주 🤣토욜"));
        list.add(new FriendDTO(R.drawable.friend_profile_img4,R.drawable.friend_back_img4,"김송름","이사가"));
        list.add(new FriendDTO(R.drawable.friend_profile_img5,R.drawable.friend_back_img5,"도강름","밤샘🤦‍♀️"));
        list.add(new FriendDTO(R.drawable.friend_profile_img6,R.drawable.friend_back_img6,"사이름","허걱"));
        list.add(new FriendDTO(R.drawable.friend_profile_img7,R.drawable.friend_back_img7,"황이사","힘🤔듬"));
        list.add(new FriendDTO(R.drawable.friend_profile_img8,R.drawable.friend_back_img8,"김경름","다시"));
        list.add(new FriendDTO(R.drawable.friend_profile_img9,R.drawable.friend_back_img9,"호이름","하루✌"));
        list.add(new FriendDTO(R.drawable.friend_profile_img10,R.drawable.friend_back_img10,"박이름","시작😃"));
        list.add(new FriendDTO(R.drawable.friend_profile_img1,R.drawable.friend_back_img1,"김이름","👌💖헤헤"));
        list.add(new FriendDTO(R.drawable.friend_profile_img2,R.drawable.friend_back_img2,"김이영","나는"));
        list.add(new FriendDTO(R.drawable.friend_profile_img3,R.drawable.friend_back_img3,"서이름","담주 🤣토욜"));
        list.add(new FriendDTO(R.drawable.friend_profile_img4,R.drawable.friend_back_img4,"김송름","이사가"));
        list.add(new FriendDTO(R.drawable.friend_profile_img5,R.drawable.friend_back_img5,"도강름","밤샘🤦‍♀️"));
        list.add(new FriendDTO(R.drawable.friend_profile_img6,R.drawable.friend_back_img6,"사이름","허걱"));
        list.add(new FriendDTO(R.drawable.friend_profile_img7,R.drawable.friend_back_img7,"황이사","힘🤔듬"));
        list.add(new FriendDTO(R.drawable.friend_profile_img8,R.drawable.friend_back_img8,"김경름","다시"));
        list.add(new FriendDTO(R.drawable.friend_profile_img9,R.drawable.friend_back_img9,"호이름","하루✌"));
        list.add(new FriendDTO(R.drawable.friend_profile_img10,R.drawable.friend_back_img10,"박이름","시작😃"));
        binding.tvFriendCnt.setText("친구"+list.size());
        return  list;
    }

}