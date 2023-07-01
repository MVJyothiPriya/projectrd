package com.example.project20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

public class complaint1 extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint1);
        textView= (TextView) findViewById(R.id.textView1);
        button = (Button) findViewById(R.id.button);
        textView= (TextView) findViewById(R.id.textView2);
    }
}