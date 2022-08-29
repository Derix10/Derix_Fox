package com.example.derixfox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EdgeEffect;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private MaterialButton text444;
    private EditText text222, text333;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text444 = findViewById(R.id.text444);
        text333 = findViewById(R.id.text333);
        text222 = findViewById(R.id.text222);


    }

}