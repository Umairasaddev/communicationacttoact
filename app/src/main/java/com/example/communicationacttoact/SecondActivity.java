package com.example.communicationacttoact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView receiverTextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        receiverTextview = findViewById(R.id.receiverTextview);

        Intent receiverIntent = getIntent();
        String receivedValue = receiverIntent.getStringExtra("KEY");
        receiverTextview.setText(receivedValue);
    }
}