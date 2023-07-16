package com.example.callandsave_lab8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.provider.ContactsContract;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText phnnumber;
    Button btnone,btntwo,btnthree,btnfour,btnfive,btnsix,btnseven,btneight,btnnine,btnzero;
    Button btnhash,btnstar,btncall,btnsave,btndel;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phnnumber=findViewById(R.id.edttxtnum);
        phnnumber.setText("");

        btnone=findViewById(R.id.onebtn);
        btnone.setOnClickListener(this);

        btntwo=findViewById(R.id.twobtn);
        btntwo.setOnClickListener(this);

        btnthree=findViewById(R.id.threebtn);
        btnthree.setOnClickListener(this);

        btnfour=findViewById(R.id.fourbtn);
        btnfour.setOnClickListener(this);

        btnfive=findViewById(R.id.fivebtn);
        btnfive.setOnClickListener(this);

        btnsix=findViewById(R.id.sixbtn);
        btnsix.setOnClickListener(this);

        btnseven=findViewById(R.id.sevenbtn);
        btnseven.setOnClickListener(this);

        btneight=findViewById(R.id.eightbtn);
        btneight.setOnClickListener(this);

        btnnine=findViewById(R.id.ninebtn);
        btnnine.setOnClickListener(this);

        btnzero=findViewById(R.id.zerobtn);
        btnzero.setOnClickListener(this);

        btnhash=findViewById(R.id.hashbtn);
        btnhash.setOnClickListener(this);

        btnstar=findViewById(R.id.starbtn);
        btnstar.setOnClickListener(this);

        btncall=findViewById(R.id.callbtn);
        btncall.setOnClickListener(this);

        btnsave=findViewById(R.id.savebtn);
        btnsave.setOnClickListener(this);

        btndel=findViewById(R.id.delbtn);
        btndel.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.equals(btnone))
            phnnumber.append("1");
        else if(v.equals(btntwo))
            phnnumber.append("2");
        else if(v.equals(btnthree))
            phnnumber.append("3");
        else if(v.equals(btnfour))
            phnnumber.append("4");
        else if(v.equals(btnfive))
            phnnumber.append("5");
        else if(v.equals(btnsix))
            phnnumber.append("6");
        else if(v.equals(btnseven))
            phnnumber.append("7");
        else if(v.equals(btneight))
            phnnumber.append("8");
        else if(v.equals(btnnine))
            phnnumber.append("9");
        else if(v.equals(btnzero))
            phnnumber.append("0");
        else if(v.equals(btnhash))
            phnnumber.append("#");
        else if(v.equals(btnstar))
            phnnumber.append("*");

        else if(v.equals(btndel)){
            String data=phnnumber.getText().toString();
            if(data.length()>0){
                phnnumber.setText(data.substring(0,data.length()-1));
            }else{
                phnnumber.setText("");
            }
            phnnumber.setSelection(phnnumber.getText().toString().length()); //the cursor will move to the end of the number
        }

        else if(v.equals(btncall)){
            String phoneNum=phnnumber.getText().toString();
            Intent intent=new Intent(Intent.ACTION_DIAL);  //dial the number
            //parse the data for the intent
            intent.setData(Uri.parse("tel:"+phoneNum));
            //start activity after parsing the data
            startActivity(intent);
        }

        else if(v.equals(btnsave)){
            String phoneNum=phnnumber.getText().toString();
            Intent intent=new Intent(ContactsContract.Intents.Insert.ACTION);  //to insert the phone number in the other system
            intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);  //define the type of the data --rawcontacts-- insert the number in the raw folder as it has to consider the account also
            //parse the data name
            intent.putExtra(ContactsContract.Intents.Insert.NAME,"Unknown");
            intent.putExtra(ContactsContract.Intents.Insert.PHONE,phoneNum);
            startActivity(intent);
        }

        else{
            phnnumber.setText("");
        }
    }
}