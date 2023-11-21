package com.example.and08_activity_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edt_id, edt_pw;
    Button btn_login;
    TextView tv_join;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edt_id = findViewById(R.id.edt_id);
        edt_id = findViewById(R.id.edt_pw);
        btn_login = findViewById(R.id.btn_login);
        tv_join=findViewById(R.id.tv_join);


        //ediText에 있는 글자를 가져오는 메소드 : editText()메소드임
        //id가 admin 비밀번호가 admin1234인 경우 로그가 성공이라고 찍히고 그 외에는 실패!가 찍히게 해보기
        //Toast.makeText(this, "나는 컨텍스트", Toast.LENGTH_SHORT).show();
        //new ContextTest().method(this);

        btn_login.setOnClickListener(v -> {
        //intent초기화 시 필요한 정보 : 화면 전환시-> 1.현재 앱의 상태(현재화면등...)
            //       2. 실행이 되어야 할 화면 (activity)의 클래스 위치
            Log.d("로그인", edt_id.getText() + "");
            Log.d("로그인", edt_pw.getText() + "");

            if ("admin".equals(edt_id.getText() + "") && "admin1234".equals(edt_pw.getText() + "")) {
                Log.d("로그인성공", edt_id.getText() + " ");
                Intent intent=new Intent(this,MainActivity.class);
                startActivity(intent);
            } else {
                Log.d("로그인실패", edt_pw.getText() + " ");
            }
        });
        tv_join.setOnClickListener(v->{
     Intent intent= new Intent(this, JoinActivity.class);
     startActivity(intent);

        });
    }



}