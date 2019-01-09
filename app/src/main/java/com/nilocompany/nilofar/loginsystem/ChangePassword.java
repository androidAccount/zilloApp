package com.nilocompany.nilofar.loginsystem;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChangePassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        Button btnChange=findViewById(R.id.btnChange);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etPassword=findViewById(R.id.etPassword);
                EditText etConfirmPassword = findViewById(R.id.etConfirmPassword);
                if(etConfirmPassword.getText().equals(etPassword)){
                    SharedPreferences preferences=getPreferences(MODE_PRIVATE);
                    SharedPreferences.Editor editor=preferences.edit();

                    editor.putString("Password", String.valueOf(etConfirmPassword.getText()));

                    editor.apply();
                }
            }
        });

    }
}
