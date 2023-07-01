package com.example.project20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class userfeedback extends AppCompatActivity {
    private RadioGroup radioGroup;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userfeedback);
        radioGroup = findViewById(R.id.radioGroup);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();

                if (selectedRadioButtonId != -1) {
                    RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
                    String selectedRadioButtonText = selectedRadioButton.getText().toString();

                    // Handle the selected radio button
                    Toast.makeText(userfeedback.this, "Selected: " + selectedRadioButtonText, Toast.LENGTH_SHORT).show();
                } else {
                    // No radio button selected
                    Toast.makeText(userfeedback.this, "Please select an option", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}