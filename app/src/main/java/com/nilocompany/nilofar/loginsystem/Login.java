package com.nilocompany.nilofar.loginsystem;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etUserName=findViewById(R.id.etUsername);
                EditText etPassword= findViewById(R.id.etPassword);
                SharedPreferences preferences=getPreferences(MODE_PRIVATE);
                String userName =preferences.getString("Username","");
                String password=preferences.getString("Password","");

                if(userName.equals(etUserName) && etPassword.equals(password)){
                    Intent myIntent=new Intent(getBaseContext(),Home.class);
                    startActivity(myIntent);
                }
            }
        });
    }
}
