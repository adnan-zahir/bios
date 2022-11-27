package com.hafizh.bios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity implements View.OnClickListener {
    ImageButton signup, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        signup = (ImageButton) findViewById(R.id.imageButton2);
        signup.setOnClickListener(this);
        login = (ImageButton) findViewById(R.id.button);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageButton2:
                Intent intent1 = new Intent(LoginPage.this, SignUpPage.class);
                startActivity(intent1);
                break;
            case R.id.button:
                Intent intent2 = new Intent(LoginPage.this, ProfileInclass.class);
                startActivity(intent2);
        }
    }
}