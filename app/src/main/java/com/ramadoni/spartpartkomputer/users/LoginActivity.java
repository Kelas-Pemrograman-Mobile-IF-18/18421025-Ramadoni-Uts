package com.ramadoni.spartpartkomputer.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ornach.nobobutton.NoboButton;
import com.ramadoni.spartpartkomputer.R;
import com.ramadoni.spartpartkomputer.admin.HomeAdminActivity;

public class LoginActivity extends AppCompatActivity {

    Button btnpindah;
    NoboButton btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btnpindah = (Button) findViewById(R.id.btnpindah);
        btnlogin =(NoboButton) findViewById(R.id.loginbtn);


        btnpindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegistrasiActivity2.class);
                startActivity(i);
                finish();
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, HomeAdminActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}