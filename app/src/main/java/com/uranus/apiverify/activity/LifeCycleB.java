package com.uranus.apiverify.activity;

import android.app.Activity;
import android.os.Bundle;

import com.uranus.apiverify.R;
import com.uranus.apiverify.utils.Log;

public class LifeCycleB extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(Class.class.getSimpleName());
        setContentView(R.layout.activity_life_cycle);
        Log.d("life cycle");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("life cycle");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("life cycle");
    }

    @Override
    protected void onRestoreInstanceState(Bundle saved){
        super.onRestoreInstanceState(saved);
        Log.d("life cycle");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("life cycle");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.d("life cycle");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("life cycle");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("life cycle");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("life cycle");
    }
}
