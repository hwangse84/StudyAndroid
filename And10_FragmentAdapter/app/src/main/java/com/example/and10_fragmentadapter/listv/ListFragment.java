package com.example.and10_fragmentadapter.listv;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.and10_fragmentadapter.R;


public class ListFragment extends Fragment {
 ListView listv;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_list_base, container, false);
        //Adapter종류가 다양함 - ArrayAdapter(사용빈도낮음), BaseAdapter(사용빈도 낮음),RecyclerAdapter(중요!)
        //Fragment는 독립적으로 화면에 존재x->반드시 액티비티를 통해 엑티비니의 저어를 받음
        //context(액티비니는 그냥 사용this)->Fragment는 액티비티에서 Context를 받아와야함, getContext
        //?
        //?

        String[] arr=new String[10];
        for(int i=0;i<arr.length;i++) {

            arr[i] = "글자" + i;
        }
         ArrayAdapter adapter=new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1,arr);

        listv= view.findViewById(R.id.listv);
        listv.setAdapter(adapter);


        return view;
    }

}