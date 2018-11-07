package com.uranus.apiverify.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uranus.apiverify.R;
import com.uranus.apiverify.utils.Log;

public class ActivityApis extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apis);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.activity_life_cycle:
                startActivity(new Intent(this, LifeCycleA.class));
        }
    }

}
