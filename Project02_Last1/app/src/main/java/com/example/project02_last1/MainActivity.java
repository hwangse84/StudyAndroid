package com.example.project02_last1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.project02_last1.common.CommonConn;
import com.example.project02_last1.customer.CustomerFragment;
import com.example.project02_last1.databinding.ActivityMainBinding;

import me.ibrahimsn.lib.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener{
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.bottomBar.setOnItemSelectedListener(this);
        onItemSelect(0);

        binding.bottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {

                Log.d("btm", "onItemSelect:" + i);
                if (i == 0) {
                    getSupportFragmentManager().beginTransaction().replace(binding.container.getId(), new CustomerFragment()).commit();
                }
                return true;
            }
        });

    }

    @Override
    public boolean onItemSelect(int i) {
        return false;
    }
}

