package com.cybermoosemedia.radioapp.activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cybermoosemedia.radioapp.R;
import com.cybermoosemedia.radioapp.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Code to load fragment
        FragmentManager fm = getSupportFragmentManager();//get SupportFragmentManger for compatibility
        MainFragment mainFragment = (MainFragment)fm.findFragmentById(R.id.container_main); //cast as MainFragment

        //Null check in case this is first call
        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance("blah", "ha");
            fm.beginTransaction()
                    .add(R.id.container_main, mainFragment)
                    .commit();
        }
    }


}
