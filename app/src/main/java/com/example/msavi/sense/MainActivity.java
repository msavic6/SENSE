package com.example.msavi.sense;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.graphics.Color;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.graphics.drawable.ColorDrawable;


public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private ActionBar toolbar;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener()
    {
        Fragment fragment;
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragment =  new HomeFragment();
                    loadFragment(fragment);
                    //toolbar.setTitle(R.string.title_home);
                    return true;

                case R.id.navigation_data:
                    fragment = new DataFragment();
                    loadFragment(fragment);
                    //toolbar.setTitle(R.string.title_data);
                    return true;
                case R.id.navigation_settings:
                    fragment = new SettingsFragment();
                    loadFragment(fragment);
                    //toolbar.setTitle(R.string.title_settings);
                    return true;
            }
            return false;
        }
    };

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //toolbar = getSupportActionBar();
        //toolbar.setTitle(R.string.title_home);
        //toolbar.setBackgroundDrawable(new ColorDrawable(0xe93eef));

        //mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
