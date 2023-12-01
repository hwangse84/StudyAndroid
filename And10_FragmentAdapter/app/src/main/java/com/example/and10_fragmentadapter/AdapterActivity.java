package com.example.and10_fragmentadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.and10_fragmentadapter.listv.ListBaseFragment;
import com.example.and10_fragmentadapter.listv.ListFragment;

public class AdapterActivity extends AppCompatActivity {
Button btn_list1,btn_list2,btn_grid,btn_recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        //패키지를 먼저추가->listv
        //btn-list1을 클릭시 ListFragment가 붙게 코드해보기

        btn_list1=findViewById(R.id.btn_list1);
        btn_list2=findViewById(R.id.btn_list2);
        btn_grid=findViewById(R.id.btn_grid);
        btn_recycler=findViewById(R.id.btn_recycler);

        btn_list1.setOnClickListener(v->{

            getSupportFragmentManager().beginTransaction().replace(R.id.container,new ListFragment()).commit();
        });
        btn_list2.setOnClickListener(v->{
            getSupportFragmentManager().beginTransaction().replace(R.id.container,new ListBaseFragment()).commit();

        });




    }
}