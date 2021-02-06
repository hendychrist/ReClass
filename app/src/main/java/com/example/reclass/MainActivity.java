package com.example.reclass;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.support.wearable.view.WatchViewStub;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends WearableActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            mTextView = (TextView) findViewById(R.id.text);

            //Enables Always-on
            setAmbientEnabled();
    }

    public void toastScreenShape(View v) {
        Toast.makeText(this.getApplicationContext(), "Button Clicked" ,Toast.LENGTH_SHORT).show();
//        Log.i("alarm",getResources().getString(
//                getResources().getConfiguration().isScreenRound() ? R.string.roundScreen : R.string.squareScreen));
    }
}