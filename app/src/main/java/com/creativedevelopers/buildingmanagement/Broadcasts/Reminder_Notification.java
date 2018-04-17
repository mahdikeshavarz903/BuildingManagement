package com.creativedevelopers.buildingmanagement.Broadcasts;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import com.creativedevelopers.buildingmanagement.R;

/**
 * Created by Mohammad Mahdi on 4/12/2018.
 */

public class Reminder_Notification extends BroadcastReceiver {
//    private Context context1;
//    public Reminder_Notification(Context context2) {
//        this.context1 = context2;
//    }
Context contextt;
    @Override
    public void onReceive(Context context, Intent intent) {
        // show toast
        this.contextt = context;
        Toast.makeText(context, "Alarm running", Toast.LENGTH_SHORT).show();
//        Mohammad_Mahdi m = new Mohammad_Mahdi();
//        m.createNotification("A","A");
        CreateNotificationforandroido("Hey there!!","Just come and pay!!");
    }
    public void CreateNotification(String title,String message)
    {
        NotificationCompat.Builder b = new NotificationCompat.Builder(contextt);
        b.setAutoCancel(true)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setWhen(System.currentTimeMillis())
                .setSmallIcon(R.drawable.ic_building_black_24dp)
                .setTicker("{your tiny message}")
                .setContentTitle(title)
                .setContentText(message)
                .setContentInfo("INFO");

        NotificationManager nm = (NotificationManager) this.contextt.getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(1, b.build());
    }
    public void CreateNotificationforandroido(String title,String message)
    {
        NotificationManager notificationManager =
                (NotificationManager) contextt.getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        String channelId = "some_channel_id";
        CharSequence channelName = "Some Channel";
        int importance = NotificationManager.IMPORTANCE_LOW;
        NotificationChannel notificationChannel = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            notificationChannel = new NotificationChannel(channelId, channelName, importance);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(Color.RED);
            notificationChannel.enableVibration(true);
            notificationChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
            notificationManager.createNotificationChannel(notificationChannel);
        }
        int notifyId = 1;
        Notification notification = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            notification = new Notification.Builder(contextt.getApplicationContext())
                    .setContentTitle(title)
                    .setContentText(message)
                    .setSmallIcon(R.drawable.ic_building_black_24dp)
                    .setChannelId(channelId)
                    .build();
        }

        notificationManager.notify(notifyId, notification);
    }
}
