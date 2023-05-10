package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    TextView show_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        getSupportActionBar().hide();

        show_txt = (TextView) findViewById(R.id.succ);

        String t = getIntent().getStringExtra("val");
        if (t.equals("1")){
            show_txt.setText("LOGIN SUCCESS");
            System.out.println(t);
        } else {
            show_txt.setText("SIGNUP SUCCESS");
        }
    }
}