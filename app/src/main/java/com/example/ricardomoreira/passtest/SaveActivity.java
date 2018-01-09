package com.example.ricardomoreira.passtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SaveActivity extends Activity {

    TextView textviewMyPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        Intent intent = getIntent();
        String password = intent.getStringExtra("password");













    }
}
