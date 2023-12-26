package com.example.myapplication.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.R;

public class Lab3MainActivity extends AppCompatActivity {

    Button btn1;
    EditText txt1, txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_main);

        btn1 = findViewById(R.id.lab3btn1);
        txt1 = findViewById(R.id.lab3txt1);
        txt2 = findViewById(R.id.lab3txt2);

    }

    public void dangNhap(View view) {


        if (txt1.getText().toString().equals("admin")&&txt2.getText().toString().equals("admin")) {
            Toast.makeText(getApplicationContext(),"Dang nhap thanh cong",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(),"Dang nhap that bai",Toast.LENGTH_LONG).show();
        }
    }

}