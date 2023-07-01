package com.example.project20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class officerReg extends AppCompatActivity {
    private EditText fullNameEditText;
    private EditText emailEditText;
    private EditText strongPasswordEditText;
    private EditText confirmPasswordEditText;
    private EditText contactNoEditText;
    private EditText dateOfJoiningEditText;
    private EditText mandalEditText;
    private EditText districtEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officer_reg);
        fullNameEditText = findViewById(R.id.FullName);
        emailEditText = findViewById(R.id.Email);
        strongPasswordEditText = findViewById(R.id.StrongPassword);
        confirmPasswordEditText = findViewById(R.id.ConfirmPassword);
        contactNoEditText = findViewById(R.id.ContactNo);
        dateOfJoiningEditText = findViewById(R.id.DateOfJoining);
        mandalEditText = findViewById(R.id.Mandal);
        districtEditText = findViewById(R.id.District);
        submitButton = findViewById(R.id.submit);

        submitButton.setOnClickListener(view -> {
            if (isEmailValid(emailEditText.getText().toString()) &&
                    isPhoneNumberValid(contactNoEditText.getText().toString()) &&
                    isDateValid(dateOfJoiningEditText.getText().toString()) &&
                    isPasswordMatch()) {
                // Valid input, proceed with registration
                Toast.makeText(officerReg.this, "Registration successful!", Toast.LENGTH_SHORT).show();
            } else {
                // Invalid input, display error message
                Toast.makeText(officerReg.this, "Invalid input. Please check your details.", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private boolean isEmailValid(String email) {
        if (email.isEmpty()) {
            emailEditText.setError("Email cannot be empty");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            emailEditText.setError("Invalid email address");
            return false;
        }
        return true;
    }

    private boolean isPhoneNumberValid(String ContactNo) {
        if (ContactNo.isEmpty() || ContactNo.length()!=10) {
            contactNoEditText.setError("Contact number is invalid");
            return false;
        } else if (!Patterns.PHONE.matcher(ContactNo).matches()) {
            contactNoEditText.setError("Invalid phone number");
            return false;
        }
        return true;
    }

    private boolean isDateValid(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            Date parsedDate = dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            dateOfJoiningEditText.setError("Invalid date format");
            return false;
        }
    }

    private boolean isPasswordMatch() {
        String password = strongPasswordEditText.getText().toString();
        String confirmPassword = confirmPasswordEditText.getText().toString();
        if (password.equals(confirmPassword)) {
            return true;
        } else {
            strongPasswordEditText.setError("Passwords do not match");
            confirmPasswordEditText.setError("Passwords do not match");
            return false;
        }
    }
}














