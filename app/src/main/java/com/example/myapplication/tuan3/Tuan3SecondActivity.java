package com.example.myapplication.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan3SecondActivity extends AppCompatActivity {

    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan3_second);

        tv1 = findViewById(R.id.tuan3tv1);

        Intent intent = getIntent();
        int a = Integer.parseInt(intent.getExtras().getString("a"));
        int b = Integer.parseInt(intent.getExtras().getString("b"));
        int c = Integer.parseInt(intent.getExtras().getString("c"));

        float delta = b*b-4*a*c;
        if (delta < 0) {
            tv1.setText("PT vo nghiem");
        }
        else if (delta == 0) {
            tv1.setText("PT co nghiem kep x= "+ (-b)/(2*a));
        }
        else {
            float x1 = (float) ((-b+Math.sqrt(delta))/(2*a));
            float x2 = (float) ((-b-Math.sqrt(delta))/(2*a));
            tv1.setText("PT co 2 nghiem x1 = "+x1+" va x2 = "+x2);
        }
    }
}