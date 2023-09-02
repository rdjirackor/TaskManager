package com.archimedes.taskman;
/**
 In this code, I am basically receiving the selected priority from the user from the seekbar,
 and then I want to store that priority, but then Anytime I store the priority and then on another instance the user does the same thing
 I don't want the previous priority to be overwritten and so I initialized, a variable which I called count, which will
 basically be added to the priority, to distinguish it from the previous. I will optimize this as soon I get better at android development, hey.. chill!

 */

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;

public class EditTask extends AppCompatActivity {
    int priority = 1;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    int count;
    private EditText editName, editDesc, editNote;
    private static final int REQUEST_CODE_ADD_TODO = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_task);
        Drawable drawable1 = getResources().getDrawable(R.drawable.button_modes);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.TIRAMISU){
            if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS)!=
                    PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.POST_NOTIFICATIONS},101);
            }
        }


        // Initialize SharedPreferences
        preferences = getSharedPreferences("SavedStuff", Context.MODE_PRIVATE);
        editor = preferences.edit();
        count = preferences.getInt("Count", 0);

        SeekBar seekerSensitive = findViewById(R.id.seekBar);
        ImageButton saveTask = findViewById(R.id.saveTask);
        editName = findViewById(R.id.editN);
        editDesc = findViewById(R.id.editD);
        editNote = findViewById(R.id.editD2);
        saveTask.setBackground(drawable1);
        //Button test =findViewById(R.id.TestingPL);
        // P means Priority, I forgot the meaning of L, but hey I've deleted the Button anyway, needed it for a quick test



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
                saveThem();
            }
        });

    }


   /** @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            String name = data.getStringExtra("descriptionName");
            String descr = data.getStringExtra("descriptionDet");
            String detNotes = data.getStringExtra("descriptionNotes");
            editName.setText(name);
            editDesc.setText(descr);
            editNote.setText(detNotes);

        }}*/
   protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       super.onActivityResult(requestCode, resultCode, data);
       if (requestCode==REQUEST_CODE_ADD_TODO && resultCode == RESULT_OK) {
           String name = data.getStringExtra("descriptionName");
           String descr = data.getStringExtra("descriptionDet");
           String detNotes = data.getStringExtra("descriptionNotes");

           // Verify if data is received correctly
           Toast.makeText(EditTask.this, "This is the name: "+name, Toast.LENGTH_SHORT).show();

           editName.setText(name);
           editDesc.setText(descr);
           editNote.setText(detNotes);
           String TaskName= editName.getText().toString();
           String TaskDesc= editDesc.getText().toString();
           String TaskNotes= editNote.getText().toString();

           editor.putString("Priority0", String.valueOf(priority));
           editor.putString("TaskNote0", TaskNotes);
           editor.putString("TaskDet0", TaskDesc);

           Intent resultIntent = new Intent();
           resultIntent.putExtra("descriptionName", "TaskName: "+TaskName);
           resultIntent.putExtra("descriptionDet","TaskDesc:"+TaskDesc);
           setResult(RESULT_OK, resultIntent);
           finish();

       }
   }
    public  void saveThem(){
        String TaskName= editName.getText().toString();
        String TaskDesc= editDesc.getText().toString();
        String TaskNotes= editNote.getText().toString();

        editor.putString("Priority" + String.valueOf(count), String.valueOf(priority));
        editor.putString("TaskNote" + String.valueOf(count), TaskNotes);
        editor.putString("editName" + String.valueOf(count), TaskName);
        editor.putString("editDesc" + String.valueOf(count), TaskDesc);

        count++;
        editor.putInt("Count",count);
        editor.apply();

        Intent resultIntent = new Intent();
        resultIntent.putExtra("descriptionName", "TaskName: "+TaskName);
        resultIntent.putExtra("descriptionDet","TaskDesc:"+TaskDesc);
        setResult(RESULT_OK, resultIntent);
        launchNotification("Task Created: "+ TaskName,"Task Details :"+TaskDesc);
        finish();
    }
    public void launchNotification(String TaskName, String TaskDet){
        String CHANNEL_ID ="ImpendingTask";


        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(getApplicationContext(),CHANNEL_ID);
                builder.setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle(TaskName)
                .setContentText(TaskDet)
                .setAutoCancel(true)
                .setPriority(NotificationCompat.PRIORITY_MAX);

        Intent intent = new Intent(getApplicationContext(),AddTask.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(),0,intent,PendingIntent.FLAG_MUTABLE);
        builder.setContentIntent(pendingIntent);
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel =
                    notificationManager.getNotificationChannel(CHANNEL_ID);
            if (notificationChannel==null){
                int importance = NotificationManager.IMPORTANCE_HIGH;
                notificationChannel=new NotificationChannel(CHANNEL_ID,"Created Task",importance);
                notificationChannel.setLightColor(Color.GREEN);
                notificationChannel.enableVibration(true);
                notificationChannel.enableLights(true);
               // notificationChannel.setImportance(2);
                notificationManager.createNotificationChannel(notificationChannel);
            }

        }
        notificationManager.notify(0,builder.build());
    }
}
