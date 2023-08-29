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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
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
    public static Boolean tb1=false;
    public static Boolean tb2=false;
    public static Boolean tb3=false;
    public static Boolean tb4=false;
    public static Boolean tb5=false;
    public static Boolean tb6=false;
    public static Boolean tb7=false;
    public static Boolean tb8=false;
    public static Boolean tb9=false;
    public static Boolean tb10=false;
    public static Boolean tb11=false;
    public static Boolean tb12=false;
    public static Boolean tb13=false;
    public static Boolean tb14=false;
    public static Boolean tb15=false;
    public static Boolean tb16=false;
    public static Boolean tb17=false;
    public static Boolean tb18=false;
    public static Boolean tb19=false;
    public static Boolean tb20=false;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.add_task);
            preferences = getSharedPreferences("SavedStuff", Context.MODE_PRIVATE);
            editor = preferences.edit();
            Drawable drawable = getResources().getDrawable(R.drawable.background);
            Drawable drawable1 = getResources().getDrawable(R.drawable.button_modes);
            Drawable drawable2 = getResources().getDrawable(R.drawable.button_modeees);
            FloatingActionButton open = findViewById(R.id.floatingActionButton);
            open.setBackground(drawable2);

            open.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openEditTask();
                }



            });
            ImageButton active =findViewById(R.id.Active);
            active.setBackground(drawable1);

            ImageButton done = findViewById(R.id.Done);
            done.setBackground(drawable2);

        done.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openDone();
                }
            });


            active.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(AddTask.this, "You are on the Active Section", Toast.LENGTH_SHORT).show();
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
                tx1.setVisibility(View.VISIBLE);

            }
            if (!secText.equals("\n")){
                tx2.setText(secText);
                tx2.setBackground(drawable);
                c2.setVisibility(View.VISIBLE);
                tx2.setVisibility(View.VISIBLE);

            }
            if (!thiText.equals("\n")){
                tx3.setText(thiText);
                c3.setVisibility(View.VISIBLE);
                tx3.setVisibility(View.VISIBLE);


                tx3.setBackground(drawable);
            }if (!foText.equals("\n")){
                tx4.setText(foText);
                c4.setVisibility(View.VISIBLE);
                tx4.setVisibility(View.VISIBLE);
                tx4.setBackground(drawable);
            }if (!fiText.equals("\n")){
                tx5.setText(fiText);
            c5.setVisibility(View.VISIBLE);
            tx5.setVisibility(View.VISIBLE);
            tx5.setBackground(drawable);
            }if (!siText.equals("\n")){
                tx6.setText(siText);
                tx6.setBackground(drawable);
            tx6.setVisibility(View.VISIBLE);

            c6.setVisibility(View.VISIBLE);

            }if (!sevText.equals("\n")){
                    tx7.setText(sevText);
            tx7.setVisibility(View.VISIBLE);
            tx7.setBackground(drawable);
                c7.setVisibility(View.VISIBLE);

            }if (!eiText.equals("\n")){
                    tx8.setText(eiText);
            tx8.setVisibility(View.VISIBLE);
            tx8.setBackground(drawable);
                c8.setVisibility(View.VISIBLE);

            }if (!niText.equals("\n")){
                    tx9.setText(niText);
            tx9.setVisibility(View.VISIBLE);
            tx9.setBackground(drawable);
                c9.setVisibility(View.VISIBLE);

            }if (!teText.equals("\n")){
            tx10.setVisibility(View.VISIBLE);
            tx10.setText(teText);
                    tx10.setBackground(drawable);
                c10.setVisibility(View.VISIBLE);

            }if (!eleText.equals("\n")){
                    tx11.setText(eleText);
            tx11.setVisibility(View.VISIBLE);
            tx11.setBackground(drawable);
                c11.setVisibility(View.VISIBLE);

            }if (!tweText.equals("\n")){
            tx12.setVisibility(View.VISIBLE);
            tx12.setText(tweText);
                    tx12.setBackground(drawable);
                c12.setVisibility(View.VISIBLE);

            }if (!thirText.equals("\n")){
            tx13.setVisibility(View.VISIBLE);
            tx13.setText(thirText);
                    tx13.setBackground(drawable);
                }if (!fortText.equals("\n")){
                    tx14.setText(fortText);
            tx14.setVisibility(View.VISIBLE);
            tx14.setBackground(drawable);
                c14.setVisibility(View.VISIBLE);

            }if (!fivtText.equals("\n")){
                    tx15.setText(fivtText);
                    tx15.setBackground(drawable);
            tx15.setVisibility(View.VISIBLE);
            c15.setVisibility(View.VISIBLE);

            }if (!sixtText.equals("\n")){
                    tx16.setText(sixtText);
                    tx16.setBackground(drawable);
            tx16.setVisibility(View.VISIBLE);
            c16.setVisibility(View.VISIBLE);

            }if (!seventText.equals("\n")){
            tx17.setVisibility(View.VISIBLE);
            tx17.setText(seventText);
                    tx17.setBackground(drawable);
                c17.setVisibility(View.VISIBLE);

            }if (!eighteText.equals("\n")){
                    tx18.setText(eighteText);
            tx18.setVisibility(View.VISIBLE);
            tx18.setBackground(drawable);
                c18.setVisibility(View.VISIBLE);

            }if (!ninetText.equals("\n")){
                    tx19.setText(ninetText);
            tx19.setVisibility(View.VISIBLE);
            tx19.setBackground(drawable);
                c19.setVisibility(View.VISIBLE);

            }if (!twentyText.equals("\n")){
                    tx20.setText(twentyText);
            tx20.setVisibility(View.VISIBLE);
            tx20.setBackground(drawable);
                c20.setVisibility(View.VISIBLE);
            }

        tx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb1=true;
            }
        });tx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb2=true;
            }
        });tx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb3=true;
            }
        });tx4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb4=true;
            }
        });tx5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb5=true;
            }
        });tx6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb6=true;
            }
        });tx7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb7=true;
            }
        });tx8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb8=true;
            }
        });tx9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb9=true;
            }
        });tx10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb10=true;
            }
        });tx11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb11=true;
            }
        });tx12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb12=true;
            }
        });tx13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb13=true;
            }
        });tx14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb14=true;
            }
        });tx15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb15=true;
            }
        });tx16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb16=true;
            }
        });tx17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb17=true;
            }
        });tx18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb18=true;
            }
        });tx19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb19=true;
            }
        });tx20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddTask.this, EditingPage.class);
                startActivity(intent);
                tb20=true;
            }
        });

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
            c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName0", "");
                        String FiD= preferences.getString("TaskDet0", "");
                        editor.putString("DoneTaskName0",FiN);
                        editor.putString("DoneTaskDet0",FiD);
                        editor.putString("TaskName0","");
                        editor.putString("TaskDet0","");
                        editor.apply();
                        tx1.setVisibility(View.GONE);
                        tx1.setText("");
                        c1.setVisibility(View.GONE);

                       // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName1", "");
                        String FiD= preferences.getString("TaskDet1", "");
                        editor.putString("DoneTaskName1",FiN);
                        editor.putString("DoneTaskDet1",FiD);
                        editor.putString("TaskName1","");
                        editor.putString("TaskDet1","");
                        editor.apply();
                        tx2.setVisibility(View.GONE);
                        c2.setVisibility(View.GONE);
                        tx2.setText("");

                       // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName2", "");
                        String FiD= preferences.getString("TaskDet2", "");
                        editor.putString("DoneTaskName2",FiN);
                        editor.putString("DoneTaskDet2",FiD);
                        editor.putString("TaskName2","");
                        editor.putString("TaskDet2","");
                        editor.apply();
                        tx3.setVisibility(View.GONE);
                        c3.setVisibility(View.GONE);
                        tx3.setText("");

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName3", "");
                        String FiD= preferences.getString("TaskDet3", "");
                        editor.putString("DoneTaskName3",FiN);
                        editor.putString("DoneTaskDet3",FiD);
                        editor.putString("TaskName3","");
                        editor.putString("TaskDet3","");
                        editor.apply();
                        tx4.setVisibility(View.GONE);
                        c4.setVisibility(View.GONE);
                        tx4.setText("");


                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName4", "");
                        String FiD= preferences.getString("TaskDet4", "");
                        editor.putString("DoneTaskName4",FiN);
                        editor.putString("DoneTaskDet4",FiD);
                        editor.putString("TaskName4","");
                        editor.putString("TaskDet4","");
                        editor.apply();
                        tx5.setVisibility(View.GONE);
                        c5.setVisibility(View.GONE);
                        tx5.setText("");

                        // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName5", "");
                        String FiD= preferences.getString("TaskDet5", "");
                        editor.putString("DoneTaskName5",FiN);
                        editor.putString("DoneTaskDet5",FiD);
                        editor.putString("TaskName5","");
                        editor.putString("TaskDet5","");
                        editor.apply();
                        tx6.setVisibility(View.GONE);
                        c6.setVisibility(View.GONE);
                        tx6.setText("");

                       // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName6", "");
                        String FiD= preferences.getString("TaskDet6", "");
                        editor.putString("DoneTaskName6",FiN);
                        editor.putString("DoneTaskDet6",FiD);
                        editor.putString("TaskName6","");
                        editor.putString("TaskDet6","");
                        editor.apply();
                        tx7.setVisibility(View.GONE);
                        tx7.setText("");
                        c7.setVisibility(View.GONE);

                       // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName7", "");
                        String FiD= preferences.getString("TaskDet7", "");
                        editor.putString("DoneTaskName7",FiN);
                        editor.putString("DoneTaskDet7",FiD);
                        editor.putString("TaskName7","");
                        editor.putString("TaskDet7","");
                        editor.apply();
                        tx8.setVisibility(View.GONE);
                        tx8.setText("");
                        c8.setVisibility(View.GONE);

                       // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName8", "");
                        String FiD= preferences.getString("TaskDet8", "");
                        editor.putString("DoneTaskName8",FiN);
                        editor.putString("DoneTaskDet8",FiD);
                        editor.putString("TaskName8","");
                        editor.putString("TaskDet8","");
                        editor.apply();
                        tx9.setVisibility(View.GONE);
                        c9.setVisibility(View.GONE);
                        tx9.setText("");

                       // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName9", "");
                        String FiD= preferences.getString("TaskDet9", "");
                        editor.putString("DoneTaskName9",FiN);
                        editor.putString("DoneTaskDet9",FiD);
                        editor.putString("TaskName9","");
                        editor.putString("TaskDet9","");
                        editor.apply();
                        tx10.setVisibility(View.GONE);
                        tx10.setText("");
                        c10.setVisibility(View.GONE);

                       // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName10", "");
                        String FiD= preferences.getString("TaskDet10", "");
                        editor.putString("DoneTaskName10",FiN);
                        editor.putString("DoneTaskDet10",FiD);
                        editor.putString("TaskName10","");
                        editor.putString("TaskDet10","");
                        editor.apply();
                        tx11.setVisibility(View.GONE);
                        tx11.setText("");
                        c11.setVisibility(View.GONE);

                       // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName11", "");
                        String FiD= preferences.getString("TaskDet11", "");
                        editor.putString("DoneTaskName11",FiN);
                        editor.putString("DoneTaskDet11",FiD);
                        editor.putString("TaskName11","");
                        editor.putString("TaskDet11","");
                        editor.apply();
                        tx12.setVisibility(View.GONE);
                        c12.setVisibility(View.GONE);
                        tx12.setText("");


                        // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName12", "");
                        String FiD= preferences.getString("TaskDet12", "");
                        editor.putString("DoneTaskName12",FiN);
                        editor.putString("DoneTaskDet12",FiD);
                        editor.putString("TaskName12","");
                        editor.putString("TaskDet12","");
                        editor.apply();
                        tx13.setVisibility(View.GONE);
                        c13.setVisibility(View.GONE);
                        tx13.setText("");


                        // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName13", "");
                        String FiD= preferences.getString("TaskDet13", "");
                        editor.putString("DoneTaskName13",FiN);
                        editor.putString("DoneTaskDet13",FiD);
                        editor.putString("TaskName13","");
                        editor.putString("TaskDet13","");
                        editor.apply();
                        tx14.setText("");
                        tx14.setVisibility(View.GONE);
                        c14.setVisibility(View.GONE);

                       // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName14", "");
                        String FiD= preferences.getString("TaskDet14", "");
                        editor.putString("DoneTaskName14",FiN);
                        editor.putString("DoneTaskDet14",FiD);
                        editor.putString("TaskName14","");
                        editor.putString("TaskDet14","");
                        editor.apply();
                        tx15.setVisibility(View.GONE);
                        c15.setVisibility(View.GONE);
                        tx15.setText("");

                       // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName15", "");
                        String FiD= preferences.getString("TaskDet15", "");
                        editor.putString("DoneTaskName15",FiN);
                        editor.putString("DoneTaskDet15",FiD);
                        editor.putString("TaskName15","");
                        editor.putString("TaskDet15","");
                        editor.apply();
                        tx16.setVisibility(View.GONE);
                        tx16.setText("");
                        c16.setVisibility(View.GONE);

                       // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName16", "");
                        String FiD= preferences.getString("TaskDet16", "");
                        editor.putString("DoneTaskName16",FiN);
                        editor.putString("DoneTaskDet16",FiD);
                        editor.putString("TaskName16","");
                        editor.putString("TaskDet16","");
                        editor.apply();
                        tx17.setVisibility(View.GONE);
                        c17.setVisibility(View.GONE);
                        tx17.setText("");

                       // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName17", "");
                        String FiD= preferences.getString("TaskDet17", "");
                        editor.putString("DoneTaskName17",FiN);
                        editor.putString("DoneTaskDet17",FiD);
                        editor.putString("TaskName17","");
                        editor.putString("TaskDet17","");
                        editor.apply();
                        tx18.setVisibility(View.GONE);
                        c18.setVisibility(View.GONE);
                        tx18.setText("");


                        // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName18", "");
                        String FiD= preferences.getString("TaskDet18", "");
                        editor.putString("DoneTaskName18",FiN);
                        editor.putString("DoneTaskDet18",FiD);
                        editor.putString("TaskName18","");
                        editor.putString("TaskDet18","");
                        editor.apply();
                        tx19.setText("");
                        tx19.setVisibility(View.GONE);
                        c19.setVisibility(View.GONE);

                       // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });c20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        String FiN= preferences.getString("TaskName19", "");
                        String FiD= preferences.getString("TaskDet19", "");
                        editor.putString("DoneTaskName19",FiN);
                        editor.putString("DoneTaskDet19",FiD);
                        editor.putString("TaskName19","");
                        editor.putString("TaskDet19","");
                        editor.apply();
                        tx20.setText("");
                        tx20.setVisibility(View.GONE);
                        c20.setVisibility(View.GONE);

                       // refresh();

                    } else {
                        Toast.makeText(AddTask.this, "Wait a min, how on earth did you even get here?", Toast.LENGTH_LONG).show();
                    }
                }
            });


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
                if ((tx1.getText().toString()).isEmpty()) {
                    tx1.setText(desc+"\n"+det);
                    editor.putString("TaskName0", desc);
                    editor.putString("TaskDet0", det);
                    c1.setChecked(false);
                    c1.setVisibility(View.VISIBLE);
                    tx1.setVisibility(View.VISIBLE);
                    editor.apply();
                    tx1.setBackground(getDrawable(R.drawable.background));
                } else if (tx2.getText().toString().isEmpty()) {
                    tx2.setText(desc+"\n"+det);
                    editor.putString("TaskName1", desc);
                    editor.putString("TaskDet1", det);
                    c2.setChecked(false);
                    c2.setVisibility(View.VISIBLE);
                    tx2.setVisibility(View.VISIBLE);
                    editor.apply();
                    tx2.setBackground(getDrawable(R.drawable.background));
                } else if (tx3.getText().toString().isEmpty()) {
                    tx3.setText(desc+"\n"+det);
                    tx3.setVisibility(View.VISIBLE);
                    editor.putString("TaskName2", desc);
                    editor.putString("TaskDet2", det);
                    c3.setChecked(false);

                    c3.setVisibility(View.VISIBLE);
                    editor.apply();
                    tx3.setBackground(getDrawable(R.drawable.background));
                } else if (tx4.getText().toString().isEmpty()) {
                    tx4.setText(desc+"\n"+det);
                    c4.setVisibility(View.VISIBLE);
                    editor.putString("TaskName3", desc);
                    tx4.setVisibility(View.VISIBLE);
                    editor.putString("TaskDet3", det);
                    editor.apply();
                    c4.setChecked(false);

                    tx4.setBackground(getDrawable(R.drawable.background));
                } else if (tx5.getText().toString().isEmpty()) {
                    tx5.setText(desc+"\n"+det);
                    c5.setVisibility(View.VISIBLE);
                    tx5.setVisibility(View.VISIBLE);
                    editor.putString("TaskName4", desc);
                    editor.putString("TaskDet4", det);
                    editor.apply();
                    tx5.setBackground(getDrawable(R.drawable.background));
                    c5.setChecked(false);

                } else if (tx6.getText().toString().isEmpty()) {
                    tx6.setText(desc+"\n"+det);
                    editor.putString("TaskName5", desc);
                    tx6.setVisibility(View.VISIBLE);
                    c6.setVisibility(View.VISIBLE);
                    editor.putString("TaskDet5", det);
                    editor.apply();
                    tx6.setBackground(getDrawable(R.drawable.background));
                    c6.setChecked(false);

                } else if (tx7.getText().toString().isEmpty()) {
                    tx7.setText(desc+"\n"+det);
                    c7.setVisibility(View.VISIBLE);
                    editor.putString("TaskName6", desc);
                    tx7.setVisibility(View.VISIBLE);
                    editor.putString("TaskDet6", det);
                    editor.apply();
                    tx7.setBackground(getDrawable(R.drawable.background));
                    c7.setChecked(false);

                } else if (tx8.getText().toString().isEmpty()) {
                    c8.setVisibility(View.VISIBLE);
                    tx8.setText(desc+"\n"+det);
                    tx8.setVisibility(View.VISIBLE);
                    editor.putString("TaskName7", desc);
                    editor.putString("TaskDet7", det);
                    editor.apply();
                    tx8.setBackground(getDrawable(R.drawable.background));
                    c8.setChecked(false);

                } else if (tx9.getText().toString().isEmpty()) {
                    tx9.setText(desc+"\n"+det);
                    c9.setVisibility(View.VISIBLE);
                    tx9.setVisibility(View.VISIBLE);
                    editor.putString("TaskName8", desc);
                    editor.putString("TaskDet8", det);
                    editor.apply();
                    tx9.setBackground(getDrawable(R.drawable.background));
                    c9.setChecked(false);

                } else if (tx10.getText().toString().isEmpty()) {
                    tx10.setText(desc+"\n"+det);
                    c10.setVisibility(View.VISIBLE);
                    editor.putString("TaskName9", desc);
                    tx10.setVisibility(View.VISIBLE);
                    editor.putString("TaskDet9", det);
                    editor.apply();
                    tx10.setBackground(getDrawable(R.drawable.background));
                    c10.setChecked(false);

                } else if (tx11.getText().toString().isEmpty()) {
                    tx11.setText(desc+"\n"+det);
                    c11.setVisibility(View.VISIBLE);
                    tx11.setVisibility(View.VISIBLE);
                    editor.putString("TaskName10", desc);
                    editor.putString("TaskDet10", det);
                    editor.apply();
                    tx11.setBackground(getDrawable(R.drawable.background));
                    c11.setChecked(false);

                } else if (tx12.getText().toString().isEmpty()) {
                    tx12.setText(desc+"\n"+det);
                    c12.setVisibility(View.VISIBLE);
                    tx12.setVisibility(View.VISIBLE);
                    editor.putString("TaskName11", desc);
                    editor.putString("TaskDet11", det);
                    editor.apply();
                    tx12.setBackground(getDrawable(R.drawable.background));
                    c12.setChecked(false);

                } else if (tx13.getText().toString().isEmpty()) {
                    tx13.setText(desc+"\n"+det);
                    tx13.setVisibility(View.VISIBLE);
                    c13.setVisibility(View.VISIBLE);
                    editor.putString("TaskName12", desc);
                    editor.putString("TaskDet12", det);
                    editor.apply();
                    c13.setChecked(false);
                    tx13.setBackground(getDrawable(R.drawable.background));
                } else if (tx14.getText().toString().isEmpty()) {
                    tx14.setText(desc+"\n"+det);
                    c14.setVisibility(View.VISIBLE);
                    editor.putString("TaskName13", desc);
                    tx14.setVisibility(View.VISIBLE);
                    c14.setChecked(false);
                    editor.putString("TaskDet13", det);
                    editor.apply();
                    tx14.setBackground(getDrawable(R.drawable.background));
                } else if (tx15.getText().toString().isEmpty()) {
                    tx15.setText(desc+"\n"+det);
                    c15.setChecked(false);
                    c15.setVisibility(View.VISIBLE);
                    editor.putString("TaskName14", desc);
                    tx15.setVisibility(View.VISIBLE);
                    editor.putString("TaskDet14", det);
                    editor.apply();
                    tx15.setBackground(getDrawable(R.drawable.background));
                } else if (tx16.getText().toString().isEmpty()) {
                    tx16.setText(desc+"\n"+det);
                    c16.setChecked(false);
                    c16.setVisibility(View.VISIBLE);
                    editor.putString("TaskName15", desc);
                    tx16.setVisibility(View.VISIBLE);
                    editor.putString("TaskDet15", det);
                    editor.apply();
                    tx16.setBackground(getDrawable(R.drawable.background));
                } else if (tx17.getText().toString().isEmpty()) {
                    c17.setChecked(false);
                    tx17.setText(desc+"\n"+det);
                    tx17.setVisibility(View.VISIBLE);
                    c17.setVisibility(View.VISIBLE);
                    editor.putString("TaskName16", desc);
                    editor.putString("TaskDet16", det);
                    editor.apply();
                    tx17.setBackground(getDrawable(R.drawable.background));
                } else if (tx18.getText().toString().isEmpty()) {
                    tx18.setText(desc+"\n"+det);
                    tx18.setVisibility(View.VISIBLE);
                    c18.setChecked(false);
                    c18.setVisibility(View.VISIBLE);
                    editor.putString("TaskName17", desc);
                    editor.putString("TaskDet17", det);
                    editor.apply();
                    tx18.setBackground(getDrawable(R.drawable.background));
                } else if (tx19.getText().toString().isEmpty()) {
                    c19.setChecked(false);
                    tx19.setText(desc+"\n"+det);
                    c19.setVisibility(View.VISIBLE);
                    tx19.setVisibility(View.VISIBLE);
                    editor.putString("TaskName18", desc);
                    editor.putString("TaskDet18", det);
                    editor.apply();
                    tx19.setBackground(getDrawable(R.drawable.background));
                } else if (tx20.getText().toString().isEmpty()) {
                    tx20.setText(desc+"\n"+det);
                    c20.setVisibility(View.VISIBLE);
                    tx20.setVisibility(View.VISIBLE);
                    c20.setChecked(false);
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
        startActivityForResult(intent, REQUEST_CODE_ADD_TODO);
        }
    public void openDone(){
        Intent intent=new Intent(this,Done.class);
        startActivity(intent);
        }


}

