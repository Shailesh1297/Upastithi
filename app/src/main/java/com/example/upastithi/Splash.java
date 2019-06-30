package com.example.upastithi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.*;

public class Splash extends AppCompatActivity {

    ImageView splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);




        splash=(ImageView)findViewById(R.drawable.upastithi);

        Thread thread=new Thread()
        {
            public void run()
            {
                try {
                    Thread.sleep(2000);
                    Intent intent=new Intent(getApplicationContext(),Login.class);
                    startActivity(intent);
                }catch(Exception e)
                {
                    Log.d("Thread",e.toString());
                }
            }
        };
        thread.start();


    }
}
