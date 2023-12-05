package com.example.and10_fragmentadapter.recycler;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.and10_fragmentadapter.MelonFragment;
import com.example.and10_fragmentadapter.R;

public class RecyclerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);


        getSupportFragmentManager().beginTransaction().replace(R.id.container , new MelonFragment()).commit();
    }
}
