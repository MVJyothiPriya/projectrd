package com.example.project20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class page4 extends AppCompatActivity {
    TextView textView;
    RadioButton radioButton;
    Button button;
    Button button2;

    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        textView=(TextView) findViewById(R.id.textView);
        textView=(TextView) findViewById(R.id.textView2);
        textView=(TextView) findViewById(R.id.textView3);
        textView=(TextView) findViewById(R.id.textView5);
        textView=(TextView) findViewById(R.id.textView6);
        textView=(TextView) findViewById(R.id.textView7);
        textView=(TextView) findViewById(R.id.textView8);
        textView=(TextView) findViewById(R.id.textView9);
        textView=(TextView) findViewById(R.id.textView10);
        textView=(TextView) findViewById(R.id.textView11);
        textView=(TextView) findViewById(R.id.textView4);
        radioButton=(RadioButton) findViewById(R.id.radioButton);
        radioButton=(RadioButton) findViewById(R.id.radioButton2);
        radioButton=(RadioButton) findViewById(R.id.radioButton3);
        radioButton=(RadioButton) findViewById(R.id.radioButton4);
        radioButton=(RadioButton) findViewById(R.id.radioButton5);
        radioButton=(RadioButton) findViewById(R.id.radioButton6);
        radioButton=(RadioButton) findViewById(R.id.radioButton7);
        radioButton=(RadioButton) findViewById(R.id.radioButton8);
        radioButton=(RadioButton) findViewById(R.id.radioButton9);
        radioButton=(RadioButton) findViewById(R.id.radioButton10);
        radioButton=(RadioButton) findViewById(R.id.radioButton11);
        radioButton=(RadioButton) findViewById(R.id.radioButton12);
        radioButton=(RadioButton) findViewById(R.id.radioButton13);
        radioButton=(RadioButton) findViewById(R.id.radioButton14);
        radioButton=(RadioButton) findViewById(R.id.radioButton15);
        radioButton=(RadioButton) findViewById(R.id.radioButton16);
        radioButton=(RadioButton) findViewById(R.id.radioButton17);
        radioButton=(RadioButton) findViewById(R.id.radioButton18);
        button=(Button) findViewById(R.id.button);
        button=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( view.getContext(),page2.class);
                startActivity(intent);
            }
        });
    }
}

