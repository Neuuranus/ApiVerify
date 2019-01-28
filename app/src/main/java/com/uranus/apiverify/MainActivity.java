package com.uranus.apiverify;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uranus.apiverify.activity.ActivityApis;
import com.uranus.apiverify.libs.GsonApi;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.activity:
                startActivity(new Intent(this, ActivityApis.class));
            case R.id.gsonapi:
                startActivity(new Intent(this, GsonApi.class));
        }
    }
}
