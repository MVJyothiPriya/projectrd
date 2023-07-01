package com.example.project20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class MainActivity extends AppCompatActivity {
    private Button submitButton;
    private Button cancelButton;
    private TextView login;

    private boolean isSubmitted = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton = findViewById(R.id.submit);
        cancelButton = findViewById(R.id.cancel);
        login = findViewById(R.id.clickheretologin);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isSubmitted) {
                    boolean isValid = validateForm();
                    if (isValid) {
                        // Perform submit action
                        Toast.makeText(MainActivity.this, "Form submitted", Toast.LENGTH_SHORT).show();
                        isSubmitted = true;
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Form already submitted", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isSubmitted) {
                    // Perform cancel action
                    Toast.makeText(MainActivity.this, "Form canceled", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Form already submitted. Cannot cancel.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent( view.getContext(),login.class);
                startActivity(intent);
            }
        });
    }

    private boolean validateForm() {
        EditText fullNameEditText = findViewById(R.id.fullName);
        EditText emailEditText = findViewById(R.id.email);
        EditText wardNoEditText = findViewById(R.id.wardno);
        EditText villageNameEditText = findViewById(R.id.villagename);
        EditText mandalEditText = findViewById(R.id.mandal);
        EditText districtNameEditText = findViewById(R.id.districtname);
        EditText pincodeEditText = findViewById(R.id.pincode);
        EditText contactNoEditText = findViewById(R.id.contactno);
        EditText registrationDateEditText = findViewById(R.id.registrationdate);
        EditText stateEditText = findViewById(R.id.state);
        EditText confirmPasswordEditText = findViewById(R.id.confirmpassword);
        EditText strongPasswordEditText = findViewById(R.id.strongpassword);

        String fullName = fullNameEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        String wardNo = wardNoEditText.getText().toString().trim();
        String villageName = villageNameEditText.getText().toString().trim();
        String mandal = mandalEditText.getText().toString().trim();
        String districtName = districtNameEditText.getText().toString().trim();
        String pincode = pincodeEditText.getText().toString().trim();
        String contactNo = contactNoEditText.getText().toString().trim();
        String registrationDate = registrationDateEditText.getText().toString().trim();
        String state = stateEditText.getText().toString().trim();
        String confirmPassword = confirmPasswordEditText.getText().toString().trim();
        String strongPassword = strongPasswordEditText.getText().toString().trim();

        if (TextUtils.isEmpty(fullName)) {
            fullNameEditText.setError("Please enter your full name");
            fullNameEditText.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(email)) {
            emailEditText.setError("Please enter your email");
            emailEditText.requestFocus();
            return false;
        } else if (!isValidEmail(email)) {
            emailEditText.setError("Please enter a valid email address");
            emailEditText.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(wardNo)) {
            wardNoEditText.setError("Please enter your ward number");
            wardNoEditText.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(villageName)) {
            villageNameEditText.setError("Please enter your village name");
            villageNameEditText.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(mandal)) {
            mandalEditText.setError("Please enter your mandal");
            mandalEditText.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(districtName)) {
            districtNameEditText.setError("Please enter your district name");
            districtNameEditText.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(pincode)) {
            pincodeEditText.setError("Please enter your pincode");
            pincodeEditText.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(contactNo)) {
            contactNoEditText.setError("Please enter your contact number");
            contactNoEditText.requestFocus();
            return false;
        } else if (!isValidContactNo(contactNo)) {
            contactNoEditText.setError("Please enter a valid contact number");
            contactNoEditText.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(registrationDate)) {
            registrationDateEditText.setError("Please enter your registration date");
            registrationDateEditText.requestFocus();
            return false;
        } else if (!isValidDate(registrationDate)) {
            registrationDateEditText.setError("Please enter a valid date (DD-MM-YYYY)");
            registrationDateEditText.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(state)) {
            stateEditText.setError("Please enter your state");
            stateEditText.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(confirmPassword)) {
            confirmPasswordEditText.setError("Please enter your password again");
            confirmPasswordEditText.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(strongPassword)) {
            strongPasswordEditText.setError("Please enter a strong password");
            strongPasswordEditText.requestFocus();
            return false;
        }

        if (!confirmPassword.equals(strongPassword)) {
            confirmPasswordEditText.setError("Passwords do not match");
            confirmPasswordEditText.requestFocus();
            return false;
        }

        return true;
    }

    private boolean isValidEmail(String email) {
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        return email.matches(emailPattern);
    }

    private boolean isValidContactNo(String contactNo) {
        // Customize the validation logic according to your requirements
        // For example, checking if the contact number has 10 digits
        return contactNo.length() == 10;
    }

    private boolean isValidDate(String date) {
        // Customize the validation logic according to your requirements
        // For example, checking if the date is in the format "DD-MM-YYYY"
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}