package com.example.activitystudy;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        Log.d("CallBack Method", "SecondActivity onCreate()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("CallBack Method", "SecondActivity onRestart()");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("CallBack Method", "SecondActivity onStart()");

    }


    @Override
    protected void onResume() {
        super.onResume();

        Log.d("CallBack Method", "SecondActivity onResume()");

    }




    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("CallBack Method", "SecondActivity onDestroy()");

    }
}
