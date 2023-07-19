package com.example.alc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("alc app","OnCreate()");
    }
    @Override
    public void onStart()
    {
        super.onStart();
        Log.d("alc app","OnStart()");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        Log.d("alc app","OnStop()");
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d("alc app","OnDestroy()");
    }
    @Override
    public void onResume()
    {
        super.onResume();
        Log.d("alc app","OnResume()");
    }
    @Override
    public void onPause()
    {
        super.onPause();
        Log.d("alc app","OnPause()");
    }
}