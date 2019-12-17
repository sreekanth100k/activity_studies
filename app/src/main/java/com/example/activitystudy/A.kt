package com.example.activitystudy

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/**
 * Gives the list of call back methods
 * Can be used to understand the call back lifecycle
 * that happens when there is a transition between the activities
 * back and forth
 */

class A:AppCompatActivity(){

    private lateinit var mNextBtn: Button;

    /*
      Called when the activity is first created.
      This is where you should do all of your normal static set up: create views, bind data to lists, etc.
      This method also provides you with a Bundle containing the activity's previously frozen state, if there was one.
      Always followed by onStart().
     **/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        Log.d("CallBack Method", "A onCreate()")

        mNextBtn = findViewById(R.id.id_goto_next)

        mNextBtn.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, B::class.java)

            startActivity(intent)

//          overridePendingTransition(R.layout.slide_in, R.layout.slide_out);


        })
    }

    /*
        Called when the activity is becoming visible to the user.
        Followed by onResume() if the activity comes to the foreground.
     */
    override fun onStart() {
        super.onStart()

        Log.d("CallBack Method", "A onStart()")
    }

    /*
        Called when the activity will start interacting with the user.
        At this point your activity is at the top of the activity stack, with user input going to it.
        Always followed by onPause().
    */
    override fun onResume() {
        super.onResume()

        Log.d("CallBack Method", "A onResume()")

    }

    /*
        Called as part of the activity lifecycle when an activity is going into the background, but has not (yet) been killed.
        The counterpart to onResume().
        When activity B is launched in front of activity A, this callback will be invoked on A.
        B will not be created until A's onPause() returns, so be sure to not do anything lengthy here.
     */

    override fun onPause() {
        super.onPause()

        Log.d("CallBack Method", "A onPause()")

    }


    /*  Called when you are no longer visible to the user.
        You will next receive either onRestart(), onDestroy(), or nothing, depending on later user activity.
        Note that this method may never be called,
        in low memory situations where the system does not have enough memory to keep your activity's process running after its onPause() method is called.
     */
    override fun onStop() {
        super.onStop()


        Log.d("CallBack Method", "A onStop()")

    }


    /**
     * Called after your activity has been stopped, prior to it being started again.
     * Always followed by onStart()
     */
    override fun onRestart() {
        super.onRestart()

        Log.d("CallBack Method", "A onRestart()")

    }


    /*
      The final call you receive before your activity is destroyed.
      This can happen either because the activity is finishing (someone called finish() on it, or because the system is temporarily destroying this instance of the activity to save space.
      You can distinguish between> these two scenarios with the isFinishing() method.
     */

    override fun onDestroy() {
        super.onDestroy()

        Log.d("CallBack Method", "A onDestroy()")

    }
}