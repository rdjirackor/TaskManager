package com.archimedes.taskman;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AddTask extends AppCompatActivity {
    private static final int REQUEST_CODE_ADD_TODO = 1;
    private TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12,tx13,tx14,tx15,tx16,tx17,tx18,tx19,tx20;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.add_task);
            preferences = getSharedPreferences("SavedStuff", Context.MODE_PRIVATE);
            editor = preferences.edit();
            Drawable drawable = getResources().getDrawable(R.drawable.background);
            FloatingActionButton open = findViewById(R.id.floatingActionButton);
            open.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openEditTask();
                }
            });







            tx1 = findViewById(R.id.t1);
            tx2 = findViewById(R.id.t2);
            tx3 = findViewById(R.id.t3);
            tx4 = findViewById(R.id.t4);
            tx5 = findViewById(R.id.t5);
            tx6 = findViewById(R.id.t6);
            tx7 = findViewById(R.id.t7);
            tx8 = findViewById(R.id.t8);
            tx9 = findViewById(R.id.t9);
            tx10 = findViewById(R.id.t10);
            tx11 = findViewById(R.id.t11);
            tx12 = findViewById(R.id.t12);
            tx13 = findViewById(R.id.t13);
            tx14 = findViewById(R.id.t14);
            tx15= findViewById(R.id.t15);
            tx16= findViewById(R.id.t16);
            tx17= findViewById(R.id.t17);
            tx18= findViewById(R.id.t18);
            tx19= findViewById(R.id.t19);
            tx20= findViewById(R.id.t20);

            tx1.setTextSize(20);
            tx2.setTextSize(20);
            tx3.setTextSize(20);
            tx4.setTextSize(20);
            tx5.setTextSize(20);
            tx7.setTextSize(20);
            tx8.setTextSize(20);
            tx9.setTextSize(20);
            tx10.setTextSize(20);
            tx11.setTextSize(20);
            tx12.setTextSize(20);
            tx13.setTextSize(20);
            tx14.setTextSize(20);
            tx15.setTextSize(20);
            tx16.setTextSize(20);
            tx17.setTextSize(20);
            tx18.setTextSize(20);
            tx19.setTextSize(20);
            tx20.setTextSize(20);
            tx1.setTextColor(Color.BLACK);
            tx2.setTextColor(Color.BLACK);
            tx3.setTextColor(Color.BLACK);
            tx4.setTextColor(Color.BLACK);
            tx5.setTextColor(Color.BLACK);
            tx6.setTextColor(Color.BLACK);
            tx7.setTextColor(Color.BLACK);
            tx8.setTextColor(Color.BLACK);
            tx9.setTextColor(Color.BLACK);
            tx10.setTextColor(Color.BLACK);
            tx11.setTextColor(Color.BLACK);
            tx12.setTextColor(Color.BLACK);
            tx13.setTextColor(Color.BLACK);
            tx14.setTextColor(Color.BLACK);
            tx15.setTextColor(Color.BLACK);
            tx16.setTextColor(Color.BLACK);
            tx17.setTextColor(Color.BLACK);
            tx18.setTextColor(Color.BLACK);
            tx19.setTextColor(Color.BLACK);
            tx20.setTextColor(Color.BLACK);
            tx1.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx2.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx3.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx4.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx5.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx6.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx7.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx8.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx9.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx10.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx11.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx12.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx13.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx14.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx15.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx16.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx17.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx18.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx19.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx20.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            tx20.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            



            String firstText = preferences.getString("TaskName0", "")+"\n"+preferences.getString("TaskDet0", "");
            String secText = preferences.getString("TaskName1", "")+"\n"+preferences.getString("TaskDet1", "");
            String thiText = preferences.getString("TaskName2", "")+"\n"+preferences.getString("TaskDet2", "");


            if (!firstText.equals("\n")){
                tx1.setText(firstText);
                tx1.setBackground(drawable);
            }
            if (!secText.equals("\n")){
                tx2.setText(secText);
                tx2.setBackground(drawable);
            }
            if (!thiText.equals("\n")){
                tx3.setText(thiText);
                tx3.setBackground(drawable);
            }
            
/**tx1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent resultIntent = new Intent();
        resultIntent.putExtra("editName0",);
        setResult(RESULT_OK, resultIntent);
        finish();    }
});**/


        }


       
