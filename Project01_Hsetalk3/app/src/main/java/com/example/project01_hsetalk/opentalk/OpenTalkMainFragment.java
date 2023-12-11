package com.example.project01_hsetalk.opentalk;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_hsetalk.databinding.FragmentOpenTalkBinding;
import com.example.project01_hsetalk.opentalk.OpenTalkPagerAdapter;
import com.example.project01_hsetalk.opentalk.OpenTalkSubFragment;
import com.example.project01_hsetalk.R;
import com.example.project01_hsetalk.chat.ChatFragment;
import com.example.project01_hsetalk.databinding.FragmentOpenTalkBinding;
import com.example.project01_hsetalk.friend.FriendFragment;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.List;

public class OpenTalkMainFragment extends Fragment {

    FragmentOpenTalkBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentOpenTalkBinding.inflate(inflater, container, false);
        OpenTalkPagerAdapter adapter = new OpenTalkPagerAdapter(this, getFragmentList());
        binding.pager2.setAdapter(adapter);


        binding.chipGroup.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(@NonNull ChipGroup group, int checkedId) {
                if(checkedId == R.id.chip_1){
                    binding.pager2.setCurrentItem(0,true);
                } else  if(checkedId == R.id.chip_2){
                    binding.pager2.setCurrentItem(1,true);
                }  else  if(checkedId == R.id.chip_3){
                    binding.pager2.setCurrentItem(2,true);
                }  else  if(checkedId == R.id.chip_4){
                    binding.pager2.setCurrentItem(3,true);
                }
            }
        });




//        pager의 스크롤이 변하면서 선택되어있는 아이템 변경시 (페이지) 실행되는 메소드(인터페이스)
        binding.pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                if(position==0){
                    binding.chipGroup.check(R.id.chip_1);
                } else  if(position==1){
                    binding.chipGroup.check(R.id.chip_2);
                }  else  if(position==2){
                    binding.chipGroup.check(R.id.chip_3);
                }  else  if(position==3){
                    binding.chipGroup.check(R.id.chip_4);
                }

            }
        });


        return binding.getRoot();
    }

    //    프레그먼트 리스트로 관리
    ArrayList<Fragment> getFragmentList(){
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new OpenTalkSubFragment());
        list.add(new OpenTalkSubFragment());
        list.add(new OpenTalkSubFragment());
        list.add(new OpenTalkSubFragment());
        return list;
    }
}