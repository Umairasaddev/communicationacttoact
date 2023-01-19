package com.example.communicationacttoact;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextSender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextSender = findViewById(R.id.editTextSender);
    }

    public void buttonSenderPressed(View v)
    {
        Intent senderintent = new Intent(this,SecondActivity.class);
        senderintent .putExtra("KEY",editTextSender.getText().toString());

        startActivity(senderintent);
    }
}



