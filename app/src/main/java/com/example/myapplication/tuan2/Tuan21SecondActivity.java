package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan21SecondActivity extends AppCompatActivity {
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21_second);
        tv1 = findViewById(R.id.Tuan21tv1);

        Intent i1 = getIntent();

        String chuoi1 = i1.getExtras().getString("so1");
        String chuoi2 = i1.getExtras().getString("so2");

        Float so1 = Float.parseFloat(chuoi1);
        Float so2 = Float.parseFloat(chuoi2);

        float tong = so1 + so2;

        tv1.setText(String.valueOf(tong));
    }
}