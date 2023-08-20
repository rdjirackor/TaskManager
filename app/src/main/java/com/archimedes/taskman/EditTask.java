package com.archimedes.taskman;
/**
 In this code, I am basically receiving the selected priority from the user from the seekbar,
 and then I want to store that priority, but then Anytime I store the priority and then on another instance the user does the same thing
 I don't want the previous priority to be overwritten and so I initialized, a variable which I called count, which will
 basically be added to the priority, to distinguish it from the previous. I will optimize this as soon I get better at android development, hey.. chill!

 */

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

public class EditTask extends AppCompatActivity {
    int priority = 1;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    int count;
    private EditText editName, editDesc, editNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_task);

        // Initialize SharedPreferences
        preferences = getSharedPreferences("SavedStuff", Context.MODE_PRIVATE);
        editor = preferences.edit();
        count = preferences.getInt("Count", 0);

        SeekBar seekerSensitive = findViewById(R.id.seekBar);
        Button saveTask = findViewById(R.id.saveTask);
        editName = findViewById(R.id.editN);
        editDesc = findViewById(R.id.editD);
        editNote = findViewById(R.id.editD2);

        //Button test =findViewById(R.id.TestingPL);
        // P means Priority, I forgot the meaning of L, but hey I've deleted the Button anyway



        seekerSensitive.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                switch (progress) {
                    case 0:
                        priority = 0;
                        break;
                    case 2:
                        priority = 2;
                        break;
                    case 1:
                    default:
                        priority = 1;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Not needed for this example
            }
        });

        saveTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String TaskName= editName.getText().toString();
                String TaskDesc= editDesc.getText().toString();
                String TaskNotes= editNote.getText().toString();

                editor.putString("Priority" + String.valueOf(count), String.valueOf(priority));
                editor.putString("TaskNote" + String.valueOf(count), TaskNotes);
                count++;
                editor.putInt("Count",count);
                editor.apply();

                Intent resultIntent = new Intent();
                resultIntent.putExtra("descriptionName", "TaskName: "+TaskName);
                resultIntent.putExtra("descriptionDet","TaskDesc:"+TaskDesc);
                setResult(RESULT_OK, resultIntent);
                finish();




            }
        });

    }
}
