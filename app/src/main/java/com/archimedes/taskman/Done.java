package com.archimedes.taskman;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Done extends AppCompatActivity {
    private TextView t1,t2,t3;

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.done);
        Drawable drawable = getResources().getDrawable(R.drawable.background);
        Drawable drawable1 = getResources().getDrawable(R.drawable.button_modes);
        Drawable drawable2 = getResources().getDrawable(R.drawable.button_modeees);
        preferences = getSharedPreferences("SavedStuff", Context.MODE_PRIVATE);
        editor = preferences.edit();
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);

        ImageButton done = findViewById(R.id.DoneD);
        ImageButton active = findViewById(R.id.ActiveD);
        active.setBackground(drawable1);
        done.setBackground(drawable2);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Done.this, "You are on the Done Section", Toast.LENGTH_SHORT).show();
            }
        });
        active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActive();
            }
        });

        String firstN = preferences.getString("DoneTaskName0","");
        String firstD = preferences.getString("DoneTaskDet0","");
        String secN = preferences.getString("DoneTaskName1","");
        String secD = preferences.getString("DoneTaskDet1","");
        String thirdN = preferences.getString("DoneTaskName2","");
        String thirdD = preferences.getString("DoneTaskDet2","");

        t1.setText(firstN+"\n"+firstD);
        if(!t1.equals("")) {
            t1.setVisibility(View.VISIBLE);
            t1.setBackground(drawable);
        }t2.setText(secN+"\n"+secD);
        if(!t2.equals("")) {
            t2.setVisibility(View.VISIBLE);
            t2.setBackground(drawable);
        }t3.setText(thirdN+"\n"+thirdD);
        if(!t3.equals("")) {
                    t3.setVisibility(View.VISIBLE);
                    t3.setBackground(drawable);
                }




    }
    public void openActive(){
        Intent intent=new Intent(this,AddTask.class);
        startActivity(intent);
    }
}
