package com.uranus.apiverify.activity;

import android.app.Activity;
import android.os.Bundle;

import com.uranus.apiverify.R;
import com.uranus.apiverify.utils.Log;

public class LifeCycleA extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
    }

    @Override
    protected void onRestart(){
        super.onRestart();
    }

    @Override
    protected void onStart(){
        super.onStart();
    }

    @Override
    protected void onRestoreInstanceState(Bundle saved){
        super.onRestoreInstanceState(saved);
    }

    @Override
    protected void onResume(){
        super.onResume();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
    }
    @Override
    protected void onPause(){
        super.onPause();
    }
    @Override
    protected void onStop(){
        super.onStop();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
    }
}
