package com.archimedes.taskman;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Done extends AppCompatActivity {
    private TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20;

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
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        t8 = findViewById(R.id.t8);
        t9 = findViewById(R.id.t9);
        t10 = findViewById(R.id.t10);
        t11 = findViewById(R.id.t11);
        t12 = findViewById(R.id.t12);
        t13 = findViewById(R.id.t13);
        t14 = findViewById(R.id.t14);
        t15 = findViewById(R.id.t15);
        t16 = findViewById(R.id.t16);
        t17 = findViewById(R.id.t17);
        t18 = findViewById(R.id.t18);
        t19 = findViewById(R.id.t19);
        t20 = findViewById(R.id.t20);

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
        String foN = preferences.getString("DoneTaskName3","");
        String foD = preferences.getString("DoneTaskDet3","");
        String fiN = preferences.getString("DoneTaskName4","");
        String fiD = preferences.getString("DoneTaskDet4","");
        String sixN = preferences.getString("DoneTaskName5","");
        String sixD = preferences.getString("DoneTaskDet5","");
        String sevN = preferences.getString("DoneTaskName6","");
        String sevD = preferences.getString("DoneTaskDet6","");
        String eigN = preferences.getString("DoneTaskName7","");
        String eigD = preferences.getString("DoneTaskDet7","");
        String ninN = preferences.getString("DoneTaskName8","");
        String ninD = preferences.getString("DoneTaskDe8","");
        String tenN = preferences.getString("DoneTaskName9","");
        String tenD = preferences.getString("DoneTaskDet9","");
        String eleN = preferences.getString("DoneTaskName10","");
        String eleD = preferences.getString("DoneTaskDet10","");
        String tweN = preferences.getString("DoneTaskName11","");
        String tweD = preferences.getString("DoneTaskDet11","");
        String thirN = preferences.getString("DoneTaskName12","");
        String thirD = preferences.getString("DoneTaskDet12","");
        String fourtN = preferences.getString("DoneTaskName13","");
        String fourtD = preferences.getString("DoneTaskDet13","");
        String fivtN = preferences.getString("DoneTaskName14","");
        String fivtD = preferences.getString("DoneTaskDet14","");
        String sixtN = preferences.getString("DoneTaskName15","");
        String sixtD = preferences.getString("DoneTaskDet15","");
        String sevtN = preferences.getString("DoneTaskName16","");
        String sevtD = preferences.getString("DoneTaskDet16","");
        String eigthN = preferences.getString("DoneTaskName17","");
        String eigthD = preferences.getString("DoneTaskDet17","");
        String ninetN = preferences.getString("DoneTaskName18","");
        String ninetD = preferences.getString("DoneTaskDet18","");
        String twentyD = preferences.getString("DoneTaskDet19","");
        String twentyN = preferences.getString("DoneTaskName19","");

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
        t4.setText(foN+"\n"+foD);
        if(!t4.equals("")) {
                    t4.setVisibility(View.VISIBLE);
                    t4.setBackground(drawable);
                }t5.setText(fiN+"\n"+fiD);
        if(!t5.equals("")) {
                    t5.setVisibility(View.VISIBLE);
                    t5.setBackground(drawable);
                }t6.setText(sixN+"\n"+sixD);
        if(!t6.equals("")) {
                    t6.setVisibility(View.VISIBLE);
                    t6.setBackground(drawable);
                }t7.setText(sevN+"\n"+sevD);
        if(!t7.equals("")) {
                    t7.setVisibility(View.VISIBLE);
                    t7.setBackground(drawable);
                }t8.setText(eigN+"\n"+eigD);
        if(!t8.equals("")) {
                    t8.setVisibility(View.VISIBLE);
                    t8.setBackground(drawable);
                }t9.setText(ninN+"\n"+ninD);
        if(!t9.equals("")) {
                    t9.setVisibility(View.VISIBLE);
                    t9.setBackground(drawable);
                }t10.setText(tenN+"\n"+tenD);
        if(!t10.equals("")) {
                    t10.setVisibility(View.VISIBLE);
                    t10.setBackground(drawable);
                }t11.setText(eleN+"\n"+eleD);
        if(!t11.equals("")) {
                    t11.setVisibility(View.VISIBLE);
                    t11.setBackground(drawable);
                }t12.setText(tweN+"\n"+tweD);
        if(!t12.equals("")) {
                    t12.setVisibility(View.VISIBLE);
                    t12.setBackground(drawable);
                }t13.setText(thirN+"\n"+thirD);
        if(!t13.equals("")) {
                    t13.setVisibility(View.VISIBLE);
                    t13.setBackground(drawable);
                }t14.setText(fourtN+"\n"+fourtD);
        if(!t14.equals("")) {
                    t14.setVisibility(View.VISIBLE);
                    t14.setBackground(drawable);
                }t15.setText(fivtN+"\n"+fivtD);
        if(!t15.equals("")) {
                    t15.setVisibility(View.VISIBLE);
                    t15.setBackground(drawable);
                }t16.setText(sixtN+"\n"+sixtD);
        if(!t16.equals("")) {
                    t16.setVisibility(View.VISIBLE);
                    t16.setBackground(drawable);
                }t17.setText(sevtN+"\n"+sevtD);
        if(!t17.equals("")) {
                    t17.setVisibility(View.VISIBLE);
                    t17.setBackground(drawable);
                }t18.setText(eigthN+"\n"+eigthD);
        if(!t18.equals("")) {
                    t18.setVisibility(View.VISIBLE);
                    t18.setBackground(drawable);
                }t19.setText(ninetN+"\n"+ninetD);
        if(!t19.equals("")) {
                    t19.setVisibility(View.VISIBLE);
                    t19.setBackground(drawable);
                }t20.setText(twentyN+"\n"+twentyD);
        if(!t20.equals("")) {
                    t20.setVisibility(View.VISIBLE);
                    t20.setBackground(drawable);
                }




    }
    public void openActive(){
        Intent intent=new Intent(this,AddTask.class);
        startActivity(intent);
    }
}
