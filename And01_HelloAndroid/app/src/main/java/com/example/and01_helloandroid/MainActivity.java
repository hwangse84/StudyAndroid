package com.example.and01_helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //setContentView메소드 실행후 -> activity_main.xml에 내부에 있는 모든 위젯이 메모리에 로딩됨(id가 부여되어여만 찾아서 사용가능)
        //Android는 코드영역과 Gradle(빌드)가 나눠져 있어 가끔 sync를 해줘야함
        //따라서 코드가 오류가 없는데 빨간줄 나오면 상단 Gradle sync로 연결해줘야함
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
//        btn.setOnClickListener(new view v);
//        Toast.makeText(this, "토스트창?", Toast.LENGTH_SHORT).show();
//    }
//});
//        btn.setOnClickListener(v)->{
//            Toast.makeText(this, "람다 토스트", Toast.LENGTH_SHORT).show();
//
//        });
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "람다 토스트", Toast.LENGTH_SHORT).show();
    }
}

