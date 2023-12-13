package com.example.project02_last1.member;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.example.project02_last1.R;
import com.example.project02_last1.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //error...
        Glide.with(this).load("https://mblogthumb-phinf.pstatic.net/MjAxNzA1MTFfMTUg/MDAxNDk0NTA0ODI3Mzgx.9AUznRn-7S2MqJN5g8jCkqCUP4ztwJgWjVACf9NnxGQg.2IQQqTKeQGxiOjnrJP3emV6bG5mny3bR3s4TZ1cruNsg.GIF.h0pe_goodluck/2250188221821_NTP304251.gif?type=w800")
                .error(R.drawable.ic_launcher_foreground)//에러발생..
                .fallback(R.drawable.ic_launcher_background)//null 을 넘김
                .into(binding.imgvLogo);
    
    
    }
}