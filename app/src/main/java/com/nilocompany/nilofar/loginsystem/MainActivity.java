package com.nilocompany.nilofar.loginsystem;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences preferences=getPreferences(MODE_PRIVATE);
        String userName =preferences.getString("UserName","");
        Log.d("UserNAme",userName);
        Intent myIntent;

        if(userName.isEmpty())
           myIntent=new Intent(getBaseContext(),Register.class);
        else
           myIntent=new Intent(getBaseContext(),Login.class);

        startActivity(myIntent);
    }
}
