package com.example.and08_activity_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    //현재는oncreate메소드에서 대부분 코드를 처리해도 무방
    // 여러화면 또는 spring 연동 시 새로고침등의 처리가 필요하다면
    // 수명주기가 있다는 사실을 인지하고 사용하면됨

    //spring(jsp)모든 개발등에서는 디버깅모드가 제공됨 이것을 활용하면
    // 프로그램의 전체 구조를 빠르게 파악하거나 오류수정이 수월!!
private final String TAG="엑티비티 수명주기";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
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
}