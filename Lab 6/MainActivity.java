package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btParseXML, btParseJSON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        btParseXML=(Button) findViewById(R.id.parseXml);
        btParseXML.setOnClickListener(this);

        btParseJSON=(Button) findViewById(R.id.parseJson);
        btParseJSON.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v.equals(btParseJSON)){
            Intent i = new Intent(this, MainActivity2.class);
            i.putExtra("mode", 1);
            startActivity(i);
        } else if (v.equals(btParseXML)) {
            Intent i = new Intent(this, MainActivity2.class);
            i.putExtra("mode", 2);
            startActivity(i);
        }
    }
}