package com.archimedes.taskman;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        EditText password=findViewById(R.id.logpass);

        TextView textView = findViewById(R.id.welmessage);
        textView.setTextColor(Color.BLACK);
        textView.setTypeface(null, Typeface.BOLD);

        password.setTypeface(null, Typeface.BOLD);
        password.setTextColor(Color.BLACK);

        Button forgotPass=findViewById(R.id.forgotPass);


        Button loginBut=findViewById(R.id.loginbutton);
        SharedPreferences preferences = getSharedPreferences("SavedStuff", Context.MODE_PRIVATE);

        // Retrieve the password
        String savedPassword = preferences.getString("password", "");

        loginBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredPassword = password.getText().toString();
                if (enteredPassword.equals(savedPassword)) {
                    openCreateAccount();
                    Toast.makeText(Login.this, "Successful!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(Login.this, "Wrong password!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void openCreateAccount(){
        Intent intent = new Intent(this, AddTask.class);
        startActivity(intent);
    }

    }





