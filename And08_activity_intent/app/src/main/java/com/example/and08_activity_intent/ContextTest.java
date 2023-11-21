package com.example.and08_activity_intent;

import android.content.Context;
import android.widget.Toast;

public class ContextTest {
    public void method(Context context){
        //Toast.makeText(this, "나는 컨텍스트", Toast.LENGTH_SHORT).show();
        Toast.makeText(context, "나는 컨텍스트", Toast.LENGTH_SHORT).show();

    }

}
