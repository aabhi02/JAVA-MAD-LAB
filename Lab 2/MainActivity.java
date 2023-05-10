package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0;
    Button btAdd, btSub, btMul, btDiv, btEq, btC, btDot;
    EditText txtRes;


    private void Add(String data){
        String[] op=data.split(Pattern.quote("+"));
        if (op.length==2) {
            double op1=Double.parseDouble(op[0]);
            double op2=Double.parseDouble(op[1]);
            double res=op1+op2;
            txtRes.setText(String.valueOf(res));
        }else {
            displayInvalidMessage("Invalid operation");
        }
    }

    private void Sub(String data){
        String[] op=data.split(Pattern.quote("-"));
        if (op.length==2) {
            double op1=Double.parseDouble(op[0]);
            double op2=Double.parseDouble(op[1]);
            double res=op1-op2;
            txtRes.setText(String.valueOf(res));
        }else {
            displayInvalidMessage("Invalid operation");
        }
    }

    private void Mult(String data){
        String[] op=data.split(Pattern.quote("*"));
        if (op.length==2) {
            double op1=Double.parseDouble(op[0]);
            double op2=Double.parseDouble(op[1]);
            double res=op1*op2;
            txtRes.setText(String.valueOf(res));
        }else {
            displayInvalidMessage("Invalid operation");
        }
    }

    private void Div(String data){
        String[] op=data.split(Pattern.quote("/"));
        if (op.length==2) {
            double op1=Double.parseDouble(op[0]);
            double op2=Double.parseDouble(op[1]);
            double res=op1/op2;
            txtRes.setText(String.valueOf(res));
        }else {
            displayInvalidMessage("Invalid operation");
        }
    }

    private void displayInvalidMessage(String msg){
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        bt0=(Button) findViewById(R.id.bt0);
        bt0.setOnClickListener(this);

        bt1=(Button) findViewById(R.id.bt1);
        bt1.setOnClickListener(this);

        bt2=(Button) findViewById(R.id.bt2);
        bt2.setOnClickListener(this);

        bt3=(Button) findViewById(R.id.bt3);
        bt3.setOnClickListener(this);

        bt4=(Button) findViewById(R.id.bt4);
        bt4.setOnClickListener(this);

        bt5=(Button) findViewById(R.id.bt5);
        bt5.setOnClickListener(this);

        bt6=(Button) findViewById(R.id.bt6);
        bt6.setOnClickListener(this);

        bt7=(Button) findViewById(R.id.bt7);
        bt7.setOnClickListener(this);

        bt8=(Button) findViewById(R.id.bt8);
        bt8.setOnClickListener(this);

        bt9=(Button) findViewById(R.id.bt9);
        bt9.setOnClickListener(this);

        btC=(Button) findViewById(R.id.btc);
        btC.setOnClickListener(this);

        btAdd=(Button) findViewById(R.id.btadd);
        btAdd.setOnClickListener(this);

        btSub=(Button) findViewById(R.id.btsub);
        btSub.setOnClickListener(this);

        btMul=(Button) findViewById(R.id.btmul);
        btMul.setOnClickListener(this);

        btDiv=(Button) findViewById(R.id.btdiv);
        btDiv.setOnClickListener(this);

        btDot=(Button) findViewById(R.id.btdot);
        btDot.setOnClickListener(this);

        btEq=(Button) findViewById(R.id.bteq);
        btEq.setOnClickListener(this);

        txtRes=(EditText) findViewById(R.id.inp);
        txtRes.setText("");
    }

    @Override
    public void onClick(View view) {
        if (view.equals(btC))
            txtRes.setText("");

        if (view.equals(bt0))
            txtRes.append(("0"));

        if (view.equals(bt1))
            txtRes.append(("1"));

        if (view.equals(bt2))
            txtRes.append(("2"));

        if (view.equals(bt3))
            txtRes.append(("3"));

        if (view.equals(bt4))
            txtRes.append(("4"));

        if (view.equals(bt5))
            txtRes.append(("5"));

        if (view.equals(bt6))
            txtRes.append(("6"));

        if (view.equals(bt7))
            txtRes.append(("7"));

        if (view.equals(bt8))
            txtRes.append(("8"));

        if (view.equals(bt9))
            txtRes.append(("9"));

        if (view.equals(btAdd))
            txtRes.append(("+"));

        if (view.equals(btSub))
            txtRes.append(("-"));

        if (view.equals(btMul))
            txtRes.append(("*"));

        if (view.equals(btDiv))
            txtRes.append(("/"));

        if (view.equals(btDot))
            txtRes.append(("."));

        if (view.equals(btEq)){
            try {
                String data=txtRes.getText().toString();
                if (data.contains("+"))
                    Add(data);
                else if (data.contains("-"))
                    Sub(data);
                else if (data.contains("*"))
                    Mult(data);
                else if (data.contains("/"))
                    Div(data);
            }catch (Exception e){
                displayInvalidMessage("Invalid Operation");
            }
        }
    }
}