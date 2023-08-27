package com.archimedes.taskman;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
        preferences = getSharedPreferences("SavedStuff", Context.MODE_PRIVATE);
        editor = preferences.edit();
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        //Not pushed from local repository yet
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
        }




    }
}
