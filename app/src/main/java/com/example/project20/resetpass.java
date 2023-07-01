package com.example.project20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.util.Patterns;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class resetpass extends AppCompatActivity {
    private EditText emailEditText;
    private EditText newPasswordEditText;
    private EditText confirmNewPasswordEditText;
    private Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resetpass);
        emailEditText = findViewById(R.id.Email);
        newPasswordEditText = findViewById(R.id.Createnewpassword);
        confirmNewPasswordEditText = findViewById(R.id.Confirmnewpassword);
        resetButton = findViewById(R.id.resetButton);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetPassword();
            }
        });
    }

    private void resetPassword() {
        String email = emailEditText.getText().toString();
        String newPassword = newPasswordEditText.getText().toString();
        String confirmNewPassword = confirmNewPasswordEditText.getText().toString();

        Patterns Patterns = null;
        if (email.isEmpty() || newPassword.isEmpty() || confirmNewPassword.isEmpty()) {
            Toast.makeText(resetpass.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            // Email address is not in a valid format
            emailEditText.setError("Invalid email address");
        }else if(!newPassword.equals(confirmNewPassword)) {
            Toast.makeText(resetpass.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
        } else {
            // Perform password reset logic here
            // You can implement your desired password reset functionality
            // For example, you can make an API call to a server to reset the password
            // or update the password in your local database.

            // Display a success message
            Toast.makeText(resetpass.this, "Password reset successful", Toast.LENGTH_SHORT).show();

            // Clear the input fields
            emailEditText.setText("");
            newPasswordEditText.setText("");
            confirmNewPasswordEditText.setText("");
        }
    }
}
