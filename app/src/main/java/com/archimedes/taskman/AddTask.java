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
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class AddTask extends AppCompatActivity {
    private static final int REQUEST_CODE_ADD_TODO = 1;
    private TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10,tx11,tx12,tx13,tx14,tx15,tx16,tx17,tx18,tx19,tx20;
    private CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
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
            tx6.setTextSize(20);
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

            c1 = findViewById(R.id.cb1);
            c2 = findViewById(R.id.cb2);
            c3 = findViewById(R.id.cb3);
            c4 = findViewById(R.id.cb4);
            c5 = findViewById(R.id.cb5);
            c6 = findViewById(R.id.cb6);
            c7 = findViewById(R.id.cb7);
            c8 = findViewById(R.id.cb8);
            c9 = findViewById(R.id.cb9);
            c10 = findViewById(R.id.cb10);
            c11 = findViewById(R.id.cb11);
            c12 = findViewById(R.id.cb12);
            c13 = findViewById(R.id.cb13);
            c14 = findViewById(R.id.cb14);
            c15 = findViewById(R.id.cb15);
            c16 = findViewById(R.id.cb16);
            c17 = findViewById(R.id.cb17);
            c18 = findViewById(R.id.cb18);
            c19 = findViewById(R.id.cb19);
            c20 = findViewById(R.id.cb20);




            String firstText = preferences.getString("TaskName0", "")+"\n"+preferences.getString("TaskDet0", "");
            String secText = preferences.getString("TaskName1", "")+"\n"+preferences.getString("TaskDet1", "");
            String thiText = preferences.getString("TaskName2", "")+"\n"+preferences.getString("TaskDet2", "");
            String foText = preferences.getString("TaskName3", "")+"\n"+preferences.getString("TaskDet3", "");
            String fiText = preferences.getString("TaskName4", "")+"\n"+preferences.getString("TaskDet4", "");
            String siText = preferences.getString("TaskName5", "")+"\n"+preferences.getString("TaskDet5", "");
            String sevText = preferences.getString("TaskName6", "")+"\n"+preferences.getString("TaskDet6", "");
            String eiText = preferences.getString("TaskName7", "")+"\n"+preferences.getString("TaskDet7", "");
            String niText = preferences.getString("TaskName8", "")+"\n"+preferences.getString("TaskDet8", "");
            String teText = preferences.getString("TaskName9", "")+"\n"+preferences.getString("TaskDet9", "");
            String eleText = preferences.getString("TaskName10", "")+"\n"+preferences.getString("TaskDet10", "");
            String tweText = preferences.getString("TaskName11", "")+"\n"+preferences.getString("TaskDet11", "");
            String thirText = preferences.getString("TaskName12", "")+"\n"+preferences.getString("TaskDet12", "");
            String fortText = preferences.getString("TaskName13", "")+"\n"+preferences.getString("TaskDet13", "");
            String fivtText = preferences.getString("TaskName14", "")+"\n"+preferences.getString("TaskDet14", "");
            String sixtText = preferences.getString("TaskName15", "")+"\n"+preferences.getString("TaskDet15", "");
            String seventText = preferences.getString("TaskName16", "")+"\n"+preferences.getString("TaskDet16", "");
            String eighteText = preferences.getString("TaskName17", "")+"\n"+preferences.getString("TaskDet17", "");
            String ninetText = preferences.getString("TaskName18", "")+"\n"+preferences.getString("TaskDet18", "");
            String twentyText = preferences.getString("TaskName19", "")+"\n"+preferences.getString("TaskDet19", "");



            if (!firstText.equals("\n")){
                tx1.setText(firstText);
                tx1.setBackground(drawable);
                c1.setVisibility(View.VISIBLE);

            }
            if (!secText.equals("\n")){
                tx2.setText(secText);
                tx2.setBackground(drawable);
                c2.setVisibility(View.VISIBLE);

            }
            if (!thiText.equals("\n")){
                tx3.setText(thiText);
                c3.setVisibility(View.VISIBLE);

                tx3.setBackground(drawable);
            }if (!foText.equals("\n")){
                tx4.setText(foText);
                c4.setVisibility(View.VISIBLE);

            tx4.setBackground(drawable);
            }if (!fiText.equals("\n")){
                tx5.setText(fiText);
            c5.setVisibility(View.VISIBLE);

            tx5.setBackground(drawable);
            }if (!siText.equals("\n")){
                tx6.setText(siText);
                tx6.setBackground(drawable);
            c6.setVisibility(View.VISIBLE);

        }if (!sevText.equals("\n")){
                tx7.setText(sevText);
                tx7.setBackground(drawable);
            c7.setVisibility(View.VISIBLE);

        }if (!eiText.equals("\n")){
                tx8.setText(eiText);
                tx8.setBackground(drawable);
            c8.setVisibility(View.VISIBLE);

        }if (!niText.equals("\n")){
                tx9.setText(niText);
                tx9.setBackground(drawable);
            c9.setVisibility(View.VISIBLE);

        }if (!teText.equals("\n")){
                tx10.setText(teText);
                tx10.setBackground(drawable);
            c10.setVisibility(View.VISIBLE);

        }if (!eleText.equals("\n")){
                tx11.setText(eleText);
                tx11.setBackground(drawable);
            c11.setVisibility(View.VISIBLE);

        }if (!tweText.equals("\n")){
                tx12.setText(tweText);
                tx12.setBackground(drawable);
            c12.setVisibility(View.VISIBLE);

        }if (!thirText.equals("\n")){
                tx13.setText(thirText);
                tx13.setBackground(drawable);
            }if (!fortText.equals("\n")){
                tx14.setText(fortText);
                tx14.setBackground(drawable);
            c14.setVisibility(View.VISIBLE);

        }if (!fivtText.equals("\n")){
                tx15.setText(fivtText);
                tx15.setBackground(drawable);
            c15.setVisibility(View.VISIBLE);

        }if (!sixtText.equals("\n")){
                tx16.setText(sixtText);
                tx16.setBackground(drawable);
            c16.setVisibility(View.VISIBLE);

        }if (!seventText.equals("\n")){
                tx17.setText(seventText);
                tx17.setBackground(drawable);
            c17.setVisibility(View.VISIBLE);

        }if (!eighteText.equals("\n")){
                tx18.setText(eighteText);
                tx18.setBackground(drawable);
            c18.setVisibility(View.VISIBLE);

        }if (!ninetText.equals("\n")){
                tx19.setText(ninetText);
                tx19.setBackground(drawable);
            c19.setVisibility(View.VISIBLE);

        }if (!twentyText.equals("\n")){
                tx20.setText(twentyText);
                tx20.setBackground(drawable);
            c20.setVisibility(View.VISIBLE);
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
                    c1.setVisibility(View.VISIBLE);
                    editor.apply();
                    tx1.setBackground(getDrawable(R.drawable.background));
                } else if (tx2.getText().toString().isEmpty()) {
                    tx2.setText(desc+"\n"+det);
                    editor.putString("TaskName1", desc);
                    editor.putString("TaskDet1", det);
                    c2.setVisibility(View.VISIBLE);
                    editor.apply();
                    tx2.setBackground(getDrawable(R.drawable.background));
                } else if (tx3.getText().toString().isEmpty()) {
                    tx3.setText(desc+"\n"+det);
                    editor.putString("TaskName2", desc);
                    editor.putString("TaskDet2", det);
                    c3.setVisibility(View.VISIBLE);
                    editor.apply();
                    tx3.setBackground(getDrawable(R.drawable.background));
                } else if (tx4.getText().toString().isEmpty()) {
                    tx4.setText(desc+"\n"+det);
                    c4.setVisibility(View.VISIBLE);
                    editor.putString("TaskName3", desc);
                    editor.putString("TaskDet3", det);
                    editor.apply();
                    tx4.setBackground(getDrawable(R.drawable.background));
                } else if (tx5.getText().toString().isEmpty()) {
                    tx5.setText(desc+"\n"+det);
                    c5.setVisibility(View.VISIBLE);
                    editor.putString("TaskName4", desc);
                    editor.putString("TaskDet4", det);
                    editor.apply();
                    tx5.setBackground(getDrawable(R.drawable.background));
                } else if (tx6.getText().toString().isEmpty()) {
                    tx6.setText(desc+"\n"+det);
                    editor.putString("TaskName5", desc);
                    c6.setVisibility(View.VISIBLE);
                    editor.putString("TaskDet5", det);
                    editor.apply();
                    tx6.setBackground(getDrawable(R.drawable.background));
                } else if (tx7.getText().toString().isEmpty()) {
                    tx7.setText(desc+"\n"+det);
                    c7.setVisibility(View.VISIBLE);
                    editor.putString("TaskName6", desc);
                    editor.putString("TaskDet6", det);
                    editor.apply();
                    tx7.setBackground(getDrawable(R.drawable.background));
                } else if (tx8.getText().toString().isEmpty()) {
                    c8.setVisibility(View.VISIBLE);
                    tx8.setText(desc+"\n"+det);
                    editor.putString("TaskName7", desc);
                    editor.putString("TaskDet7", det);
                    editor.apply();
                    tx8.setBackground(getDrawable(R.drawable.background));
                } else if (tx9.getText().toString().isEmpty()) {
                    tx9.setText(desc+"\n"+det);
                    c9.setVisibility(View.VISIBLE);
                    editor.putString("TaskName8", desc);
                    editor.putString("TaskDet8", det);
                    editor.apply();
                    tx9.setBackground(getDrawable(R.drawable.background));
                } else if (tx10.getText().toString().isEmpty()) {
                    tx10.setText(desc+"\n"+det);
                    c10.setVisibility(View.VISIBLE);
                    editor.putString("TaskName9", desc);
                    editor.putString("TaskDet9", det);
                    editor.apply();
                    tx10.setBackground(getDrawable(R.drawable.background));
                } else if (tx11.getText().toString().isEmpty()) {
                    tx11.setText(desc+"\n"+det);
                    c11.setVisibility(View.VISIBLE);
                    editor.putString("TaskName10", desc);
                    editor.putString("TaskDet10", det);
                    editor.apply();
                    tx11.setBackground(getDrawable(R.drawable.background));
                } else if (tx12.getText().toString().isEmpty()) {
                    tx12.setText(desc+"\n"+det);
                    c12.setVisibility(View.VISIBLE);
                    editor.putString("TaskName11", desc);
                    editor.putString("TaskDet11", det);
                    editor.apply();
                    tx12.setBackground(getDrawable(R.drawable.background));
                } else if (tx13.getText().toString().isEmpty()) {
                    tx13.setText(desc+"\n"+det);
                    c13.setVisibility(View.VISIBLE);
                    editor.putString("TaskName12", desc);
                    editor.putString("TaskDet12", det);
                    editor.apply();
                    tx13.setBackground(getDrawable(R.drawable.background));
                } else if (tx14.getText().toString().isEmpty()) {
                    tx14.setText(desc+"\n"+det);
                    c14.setVisibility(View.VISIBLE);
                    editor.putString("TaskName13", desc);
                    editor.putString("TaskDet13", det);
                    editor.apply();
                    tx14.setBackground(getDrawable(R.drawable.background));
                } else if (tx15.getText().toString().isEmpty()) {
                    tx15.setText(desc+"\n"+det);
                    c15.setVisibility(View.VISIBLE);
                    editor.putString("TaskName14", desc);
                    editor.putString("TaskDet14", det);
                    editor.apply();
                    tx15.setBackground(getDrawable(R.drawable.background));
                } else if (tx16.getText().toString().isEmpty()) {
                    tx16.setText(desc+"\n"+det);
                    c16.setVisibility(View.VISIBLE);
                    editor.putString("TaskName15", desc);
                    editor.putString("TaskDet15", det);
                    editor.apply();
                    tx16.setBackground(getDrawable(R.drawable.background));
                } else if (tx17.getText().toString().isEmpty()) {
                    tx17.setText(desc+"\n"+det);
                    c17.setVisibility(View.VISIBLE);
                    editor.putString("TaskName16", desc);
                    editor.putString("TaskDet16", det);
                    editor.apply();
                    tx17.setBackground(getDrawable(R.drawable.background));
                } else if (tx18.getText().toString().isEmpty()) {
                    tx18.setText(desc+"\n"+det);
                    c18.setVisibility(View.VISIBLE);
                    editor.putString("TaskName17", desc);
                    editor.putString("TaskDet17", det);
                    editor.apply();
                    tx18.setBackground(getDrawable(R.drawable.background));
                } else if (tx19.getText().toString().isEmpty()) {
                    tx19.setText(desc+"\n"+det);
                    c19.setVisibility(View.VISIBLE);
                    editor.putString("TaskName18", desc);
                    editor.putString("TaskDet18", det);
                    editor.apply();
                    tx19.setBackground(getDrawable(R.drawable.background));
                } else if (tx20.getText().toString().isEmpty()) {
                    tx20.setText(desc+"\n"+det);
                    c20.setVisibility(View.VISIBLE);
                    editor.putString("TaskName19", desc);
                    editor.putString("TaskDet19", det);
                    editor.apply();
                    tx20.setBackground(getDrawable(R.drawable.background));
                }
                else {
                    CharSequence text = "My Limit has been exceeded!!!";
                    int duration = Toast.LENGTH_LONG;

                    Toast toast = Toast.makeText(this, text, duration);
                    toast.show();
                }
            }}
    public void openEditTask(){
        Intent intent=new Intent(this,EditTask.class);
        startActivityForResult(intent, REQUEST_CODE_ADD_TODO);    }

        
    }