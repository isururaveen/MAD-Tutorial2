package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVMsg2 = findViewById(R.id.TvMsg2);
        txtVMsg2.setText(R.string.Msg2);

        Log.i("Lifecycle", "OnCreate() invoked");
    }
    //onStart
    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Lifecycle","onStart() invoked");
    }

    //onRestart
    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("Lifecycle","onRestart() invoked");
    }

    //onResume
    @Override
    protected void onResume() {
        super.onResume();

        Log.i("Lifecycle","onResume() invoked");
    }


    //onPause
    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Lifecycle","onPause() invoked");
    }

    //onStop
    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Lifecycle","onStop() invoked");
    }


    //onDestroy
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Lifecycle","onDestroy() invoked");
    }

}