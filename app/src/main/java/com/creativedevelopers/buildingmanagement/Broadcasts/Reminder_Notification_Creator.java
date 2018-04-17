package com.creativedevelopers.buildingmanagement.Broadcasts;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationManagerCompat;

import com.creativedevelopers.buildingmanagement.Activity.MainActivity;
import com.creativedevelopers.buildingmanagement.R;
import com.creativedevelopers.buildingmanagement.Unit_Test.Mohammad_Mahdi;

import java.util.Calendar;

/**
 * Created by Mohammad Mahdi on 4/12/2018.
 */

public class Reminder_Notification_Creator extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

    }
}
