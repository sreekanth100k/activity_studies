package com.example.activitystudy

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity:AppCompatActivity(){

    private lateinit var mNextBtn: Button;

    override fun onStart() {
        super.onStart()

        Log.d("CallBack Method", "MainActivity onStart()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        Log.d("CallBack Method", "MainActivity onCreate()")

        mNextBtn = findViewById(R.id.id_goto_next)

        mNextBtn.setOnClickListener(View.OnClickListener {

            var activity:SecondActivity = SecondActivity()

            val intent = Intent(this, SecondActivity::class.java)

            startActivity(intent)


        })

    }

    override fun onPause() {
        super.onPause()

        Log.d("CallBack Method", "MainActivity onPause()")

    }

    override fun onStop() {
        super.onStop()


        Log.d("CallBack Method", "MainActivity onStop()")

    }





    override fun onRestart() {
        super.onRestart()

        Log.d("CallBack Method", "MainActivity onRestart()")

    }

    override fun onResume() {
        super.onResume()

        Log.d("CallBack Method", "MainActivity onResume()")

    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("CallBack Method", "MainActivity onDestroy()")

    }
}