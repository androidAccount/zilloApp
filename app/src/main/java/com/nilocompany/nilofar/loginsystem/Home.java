package com.nilocompany.nilofar.loginsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button btnChangePassword=findViewById(R.id.btnChangePassword);

        Button btnLogOut=findViewById(R.id.btnLogOut);
        btnChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent myIntent=new Intent(getBaseContext(),ChangePassword.class);
            startActivity(myIntent);
        }
        });

        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
            }
        });

    }
}
