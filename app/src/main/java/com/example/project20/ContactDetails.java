package com.example.project20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class ContactDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);
        ImageView contactSymbol1 = findViewById(R.id.contactSymbol1);
        ImageView contactSymbol2 = findViewById(R.id.contactSymbol2);
        ImageView contactSymbol3 = findViewById(R.id.contactSymbol3);
        ImageView contactSymbol4 = findViewById(R.id.contactSymbol4);
        ImageView contactSymbol5 = findViewById(R.id.contactSymbol5);
        ImageView contactSymbol6 = findViewById(R.id.contactSymbol6);
        ImageView contactSymbol7 = findViewById(R.id.contactSymbol7);

        contactSymbol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeCall("123-456-7890");
            }
        });

        contactSymbol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeCall("123-456-7890");
            }
        });

        contactSymbol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeCall("123-456-7890");
            }
        });

        contactSymbol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeCall("123-456-7890");
            }
        });

        contactSymbol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeCall("123-456-7890");
            }
        });

        contactSymbol6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeCall("123-456-7890");
            }
        });

        contactSymbol7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeCall("123-456-7890");
            }
        });
    }

    private void makeCall(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        startActivity(intent);
    }
}

