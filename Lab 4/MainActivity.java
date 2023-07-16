package com.example.lab4;

//Develop an application to set an image as wallpaper. On click of a button, the wallpaper image
//        should start to change randomly every 30 seconds.

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button change_wallpaper;
    boolean running;
    int[] img_arr=new int[]{
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        change_wallpaper = (Button) findViewById(R.id.bt1);
        change_wallpaper.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if  (!running) {
            new Timer().schedule(new time(), 0, 200);
            running=true;
        }
    }

    class time extends TimerTask{
        public void run(){
            try {
                WallpaperManager wpm = WallpaperManager.getInstance(getBaseContext());
                Random random = new Random();
                wpm.setBitmap(BitmapFactory.decodeResource(getResources(), img_arr[random.nextInt(5)]));
            } catch (IOException e) {}
        }
    }
}
