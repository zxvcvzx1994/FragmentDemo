package com.example.kh.myapplication;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // excuteFragment(new Fragment_BOt());
    }
    public void process(View view){


        switch(view.getId()){
            case R.id.btn:

                excuteFragment(  new Fragment_BOt());
                break;
            case R.id.btn1:

                excuteFragment(new Fragment_Top());
                break;


        }

    }
    public void excuteFragment(Fragment fragment){

        transaction = getFragmentManager().beginTransaction().replace(R.id.container,fragment);
        transaction.commit();
    }
}
