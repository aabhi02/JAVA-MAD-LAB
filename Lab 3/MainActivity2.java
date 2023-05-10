package com.example.lab3;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
//
//    Button signup, login;
//
//    EditText password;
//    String regularExpression="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!])[A-Za-z\\d@$!]{8,}$";
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//        getSupportActionBar().hide();
//
//        signup = (Button) findViewById(R.id.ss_signup);
//        signup.setOnClickListener(this);
//
//        login = (Button) findViewById(R.id.login);
//        login.setOnClickListener(this);
//
//        password = (EditText) findViewById(R.id.pass);
//    }
//
//    public boolean validatePassword(String password) {
//        Pattern pattern= Pattern.compile(regularExpression);
//        Matcher matcher=pattern.matcher(password);
//        return matcher.matches();
//    }
//
//    @Override
//    public void onClick(View v){
//        if (v.equals(signup)){
//            if (validatePassword(String.valueOf(password.getText()))) {
//                Intent l = new Intent(getApplicationContext(), MainActivity3.class);
//                l.putExtra("val", "0");
//                startActivity(l);
//            } else {
//                Toast.makeText(this, "Enter Valid Password", Toast.LENGTH_SHORT).show();
//            }
//        }
//        if (v.equals(login)) {
//            Intent l = new Intent(getApplicationContext(), MainActivity.class);
//            startActivity(l);
//        }
//    }
//}


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import  java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener{

    EditText email,pass;
    Button bsignup;

    String email_str,pass_str;

    String regularExpression="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!])[A-Za-z\\d@$!]{8,}$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        email = findViewById(R.id.userid);
        pass = findViewById(R.id.pass);

        bsignup = findViewById(R.id.ss_signup);
        bsignup.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        email_str = email.getText().toString();

        pass_str = pass.getText().toString();

        if (isPasswordValid(String.valueOf(pass.getText()))) {
            Intent in = new Intent(getApplicationContext(),MainActivity.class);
//
//            in.putExtra("email" , email_str);
//            in.putExtra("pass" , pass_str);

            startActivity(in);
        }
        else {
            Toast.makeText(this, "Please enter a valid password", Toast.LENGTH_SHORT).show();
            pass.setText("");
        }

    }

    private boolean isPasswordValid(String password) {
        // Validate password based on the specified rules.

        // Password should contain uppercase and lowercase letters.
        Pattern pattern= Pattern.compile(regularExpression);
        Matcher matcher=pattern.matcher(password);

        System.out.println(matcher.matches());
        return matcher.matches();
    }
}