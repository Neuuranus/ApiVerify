package com.uranus.apiverify.libs;

import android.app.Activity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.uranus.apiverify.R;
import com.uranus.apiverify.utils.Log;

public class GsonApi extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson);
        new Thread(()->{
            String jstr = "{\"name\": \"gsonapi\", \"value\": \"20\"}";
            Log.i(new Gson().fromJson(jstr, GsonProp.class).toString());
        }).start();
    }

    class GsonProp{
        String name;
        String value;
        public void setName(String name) {
            this.name = name;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String toString(){
            return "GsonProp{ name=" + name + " value=" + value + " }";
        }
    }
}
