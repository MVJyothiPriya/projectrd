package com.example.project20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
package com.example.officerdesk;
import com.example.officerdesk.ComplaintActivity;
import com.example.officerdesk.ContactActivity;
import com.example.officerdesk.FeedbackActivity;

public class officerdesk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officerdesk);
    }
    public void openComplaintActivity(View view) {
        Intent intent = new Intent(this, ComplaintActivity.class);
        startActivity(intent);
    }

    public void openFeedbackActivity(View view) {
        Intent intent = new Intent(this, FeedbackActivity.class);
        startActivity(intent);
    }

    public void openContactActivity(View view) {
        Intent intent = new Intent(this, ContactActivity.class);
        startActivity(intent);
    }
}




