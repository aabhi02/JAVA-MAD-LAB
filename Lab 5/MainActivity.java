package com.example.lab5;

//Write a program to create an activity with two buttons START and STOP. On pressing of the
//        START button, the activity must start the counter by displaying the numbers from One and
//        the counter must keep on counting until the STOP button is pressed. Display the counter
//        value in a TextView control.


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bstart, bstop;
    TextView ct;
    public boolean r = false;
    public int c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        bstart = (Button) findViewById(R.id.button_start);
        bstart.setOnClickListener(this);
        bstop = (Button) findViewById(R.id.button_stop);
        bstop.setOnClickListener(this);
        ct = (TextView) findViewById(R.id.textView);
    }

    @Override
    public void onClick(View view) {
        if (view.equals(bstart)) {
            counterStart();
        } else if (view.equals(bstop)) {
            counterStop();
        }
    }

    private void counterStop() {
        this.r = false;
        bstart.setSaveEnabled(true);
        bstop.setEnabled(false);
    }

    Handler handler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(@NonNull Message msg) {
            ct.setText(String.valueOf(msg.what));
        }
    };

    private void counterStart() {
        c = 0;
        this.r = true;
        new Mycounter().start();
        bstart.setSaveEnabled(false);
        bstop.setEnabled(true);
    }


    private class Mycounter extends Thread {
        public void run() {
            while (r) {
                c++;
                handler.sendEmptyMessage(c);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}