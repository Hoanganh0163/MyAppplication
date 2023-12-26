package com.example.myapplication.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class Tuan31MainActivity extends AppCompatActivity {

    EditText txt1, txt2, txt3;
    Button btn1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan31_main);

        txt1 = findViewById(R.id.tuan3txt1);
        txt2 = findViewById(R.id.tuan3txt2);
        txt3 = findViewById(R.id.tuan3txt3);
        btn1 = findViewById(R.id.tuan3btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tuan31MainActivity.this,Tuan3SecondActivity.class);
                intent.putExtra("a",txt1.getText().toString());
                intent.putExtra("b",txt2.getText().toString());
                intent.putExtra("c",txt3.getText().toString());
                startActivity(intent);
            }
        });
    }
}