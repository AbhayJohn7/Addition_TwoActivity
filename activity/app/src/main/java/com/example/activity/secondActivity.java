package com.example.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void onhide(View v)
    {
        finish();
    }
}