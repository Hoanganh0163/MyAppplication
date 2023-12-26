package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

public class Tuan22MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);

        lv = findViewById(R.id.tuan22lListView);
        //nguon du lieu
        String[] arr = new String[]{"Mon 1","Mon 2","Mon 3","Mon 4","Mon 5","ssss"};
        //adapter: bo chuyen doi
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr);
        //hien thi
        lv.setAdapter(adapter);
    }
}