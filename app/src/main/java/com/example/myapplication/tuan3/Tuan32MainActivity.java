package com.example.myapplication.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;
import java.util.ArrayList;

public class Tuan32MainActivity extends AppCompatActivity {
    ListView lv;
    T32Adapter adapter;
    ArrayList<T32Contact> ls = new ArrayList<>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan31_main);
        lv=findViewById(R.id.tuan32lv);

        ls.add(new T32Contact("Chu Kim Hoang Anh", "22", R.drawable.apple));
        ls.add(new T32Contact("Nguyen Van A", "20", R.drawable.firefox));
        ls.add(new T32Contact("Tran Van B", "29", R.drawable.facebook));
        ls.add(new T32Contact("Luong Van C", "22", R.drawable.dell));
        ls.add(new T32Contact("Le Van D", "99", R.drawable.hancock));
        ls.add(new T32Contact("Doan Van E", "23", R.drawable.border));

        adapter = new T32Adapter(ls, this);
        lv.setAdapter(adapter);
    }
}