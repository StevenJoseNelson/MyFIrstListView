package com.example.myfirstlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] schools;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listView);

        schools = getResources().getStringArray(R.array.school);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.row, R.id.textView,schools);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String msg = view.toString();
        Toast.makeText(this, msg + i +" was clicked", Toast.LENGTH_SHORT).show();
    }
}