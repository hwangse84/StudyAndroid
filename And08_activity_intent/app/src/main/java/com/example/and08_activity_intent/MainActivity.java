package com.example.and08_activity_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //현재는oncreate메소드에서 대부분 코드를 처리해도 무방
    // 여러화면 또는 spring 연동 시 새로고침등의 처리가 필요하다면
    // 수명주기가 있다는 사실을 인지하고 사용하면됨

    //spring(jsp)모든 개발등에서는 디버깅모드가 제공됨 이것을 활용하면
    // 프로그램의 전체 구조를 빠르게 파악하거나 오류수정이 수월!!
private final String TAG="엑티비티 수명주기";
    EditText edt_phone, edt_find, edt_sms;
    Button  btn_phone, btn_find, btn_sms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        Intent intent= getIntent();// loginActivity에서 보내준 인텐트를 객체로 초기화시킴
        Log.d(TAG, "onCreate: "+intent.getStringExtra("strkey"));//loginActivity에서 넣어둔 이름을 그대로 씀, 대소문자 구별있음
        Log.d(TAG, "onCreate: "+intent.getIntExtra("intkey",-1));
        Log.d(TAG, "onCreate: "+intent.getIntExtra("int'K'ey",-1));
        //dto의 필드부분을 전부 바이트형태읠 통신하기편한 방법을 일자로 세움."loginId","값"...
        LoginDTO dto= (LoginDTO) intent.getSerializableExtra("dtokey");
        Log.d(TAG, "onCreate: "+dto.getLoginId()+" : "+dto.getLoginPw());


        ArrayList<LoginDTO> list= (ArrayList<LoginDTO>) intent.getSerializableExtra("listkey");
        Log.d(TAG, "onCreate: "+list.size());

    }


    //onStart에서 find등의 작업을 수행예정(setContentView라는 메소드가 실행이 잏 ->onStart())
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");

        edt_phone=findViewById(R.id.edt_phone);//Button id
        edt_find=findViewById(R.id.edt_find);
        edt_sms=findViewById(R.id.edt_sms);
        btn_phone=findViewById(R.id.btn_phone);//Edit..id
        btn_find=findViewById(R.id.btn_find);
        btn_sms=findViewById(R.id.btn_sms);

        btn_phone.setOnClickListener(v-> {//전화하기
        Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:/"+edt_phone.getText().toString()) );
            startActivity(intent);

        });

        btn_find.setOnClickListener(this);
        btn_sms.setOnClickListener(this);//implements Vies.onClickListener

    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
        
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }


    //추후에 ActivityLauncher, onActivityResult등으로 결과를 가지고 오는 코드도 진행해야함..(지금 사용안함)
    @Override
    public void onClick(View v) {//검색
        if(v.getId()==R.id.btn_find){
            Intent intent= new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY, edt_find.getText().toString());
            startActivity(intent);

        }else if(v.getId()==R.id.btn_sms){//문자보내기
           Intent intent=new Intent(Intent.ACTION_SENDTO);
           intent.setData(Uri.parse("smsto:"+Uri.encode("010-1234-5678")));//to..누구..
           intent.putExtra("sms_body", edt_sms.getText().toString());//문자내용
           startActivity(intent);
        }
    }
}