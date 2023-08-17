package com.archimedes.taskman;

import android.content.Context;
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
            } else {
                    // Account creation failed
                    Toast.makeText(CreateAccount.this, "Account creation failed: ",Toast.LENGTH_SHORT).show();
                }
        });
    }
    public boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$"; // Regular expression for email validation
        return email.matches(regex);
    }
    public static boolean isPassword(String password) {

        if (password.length() < 8) {
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        return password.matches(".*\\d.*");
    }

}
