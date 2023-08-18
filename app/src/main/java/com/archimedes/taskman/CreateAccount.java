package com.archimedes.taskman;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class CreateAccount extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // FirebaseApp.initializeApp(this);

        setContentView(R.layout.createaccount);


        emailEditText = findViewById(R.id.editTextEmail);
        passwordEditText = findViewById(R.id.editTextPassword);
        Button createAccountButton = findViewById(R.id.buttonCreateAccount);

        createAccountButton.setOnClickListener(v -> {
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            if (isValidEmail(email) && (isPassword(password)) ){
                SharedPreferences preferences= getSharedPreferences("SavedStuff", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("password", password);
                editor.putString("email", email);
                editor.apply();
                Toast.makeText(CreateAccount.this, "Account created!",
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, AddTask.class);
                startActivity(intent);
            } else {
                    // Account creation failed
                    Toast.makeText(CreateAccount.this, "Account creation failed: ",Toast.LENGTH_SHORT).show();
                }
        });
    }
    public boolean isValidEmail(String email) {
        if (email == null) {
            Toast.makeText(this, "Where's the email?", Toast.LENGTH_SHORT).show();
            return false;
        }
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$"; // Regular expression for email validation
        if(!email.matches(regex)){
            Toast.makeText(this, "That's not an email address", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }
    public boolean isPassword(String password) {

        if (password.length() < 8) {
            Toast.makeText(this, "Password should be longer than 8 chars!", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            Toast.makeText(this, "Add some capital letters and numbers", Toast.LENGTH_SHORT).show();
            return false;
        }
        return password.matches(".*\\d.*");
    }

}
