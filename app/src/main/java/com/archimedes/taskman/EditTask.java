package com.archimedes.taskman;
/**
 In this code, I am basically receiving the selected priority rom the user from the seekbar,
 and then I want to store that priority, but then Anytime I store the priority and tehn on another instance tyeh user does the same thing
 I dont want the previous priority to be overwritten and so I initialiazed, a variable which I cakled Are, which will
 basically be added to the priority, to distinguish it from the prevoius. I will optimize this oce I get better, hey..
 *
 */

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EditTask extends AppCompatActivity {
    int priority = 1;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    int count;
    private EditText editName, editDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_task);

        // Initialize SharedPreferences
        preferences = getSharedPreferences("SavedStuff", Context.MODE_PRIVATE);
        editor = preferences.edit();
        count = preferences.getInt("count", 0);

        SeekBar seekerSensitive = findViewById(R.id.seekBar);
        Button saveTask = findViewById(R.id.saveTask);
        editName = findViewById(R.id.editN);
        editDesc = findViewById(R.id.editD);

        //Button test =findViewById(R.id.TPL);



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
                String TaskDesc=editDesc.getText().toString();
                Toast.makeText(EditTask.this, TaskName ,Toast.LENGTH_SHORT).show();

                editor.putString("Priority" + String.valueOf(count), String.valueOf(priority));
                Intent resultIntent = new Intent();
                resultIntent.putExtra("descriptionName", "TaskName: "+TaskName);
                resultIntent.putExtra("descriptionDet","TaskDesc:"+TaskDesc);
                setResult(RESULT_OK, resultIntent);
                finish();



               /**
                editor.putString("TaskDet" + String.valueOf(count), TaskName+"\n"+TaskDesc);
                count++;
                editor.putInt("count", count);
                editor.commit(); // Use commit instead of apply**/
            }
        });
       /** test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=preferences.getString("Priority0","None yet!");
                String b=preferences.getString("TaskName0","None yet!");
                String c=preferences.getString("TaskDesc0","None yet!");
                String a1=preferences.getString("Priority1","None yet!");
                String b1=preferences.getString("TaskName1","None yet!");
                String c1=preferences.getString("TaskDesc1","None yet!");
                String enigma = a+b+c;
                String enigma1 = a1+b1+c1;
                Toast.makeText(EditTask.this, enigma+"\n"+enigma1, Toast.LENGTH_SHORT).show();
            }
        });**/
    }
}
