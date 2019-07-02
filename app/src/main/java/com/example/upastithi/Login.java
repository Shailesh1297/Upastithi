package com.example.upastithi;


import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;


public class Login extends AppCompatActivity {


    TabLayout tabLayout;

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        viewPager=(ViewPager)findViewById(R.id.viewpager);

        PagerAdapter pagerAdapter=new PagerAdapter(getBaseContext(),getSupportFragmentManager(),2);
        viewPager.setAdapter(pagerAdapter);

        tabLayout=(TabLayout)findViewById(R.id.simpleTabLayout);
        tabLayout.setupWithViewPager(viewPager);



    }
}
