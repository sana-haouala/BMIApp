package com.examples.myapplication.bmiapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activitytwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);

    }
    public void calcbmi(View view){

        double height=0;
        double weight=0;
        double bmi=0;
        String msg="";

        EditText myWeight= (EditText)findViewById(R.id.myWeight);
        EditText myHeight=(EditText)findViewById(R.id.myHeight);
        TextView myBMI=(TextView)findViewById(R.id.mybmi);
        TextView myResult=(TextView)findViewById(R.id.myResult);
        Button b2=(Button)findViewById(R.id.button2);

        weight=Double.parseDouble(myWeight.getText().toString());
        height=Double.parseDouble(myHeight.getText().toString());
        bmi=height * height;
        bmi=weight/bmi;
        myBMI.setText(String.valueOf(bmi));

        if(bmi<18.5){
            msg="UnderWeight";
        }
        else if(bmi>18.5 && bmi<25){
            msg="Normal";
        }
        else if(bmi>25){
            msg="OverWeight";
        }
        myResult.setText(msg);

    }

}
