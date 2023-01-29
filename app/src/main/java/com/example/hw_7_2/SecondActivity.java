package com.example.hw_7_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        MaterialButton button= findViewById(R.id.btn_pusk);
        String text = getIntent().getStringExtra("result");
        TextView textView = findViewById(R.id.text);
        textView.setText(text);

            }
        }

