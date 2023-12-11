package com.example.project01_hsetalk;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.project01_hsetalk.databinding.ActivityMainBinding;
import com.example.project01_hsetalk.friend.FriendFragment;
import com.example.project01_hsetalk.opentalk.OpenTalkMainFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        ActionBar actionBar=getSupportActionBar();
        actionBar.setElevation(0f);//그림자같은걸 없애겠다
        actionBar.setTitle("친구");
      /*  binding.bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return false;
            }
        });  아래와 같은 내용*/
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new FriendFragment()).commit();
        binding.bottoomNav.setOnItemSelectedListener(item->{
            if(item.getItemId()==R.id.tab1){
                actionBar.setTitle("채팅");

                actionBar.setTitle("친구");
            }else if(item.getItemId()==R.id.tab2){

            }else if(item.getItemId()==R.id.tab3){
                changeFragment(new OpenTalkMainFragment());

                actionBar.setTitle("오픈채팅");
            }else if(item.getItemId()==R.id.tab4){
                actionBar.setTitle("쇼핑");

            }else if(item.getItemId()==R.id.tab5){
                actionBar.setTitle("더보기");

            }
            return true;
        });
    }

    public void changeFragment(OpenTalkMainFragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}