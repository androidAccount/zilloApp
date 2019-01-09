package com.nilocompany.nilofar.loginsystem;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    Button btnRegister;
    EditText etEmail,etUsername,etPassword;
    Activity mAcitvity;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnRegister=findViewById(R.id.btnRegisterUser);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            SharedPreferences preferences=getPreferences(MODE_PRIVATE);
            SharedPreferences.Editor editor=preferences.edit();

            etEmail=(EditText)findViewById(R.id.etEmail);
            etUsername=(EditText)findViewById(R.id.etUsername);
            etPassword=(EditText)findViewById(R.id.etPassword);

            editor.putString("Email", String.valueOf(etEmail.getText()));
            editor.putString("Password", String.valueOf(etPassword.getText()));
            editor.putString("UserName", String.valueOf(etUsername.getText()));
            editor.apply();

            Intent myIntent=new Intent(getBaseContext(),Home.class);
           mAcitvity.startActivity(myIntent);
            }
        });
    }
}
