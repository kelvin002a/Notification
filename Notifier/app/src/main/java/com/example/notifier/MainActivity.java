package com.example.notifier;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button buttonForNotifing ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonForNotifing = findViewById(R.id.ivbuttonFornotifing);
        // allows button to work
        buttonForNotifing.setOnClickListener(new view.onClickListner());
    }
}