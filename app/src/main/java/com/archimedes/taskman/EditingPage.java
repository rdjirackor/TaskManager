package com.archimedes.taskman;

import static com.archimedes.taskman.AddTask.tb1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EditingPage extends AppCompatActivity {
    private EditText editName, editDesc, editNotes;
    private SeekBar prioritySetter;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor1;
    int priority = 1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editing_page);
        preferences = getSharedPreferences("SavedStuff", Context.MODE_PRIVATE);
        editor1 = preferences.edit();
        editName = findViewById(R.id.editNa);
        editDesc = findViewById(R.id.editDe);
        editNotes = findViewById(R.id.editDe2);
        prioritySetter = findViewById(R.id.seekBar);
        Button saver = findViewById(R.id.saver);

        if (tb1){
            String Name = preferences.getString("editName0", "Nadda");
            String Desc = preferences.getString("editDesc0", "");
            String Note = preferences.getString("TaskNote0", "");
            String Prior= preferences.getString("Priority0","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set1(Name,Desc,Note);
            prioritySetter.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
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
        saver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = editName.getText().toString();
                String Desc = editDesc.getText().toString();
                String Note = editNotes.getText().toString();
                String Prior= String.valueOf(priority);
                save(Note,Name,Desc,Prior);
            }
        });
        }

    }
        protected Boolean set1(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            Toast.makeText(this, "It works", Toast.LENGTH_SHORT).show();
            return tb1=false;
        }
        protected void save(String n, String na, String de,String pr){
            editor1.putString("TaskNote0", n);
            editor1.putString("TaskName0", na);
            editor1.putString("TaskDet0", de);
            editor1.putString("editName0", na);
            editor1.putString("editDesc0", de);
            editor1.putString("Priority0", pr);
            finish();

        }

    }






