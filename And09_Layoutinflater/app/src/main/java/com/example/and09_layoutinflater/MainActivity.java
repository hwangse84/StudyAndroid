package com.example.and09_layoutinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn_inflate;
LinearLayout ll_layout;
RelativeLayout rl_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_inflate=findViewById(R.id.btn_inflate);
        ll_layout=findViewById(R.id.ll_layout);
        rl_layout=findViewById(R.id.rl_layout);

        LayoutInflater inflater=getLayoutInflater();
        //LayoutInflater inflater1=getSystemService(LayoutInflater.class);위에꺼 쓰면됨

        btn_inflate.setOnClickListener(v->{
            //뷰를 부모에게 죽시 연결할지 여부를 결정함..
            //프레그먼트는 따로 자바코드를 가지고 있고, 붙는 처리는 멘소드로 따로 진행함(바로 붙이면 오류발생)
            View viewsub1=inflater.inflate(R.layout.sub_layout1,ll_layout,true);
            Button btn_sub1=viewsub1.findViewById(R.id.btn_sub1);


            inflater.inflate(R.layout.sub_layout2,rl_layout,true);

        });

    }
}