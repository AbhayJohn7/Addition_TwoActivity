package com.example.valuepass;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onnext(View v)
    {
        Intent obj;
        obj= new Intent("act.secv");
        EditText e= (EditText)findViewByID(R.id.et1);
        obj.putExtra("name",e.getText().toString());
        startActivity(obj);
    }
}