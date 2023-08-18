package com.archimedes.taskman;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import androidx.appcompat.app.AppCompatActivity;
//TODO: Design the Pages

public class EditTask extends AppCompatActivity {
    int PRIORITY = 1;

    /**
     In this code, I am basically receiving the selected priority rom the user from the seekbar,
     and then I want to store that priority, but then Anytime I store the priority and tehn on another instance tyeh user does the same thing
     I dont want the prevoius priority to be overwritten and so I initialiazed, a variable which I cakled Are, which will
     basically be added to the priority, to distinguish it from the prevoius. I will optimize this oce I get better, hey..
     Here's a TODO: OPTIMIZE Are variable.
     To remind me to simplify it
     *
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_task);
        SharedPreferences preferences= getSharedPreferences("SavedStuff", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        int Count = 0;
        editor.putInt("count", Count);
        editor.apply();

        SeekBar seekerSensitive = findViewById(R.id.seekBar);
        Button saveTask = findViewById(R.id.saveTask);
        saveTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekerSensitive.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                    int Are=preferences.getInt("count",0);
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        switch (progress) {
                            case 0:
                                PRIORITY=0;
                                break;
                            case 2:
                                PRIORITY=2;
                                break;
                            case 1:
                            default:
                                PRIORITY=1;
                        }

                        editor.putString("Priority"+Are, String.valueOf(PRIORITY));
                        editor.apply();
                        Are++;
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                });

            }
        });

    }
}