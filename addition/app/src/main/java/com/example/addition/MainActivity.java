package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void math(View v)
    {
        EditText e1,e2,e3;
        e1=(EditText) findViewById(R.id.et1);
        e2=(EditText) findViewById(R.id.et2);
        int num= Integer.parseInt(e1.getText().toString());
        int num2= Integer.parseInt(e2.getText().toString());
        int sum = num+num2;
        e3.setText(sum);
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

    }
}