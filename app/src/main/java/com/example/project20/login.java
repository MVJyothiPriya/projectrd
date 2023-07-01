package com.example.project20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class login extends AppCompatActivity {
    private TextView loginTitle;
    private EditText emailId;
    private EditText password;
    private CheckBox agreeCheckBox;
    private TextView termsText;
    private RadioGroup radioGroup;
    private RadioButton peopleRadioButton;
    private RadioButton officerRadioButton;
    private Button loginButton;
    private TextView forgotPasswordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Find views by their IDs
        loginTitle = findViewById(R.id.Logintitle);
        emailId = findViewById(R.id.EmailId);
        password = findViewById(R.id.Password);
        agreeCheckBox = findViewById(R.id.AgreeCheckBox);
        termsText = findViewById(R.id.TermsText);
        radioGroup = findViewById(R.id.RadioGroup);
        peopleRadioButton = findViewById(R.id.PeopleRadioButton);
        officerRadioButton = findViewById(R.id.OfficerRadioButton);
        loginButton = findViewById(R.id.LoginButton);
        forgotPasswordText = findViewById(R.id.ForgotPasswordText);

        // Set text for the login title
        loginTitle.setText("Login");

        // Get and set hint for the email EditText
        String emailHint = "Email Id";
        emailId.setHint(emailHint);

        // Get and set hint for the password EditText
        String passwordHint = "Password";
        password.setHint(passwordHint);

        // Set text for the terms TextView
        termsText.setText("I agree to all terms and privacy policy");

        // Set click listener for the login button
        loginButton.setOnClickListener(view -> {
            // Perform login logic here
        });

        // Set click listener for the forgot password text
        forgotPasswordText.setOnClickListener(view -> {
            // Perform forgot password logic here
        });
        officerRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( view.getContext(),officerReg.class);
                startActivity(intent);
            }
        });
        forgotPasswordText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( view.getContext(),resetpass.class);
                startActivity(intent);
            }
        });

    }

}