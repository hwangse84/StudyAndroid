package com.example.and10_fragmentadapter.listv;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.and10_fragmentadapter.R;

import java.util.ArrayList;
import java.util.Random;

public class ListBaseFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_list_base, container, false);
        ListView listv = v.findViewById(R.id.listv);
        ArrayList<ListDTO> list= new ArrayList<>();

        list.add(new ListDTO(R.drawable.img1,new Random().nextInt(30)+1, "강아지","남"));
        list.add(new ListDTO(R.drawable.img2,new Random().nextInt(30)+1, "부엉이","여"));
        list.add(new ListDTO(R.drawable.img3,new Random().nextInt(30)+1, "고양이","남"));
        list.add(new ListDTO(R.drawable.img4,new Random().nextInt(30)+1, "돌고래","여"));
        list.add(new ListDTO(R.drawable.img5,new Random().nextInt(30)+1, "고양이 (새끼)","남"));
        list.add(new ListDTO(R.drawable.img1,new Random().nextInt(30)+1, "강아지","남"));
        list.add(new ListDTO(R.drawable.img2,new Random().nextInt(30)+1, "부엉이","여"));
        list.add(new ListDTO(R.drawable.img3,new Random().nextInt(30)+1, "고양이","남"));
        list.add(new ListDTO(R.drawable.img4,new Random().nextInt(30)+1, "돌고래","여"));
        list.add(new ListDTO(R.drawable.img5,new Random().nextInt(30)+1, "고양이 (새끼)","남"));
        list.add(new ListDTO(R.drawable.img1,new Random().nextInt(30)+1, "강아지","남"));
        list.add(new ListDTO(R.drawable.img2,new Random().nextInt(30)+1, "부엉이","여"));
        list.add(new ListDTO(R.drawable.img3,new Random().nextInt(30)+1, "고양이","남"));
        list.add(new ListDTO(R.drawable.img4,new Random().nextInt(30)+1, "돌고래","여"));
        list.add(new ListDTO(R.drawable.img5,new Random().nextInt(30)+1, "고양이 (새끼)","남"));

        ListBaseAdapter adapter = new ListBaseAdapter(inflater,list);
        listv.setAdapter(adapter);
        return v;
    }
}