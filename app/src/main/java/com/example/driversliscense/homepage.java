package com.example.driversliscense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homepage extends AppCompatActivity {

    Button createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        createButton = (Button) findViewById(R.id.createButtonId);
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Create();
            }
        });
    }

    public void Create(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}