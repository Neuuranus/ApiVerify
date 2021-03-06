package com.uranus.apiverify.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uranus.apiverify.R;
import com.uranus.apiverify.utils.Log;

public class LifeCycleA extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.i("life cycle");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("life cycle");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("life cycle");
    }

    @Override
    protected void onRestoreInstanceState(Bundle saved){
        super.onRestoreInstanceState(saved);
        Log.i("life cycle");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("life cycle");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i("life cycle");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("life cycle");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("life cycle");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("life cycle");
    }

    public void onClick(View view) {
        startActivity(new Intent(this, LifeCycleB.class));
    }
}