private boolean doubleBackToExitPressedOnce = false;
        public void onBackPressed() {
            if (doubleBackToExitPressedOnce) {
                finishAffinity(); //Will close all activities and exit the app
                return;
            }

            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this, "Press again to exit the app", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(new Runnable() {
                public void run() {
                    doubleBackToExitPressedOnce = false;
                }
            }, 2000); //The delay time in  milliseconds.

        }



        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            if (requestCode == REQUEST_CODE_ADD_TODO && resultCode == RESULT_OK) {
                String desc = data.getStringExtra("descriptionName");
                String det = data.getStringExtra("descriptionDet");
                if (tx1.getText().toString().isEmpty()) {
                    tx1.setText(desc+"\n"+det);
                    editor.putString("TaskName0", desc);
                    editor.putString("TaskDet0", det);
                    editor.apply();
                    tx1.setBackground(getDrawable(R.drawable.background));
                } else if (tx2.getText().toString().isEmpty()) {
                    tx2.setText(desc+"\n"+det);
                    editor.putString("TaskName1", desc);
                    editor.putString("TaskDet1", det);
                    editor.apply();
                    tx2.setBackground(getDrawable(R.drawable.background));
                } else if (tx3.getText().toString().isEmpty()) {
                    tx3.setText(desc+"\n"+det);
                    editor.putString("TaskName2", desc);
                    editor.putString("TaskDet2", det);
                    editor.apply();
                    tx3.setBackground(getDrawable(R.drawable.background));
                } else if (tx4.getText().toString().isEmpty()) {
                    tx4.setText(desc+"\n"+det);
                    editor.putString("TaskName3", desc);
                    editor.putString("TaskDet3", det);
                    editor.apply();
                    tx4.setBackground(getDrawable(R.drawable.background));
                } else if (tx5.getText().toString().isEmpty()) {
                    tx5.setText(desc+"\n"+det);
                    editor.putString("TaskName4", desc);
                    editor.putString("TaskDet4", det);
                    editor.apply();
                    tx5.setBackground(getDrawable(R.drawable.background));
                } else if (tx6.getText().toString().isEmpty()) {
                    tx6.setText(desc+"\n"+det);
                    editor.putString("TaskName5", desc);
                    editor.putString("TaskDet5", det);
                    editor.apply();
                    tx6.setBackground(getDrawable(R.drawable.background));
                } else if (tx7.getText().toString().isEmpty()) {
                    tx7.setText(desc+"\n"+det);
                    editor.putString("TaskName7", desc);
                    editor.putString("TaskDet7", det);
                    editor.apply();
                    tx8.setBackground(getDrawable(R.drawable.background));
                } else if (tx8.getText().toString().isEmpty()) {
                    tx8.setText(desc+"\n"+det);
                    editor.putString("TaskName7", desc);
                    editor.putString("TaskDet7", det);
                    editor.apply();
                    tx8.setBackground(getDrawable(R.drawable.background));
                } else if (tx9.getText().toString().isEmpty()) {
                    tx9.setText(desc+"\n"+det);
                    editor.putString("TaskName8", desc);
                    editor.putString("TaskDet8", det);
                    editor.apply();
                    tx9.setBackground(getDrawable(R.drawable.background));
                } else if (tx10.getText().toString().isEmpty()) {
                    tx10.setText(desc+"\n"+det);
                    editor.putString("TaskName9", desc);
                    editor.putString("TaskDet9", det);
                    editor.apply();
                    tx10.setBackground(getDrawable(R.drawable.background));
                } else if (tx11.getText().toString().isEmpty()) {
                    tx11.setText(desc+"\n"+det);
                    editor.putString("TaskName10", desc);
                    editor.putString("TaskDet10", det);
                    editor.apply();
                    tx11.setBackground(getDrawable(R.drawable.background));
                } else if (tx12.getText().toString().isEmpty()) {
                    tx12.setText(desc+"\n"+det);
                    editor.putString("TaskName11", desc);
                    editor.putString("TaskDet11", det);
                    editor.apply();
                    tx12.setBackground(getDrawable(R.drawable.background));
                } else if (tx13.getText().toString().isEmpty()) {
                    tx13.setText(desc+"\n"+det);
                    editor.putString("TaskName12", desc);
                    editor.putString("TaskDet12", det);
                    editor.apply();
                    tx13.setBackground(getDrawable(R.drawable.background));
                } else if (tx14.getText().toString().isEmpty()) {
                    tx14.setText(desc+"\n"+det);
                    editor.putString("TaskName13", desc);
                    editor.putString("TaskDet13", det);
                    editor.apply();
                    tx14.setBackground(getDrawable(R.drawable.background));
                } else if (tx15.getText().toString().isEmpty()) {
                    tx15.setText(desc+"\n"+det);
                    editor.putString("TaskName14", desc);
                    editor.putString("TaskDet14", det);
                    editor.apply();
                    tx15.setBackground(getDrawable(R.drawable.background));
                } else if (tx16.getText().toString().isEmpty()) {
                    tx16.setText(desc+"\n"+det);
                    editor.putString("TaskName15", desc);
                    editor.putString("TaskDet15", det);
                    editor.apply();
                    tx16.setBackground(getDrawable(R.drawable.background));
                } else if (tx17.getText().toString().isEmpty()) {
                    tx17.setText(desc+"\n"+det);
                    editor.putString("TaskName16", desc);
                    editor.putString("TaskDet16", det);
                    editor.apply();
                    tx17.setBackground(getDrawable(R.drawable.background));
                } else if (tx18.getText().toString().isEmpty()) {
                    tx18.setText(desc+"\n"+det);
                    editor.putString("TaskName17", desc);
                    editor.putString("TaskDet17", det);
                    editor.apply();
                    tx18.setBackground(getDrawable(R.drawable.background));
                } else if (tx19.getText().toString().isEmpty()) {
                    tx19.setText(desc+"\n"+det);
                    editor.putString("TaskName18", desc);
                    editor.putString("TaskDet18", det);
                    editor.apply();
                    tx19.setBackground(getDrawable(R.drawable.background));
                } else if (tx20.getText().toString().isEmpty()) {
                    tx20.setText(desc+"\n"+det);
                    editor.putString("TaskName19", desc);
                    editor.putString("TaskDet19", det);
                    editor.apply();
                    tx20.setBackground(getDrawable(R.drawable.background));
                }
                else {
                    CharSequence text = "My Limit has been exceeded!!!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(this, text, duration);
                    toast.show();
                }
            }}
    public void openEditTask(){
        Intent intent=new Intent(this,EditTask.class);
        startActivityForResult(intent, REQUEST_CODE_ADD_TODO);    }

        
    }