package com.example.and10_fragmentadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.and10_fragmentadapter.Exam.ExamAdapter;

import java.util.zip.Inflater;

public class ExamActivity extends AppCompatActivity {
RecyclerView recv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        recv=findViewById(R.id.recv);
            //view:보여주는 기능만 구현,Adapter : 모든 모양이나 개수들의 항목설정
            //LayoutManager : 방향성

        ExamAdapter adapter=new ExamAdapter(getLayoutInflater());
        recv.setAdapter(adapter);
        recv.setLayoutManager(new LinearLayoutManager(this));


    }
}