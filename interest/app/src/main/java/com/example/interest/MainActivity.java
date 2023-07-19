package com.example.interest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void emi()
    {
        EditText e1 = (EditText) findViewById(R.id.et1);
        EditText e2 = (EditText) findViewById(R.id.et2);
        EditText e3 = (EditText) findViewById(R.id.et3);
        int a,i,y;
        a = Integer.parseInt(e1.getText().toString());
        i = Integer.parseInt(e1.getText().toString());
        y =  Integer.parseInt(e1.getText().toString());
        for(int z=y;z>=1;z++)
        {
            a = (a*i)/100;
        }
        e3.setText("Output"+a);
    }
}