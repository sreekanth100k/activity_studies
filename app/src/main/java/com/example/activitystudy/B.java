package com.example.activitystudy;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

public class B extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        Log.d("CallBack Method", "B onCreate()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("CallBack Method", "B onRestart()");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("CallBack Method", "B onStart()");

    }


    @Override
    protected void onResume() {
        super.onResume();

        Log.d("CallBack Method", "B onResume()");

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("CallBack Method", "B onDestroy()");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();


        this.finish();
    }
}
