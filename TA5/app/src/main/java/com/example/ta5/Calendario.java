package com.example.ta5;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.icu.util.Calendar;
import android.icu.util.GregorianCalendar;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;

import static android.provider.CalendarContract.*;

public class Calendario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    //vuelve a la pantalla principal
    public void volver(View view) {

        Intent i = new Intent(this, MainActivity.class);






        startActivity(i);
        Calendar beginTime = Calendar.getInstance();
        beginTime.set(2019, 7, 24, 7, 30);
        Calendar endTime = Calendar.getInstance();
        endTime.set(2019, 0, 24, 8, 30);
        Intent intent = new Intent(Intent.ACTION_INSERT)
                .setData(Events.CONTENT_URI)
                .putExtra(EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                .putExtra(EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                .putExtra(Events.TITLE, "Yoga")
                .putExtra(Events.DESCRIPTION, "Group class")
                .putExtra(Events.EVENT_LOCATION, "The gym")
                .putExtra(Events.AVAILABILITY, Events.AVAILABILITY_BUSY)
                .putExtra(Intent.EXTRA_EMAIL, "rowan@example.com,trevor@example.com");
        startActivity(intent);
        long startMillis=0;
        Uri.Builder builder = CalendarContract.CONTENT_URI.buildUpon();
        builder.appendPath("time");
        ContentUris.appendId(builder, startMillis);
        Intent intent2 = new Intent(Intent.ACTION_VIEW)
                .setData(builder.build());
        startActivity(intent2);
    }
}
