package com.vogella.android.falsephone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tvMessage = findViewById(R.id.tvMessage);

        // getting phone number passed from Implicit Intents video
        if (getIntent().getData() != null) {
            tvMessage.setText(getIntent().getData().toString());
        }
        else {
            tvMessage.setText("No data received!");
        }

    }
}
