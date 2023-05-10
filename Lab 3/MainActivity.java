package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button login, signup;

    EditText username, password;

    String user_id  = "abhi@123";
    String pass = "Abhi$777";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);

        signup = (Button) findViewById(R.id.signup);
        signup.setOnClickListener(this);

        username = (EditText) findViewById(R.id.userid);
        password = (EditText) findViewById(R.id.pass);
    }

    public boolean validatePassword(String password, String user) {
        if (password.equals(pass) && user.equals(user_id)){
            return true;
        }
        return false;
    }

    @Override
    public void onClick(View view) {
        if (view.equals(login)) {
            if (validatePassword(String.valueOf(password.getText()), String.valueOf(username.getText()))) {
                Intent l = new Intent(getApplicationContext(), MainActivity3.class);
                l.putExtra("val", "1");
                startActivity(l);
            } else {
                Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
            }
        }

        if (view.equals(signup)){
            Intent s = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(s);
        }
    }

}