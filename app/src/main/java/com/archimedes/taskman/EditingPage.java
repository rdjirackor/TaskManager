package com.archimedes.taskman;

import static com.archimedes.taskman.AddTask.tb1;
import static com.archimedes.taskman.AddTask.tb2;
import static com.archimedes.taskman.AddTask.tb3;
import static com.archimedes.taskman.AddTask.tb4;
import static com.archimedes.taskman.AddTask.tb5;
import static com.archimedes.taskman.AddTask.tb6;
import static com.archimedes.taskman.AddTask.tb7;
import static com.archimedes.taskman.AddTask.tb8;
import static com.archimedes.taskman.AddTask.tb9;
import static com.archimedes.taskman.AddTask.tb10;
import static com.archimedes.taskman.AddTask.tb11;
import static com.archimedes.taskman.AddTask.tb12;
import static com.archimedes.taskman.AddTask.tb13;
import static com.archimedes.taskman.AddTask.tb14;
import static com.archimedes.taskman.AddTask.tb15;
import static com.archimedes.taskman.AddTask.tb16;
import static com.archimedes.taskman.AddTask.tb17;
import static com.archimedes.taskman.AddTask.tb18;
import static com.archimedes.taskman.AddTask.tb19;
import static com.archimedes.taskman.AddTask.tb20;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

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
        if (tb2){
            String Name = preferences.getString("editName1", "Nadda");
            String Desc = preferences.getString("editDesc1", "");
            String Note = preferences.getString("TaskNote1", "");
            String Prior= preferences.getString("Priority1","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set2(Name,Desc,Note);
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
                editor1.putString("TaskNote1", Note);
                editor1.putString("TaskName1", Name);
                editor1.putString("TaskDet1", Desc);
                editor1.putString("editName1", Name);
                editor1.putString("editDesc1", Desc);
                editor1.putString("Priority1", Prior);
                editor1.apply();
                openAddTask();
            }
        });
        }
        if (tb3){
            String Name = preferences.getString("editName2", "Nadda");
            String Desc = preferences.getString("editDesc2", "");
            String Note = preferences.getString("TaskNote2", "");
            String Prior= preferences.getString("Priority2","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set3(Name,Desc,Note);
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
                editor1.putString("TaskNote2", Note);
                editor1.putString("TaskName2", Name);
                editor1.putString("TaskDet2", Desc);
                editor1.putString("editName2", Name);
                editor1.putString("editDesc2", Desc);
                editor1.putString("Priority2", Prior);
                editor1.apply();
                openAddTask();

            }
        });
        }
        if (tb4){
            String Name = preferences.getString("editName3", "Nadda");
            String Desc = preferences.getString("editDesc3", "");
            String Note = preferences.getString("TaskNote3", "");
            String Prior= preferences.getString("Priority3","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set4(Name,Desc,Note);
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
                editor1.putString("TaskNote3", Note);
                editor1.putString("TaskName3", Name);
                editor1.putString("TaskDet3", Desc);
                editor1.putString("editName3", Name);
                editor1.putString("editDesc3", Desc);
                editor1.putString("Priority3", Prior);
                editor1.apply();
                openAddTask();

            }
        });
        }
        if (tb5){
            String Name = preferences.getString("editName4", "Nadda");
            String Desc = preferences.getString("editDesc4", "");
            String Note = preferences.getString("TaskNote4", "");
            String Prior= preferences.getString("Priority4","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set5(Name,Desc,Note);
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
                editor1.putString("TaskNote4", Note);
                editor1.putString("TaskName4", Name);
                editor1.putString("TaskDet4", Desc);
                editor1.putString("editName4", Name);
                editor1.putString("editDesc4", Desc);
                editor1.putString("Priority4", Prior);
                editor1.apply();
                openAddTask();

            }
        });
        }
        if (tb6){
            String Name = preferences.getString("editName5", "Nadda");
            String Desc = preferences.getString("editDesc5", "");
            String Note = preferences.getString("TaskNote5", "");
            String Prior= preferences.getString("Priority5","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set6(Name,Desc,Note);
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
                editor1.putString("TaskNote5", Note);
                editor1.putString("TaskName5", Name);
                editor1.putString("TaskDet5", Desc);
                editor1.putString("editName5", Name);
                editor1.putString("editDesc5", Desc);
                editor1.putString("Priority5", Prior);
                editor1.apply();
                openAddTask();

            }
        });
        }
        if (tb7){
            String Name = preferences.getString("editName6", "Nadda");
            String Desc = preferences.getString("editDesc6", "");
            String Note = preferences.getString("TaskNote6", "");
            String Prior= preferences.getString("Priority6","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set7(Name,Desc,Note);
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
                editor1.putString("TaskNote6", Note);
                editor1.putString("TaskName6", Name);
                editor1.putString("TaskDet6", Desc);
                editor1.putString("editName6", Name);
                editor1.putString("editDesc6", Desc);
                editor1.putString("Priority6", Prior);
                editor1.apply();
                openAddTask();

            }
        });
        }
        if (tb8){
            String Name = preferences.getString("editName7", "Nadda");
            String Desc = preferences.getString("editDesc7", "");
            String Note = preferences.getString("TaskNote7", "");
            String Prior= preferences.getString("Priority7","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set8(Name,Desc,Note);
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
                editor1.putString("TaskNote7", Note);
                editor1.putString("TaskName7", Name);
                editor1.putString("TaskDet7", Desc);
                editor1.putString("editName7", Name);
                editor1.putString("editDesc7", Desc);
                editor1.putString("Priority7", Prior);
                editor1.apply();
                openAddTask();

            }
        });
        }
        if (tb9){
            String Name = preferences.getString("editName8", "Nadda");
            String Desc = preferences.getString("editDesc8", "");
            String Note = preferences.getString("TaskNote8", "");
            String Prior= preferences.getString("Priority8","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set9(Name,Desc,Note);
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
                editor1.putString("TaskNote8", Note);
                editor1.putString("TaskName8", Name);
                editor1.putString("TaskDet8", Desc);
                editor1.putString("editName8", Name);
                editor1.putString("editDesc8", Desc);
                editor1.putString("Priority8", Prior);
                editor1.apply();
                openAddTask();

            }
        });
        }
        if (tb10){
            String Name = preferences.getString("editName9", "Nadda");
            String Desc = preferences.getString("editDesc9", "");
            String Note = preferences.getString("TaskNote9", "");
            String Prior= preferences.getString("Priority9","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set10(Name,Desc,Note);
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
                editor1.putString("TaskNote9", Note);
                editor1.putString("TaskName9", Name);
                editor1.putString("TaskDet9", Desc);
                editor1.putString("editName9", Name);
                editor1.putString("editDesc9", Desc);
                editor1.putString("Priority9", Prior);
                openAddTask();

            }
        });
        }
        if (tb11){
            String Name = preferences.getString("editName10", "Nadda");
            String Desc = preferences.getString("editDesc10", "");
            String Note = preferences.getString("TaskNote10", "");
            String Prior= preferences.getString("Priority10","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set11(Name,Desc,Note);
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
                    editor1.putString("TaskNote10", Note);
                    editor1.putString("TaskName10", Name);
                    editor1.putString("TaskDet10", Desc);
                    editor1.putString("editName10", Name);
                    editor1.putString("editDesc10", Desc);
                    editor1.putString("Priority10", Prior);
                    editor1.apply();
                    openAddTask();
                }
            });
        }
        if (tb12){
            String Name = preferences.getString("editName11", "Nadda");
            String Desc = preferences.getString("editDesc11", "");
            String Note = preferences.getString("TaskNote11", "");
            String Prior= preferences.getString("Priority11","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set12(Name,Desc,Note);
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
                editor1.putString("TaskNote11", Note);
                editor1.putString("TaskName11", Name);
                editor1.putString("TaskDet11", Desc);
                editor1.putString("editName11", Name);
                editor1.putString("editDesc11", Desc);
                editor1.putString("Priority11", Prior);
                editor1.apply();
                openAddTask();
            }
        });
        }
        if (tb13){
            String Name = preferences.getString("editName12", "Nadda");
            String Desc = preferences.getString("editDesc12", "");
            String Note = preferences.getString("TaskNote12", "");
            String Prior= preferences.getString("Priority12","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set13(Name,Desc,Note);
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
                editor1.putString("TaskNote12", Note);
                editor1.putString("TaskName12", Name);
                editor1.putString("TaskDet12", Desc);
                editor1.putString("editName12", Name);
                editor1.putString("editDesc12", Desc);
                editor1.putString("Priority12", Prior);
                editor1.apply();
                openAddTask();

            }
        });
        }
        if (tb14){
            String Name = preferences.getString("editName13", "Nadda");
            String Desc = preferences.getString("editDesc13", "");
            String Note = preferences.getString("TaskNote13", "");
            String Prior= preferences.getString("Priority13","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set14(Name,Desc,Note);
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
                editor1.putString("TaskNote13", Note);
                editor1.putString("TaskName13", Name);
                editor1.putString("TaskDet13", Desc);
                editor1.putString("editName13", Name);
                editor1.putString("editDesc13", Desc);
                editor1.putString("Priority13", Prior);
                editor1.apply();
                openAddTask();

            }
        });
        }
        if (tb15){
            String Name = preferences.getString("editName14", "Nadda");
            String Desc = preferences.getString("editDesc14", "");
            String Note = preferences.getString("TaskNote14", "");
            String Prior= preferences.getString("Priority14","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set15(Name,Desc,Note);
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
                editor1.putString("TaskNote14", Note);
                editor1.putString("TaskName14", Name);
                editor1.putString("TaskDet14", Desc);
                editor1.putString("editName14", Name);
                editor1.putString("editDesc14", Desc);
                editor1.putString("Priority14", Prior);
                editor1.apply();
                openAddTask();

            }
        });
        }
        if (tb16){
            String Name = preferences.getString("editName15", "Nadda");
            String Desc = preferences.getString("editDesc15", "");
            String Note = preferences.getString("TaskNote15", "");
            String Prior= preferences.getString("Priority15","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set16(Name,Desc,Note);
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
                editor1.putString("TaskNote15", Note);
                editor1.putString("TaskName15", Name);
                editor1.putString("TaskDet15", Desc);
                editor1.putString("editName15", Name);
                editor1.putString("editDesc15", Desc);
                editor1.putString("Priority15", Prior);
                editor1.apply();
                openAddTask();

            }
        });
        }
        if (tb17){
            String Name = preferences.getString("editName16", "Nadda");
            String Desc = preferences.getString("editDesc16", "");
            String Note = preferences.getString("TaskNote16", "");
            String Prior= preferences.getString("Priority16","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set17(Name,Desc,Note);
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
                editor1.putString("TaskNote16", Note);
                editor1.putString("TaskName16", Name);
                editor1.putString("TaskDet16", Desc);
                editor1.putString("editName16", Name);
                editor1.putString("editDesc16", Desc);
                editor1.putString("Priority16", Prior);
                editor1.apply();
                openAddTask();

            }
        });
        }
        if (tb18){
            String Name = preferences.getString("editName17", "Nadda");
            String Desc = preferences.getString("editDesc17", "");
            String Note = preferences.getString("TaskNote17", "");
            String Prior= preferences.getString("Priority17","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set18(Name,Desc,Note);
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
                editor1.putString("TaskNote17", Note);
                editor1.putString("TaskName17", Name);
                editor1.putString("TaskDet17", Desc);
                editor1.putString("editName17", Name);
                editor1.putString("editDesc17", Desc);
                editor1.putString("Priority17", Prior);
                editor1.apply();
                openAddTask();

            }
        });
        }
        if (tb19){
            String Name = preferences.getString("editName18", "Nadda");
            String Desc = preferences.getString("editDesc18", "");
            String Note = preferences.getString("TaskNote18", "");
            String Prior= preferences.getString("Priority18","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set19(Name,Desc,Note);
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
                editor1.putString("TaskNote18", Note);
                editor1.putString("TaskName18", Name);
                editor1.putString("TaskDet18", Desc);
                editor1.putString("editName18", Name);
                editor1.putString("editDesc18", Desc);
                editor1.putString("Priority18", Prior);
                editor1.apply();
                openAddTask();

            }
        });
        }
        if (tb20){
            String Name = preferences.getString("editName19", "Nadda");
            String Desc = preferences.getString("editDesc19", "");
            String Note = preferences.getString("TaskNote19", "");
            String Prior= preferences.getString("Priority19","1");
            prioritySetter.setProgress(Integer.parseInt(Prior));
            set20(Name,Desc,Note);
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
                editor1.putString("TaskNote19", Note);
                editor1.putString("TaskName19", Name);
                editor1.putString("TaskDet19", Desc);
                editor1.putString("editName19", Name);
                editor1.putString("editDesc19", Desc);
                editor1.putString("Priority19", Prior);
                editor1.apply();
                openAddTask();

            }
        });
        }


    }
        protected Boolean set1(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb1=false;
        }protected Boolean set2(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb2=false;
        }protected Boolean set3(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb3=false;
        }protected Boolean set4(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb4=false;
        }protected Boolean set5(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb5=false;
        }protected Boolean set6(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb6=false;
        }protected Boolean set7(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb7=false;
        }protected Boolean set8(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb8=false;
        }protected Boolean set9(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb9=false;
        }protected Boolean set10(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb10=false;
        }protected Boolean set11(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb11=false;
        }protected Boolean set12(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb12=false;
        }protected Boolean set13(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb13=false;
        }protected Boolean set14(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb14=false;
        }protected Boolean set15(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb15=false;
        }protected Boolean set16(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb16=false;
        }protected Boolean set17(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb17=false;
        }protected Boolean set18(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb18=false;
        }protected Boolean set19(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb19=false;
        }protected Boolean set20(String n,String d,String no){
            editName.setText(n);
            editDesc.setText(d);
            editNotes.setText(no);
            return tb20=false;
        }
        protected void save(String n, String na, String de,String pr){
            editor1.putString("TaskNote0", n);
            editor1.putString("TaskName0", na);
            editor1.putString("TaskDet0", de);
            editor1.putString("editName0", na);
            editor1.putString("editDesc0", de);
            editor1.putString("Priority0", pr);
            editor1.apply();
            openAddTask();

        }
        private void openAddTask(){
            Intent intent=new Intent(this,AddTask.class);
            startActivity(intent);
        }

    }






