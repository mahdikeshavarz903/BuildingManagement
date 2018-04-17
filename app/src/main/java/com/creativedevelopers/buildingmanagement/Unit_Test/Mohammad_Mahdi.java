package com.creativedevelopers.buildingmanagement.Unit_Test;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.Toolbar;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.creativedevelopers.buildingmanagement.Activity.MainActivity;
import com.creativedevelopers.buildingmanagement.Broadcasts.Reminder_Notification;
import com.creativedevelopers.buildingmanagement.Broadcasts.Reminder_Notification_Creator;
import com.creativedevelopers.buildingmanagement.R;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;


/**
 * Created by Mahdi on 3/18/18.
 */

public class Mohammad_Mahdi extends AppCompatActivity implements View.OnClickListener,TimePickerDialog.OnTimeSetListener{
    ListView mlistview;
    int hour;
    int minutes;
    Context context;
    TextView mtext;
    TextView v;
    EditText ee;
    View loginview;
    TimePicker timePicker;
    TimePickerDialog timePickerDialog;
    TextView reminder_details;
    EditText eee;
    CustomAdapter ca;
    Toolbar toolbar;
    Button button2;
    public static Context appcontext;
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<Integer> imagess = new ArrayList<Integer>();
    ArrayList<String> Reminder_detail = new ArrayList<String>();
    int[] images = {R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
//            R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
//            R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,
//            R.drawable.ic_launcher_background,R.drawable.ic_launcher_background
        };
//    String[] names = {"Mohammad","Mohammad","Mohammad"
//    ,"Mohammad","Mohammad","Mohammad"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain);
        loginview = Mohammad_Mahdi.this.getLayoutInflater().inflate(R.layout.login_dialog,null);

        context = getApplicationContext();
//        timePicker = loginview.findViewById(R.id.timePicker2);
        v = findViewById(R.id.get_reminder_titlee);
        appcontext = getApplicationContext();
//        PersianCalendar persianCalendar = new PersianCalendar();
//        DatePickerDialog datePickerDialog = DatePickerDialog().newInstance(
//                Mohammad_Mahdi.this,
//                persianCalendar.getPersianYear(),
//                persianCalendar.getPersianMonth(),
//                persianCalendar.getPersianDay()
//        );
//        datePickerDialog.show(, "Datepickerdialog");
        names.add("Mohammad");

        names.add("Mahdi");
        Reminder_detail.add("Mohammad");
        Reminder_detail.add("Morteza");
        ee = findViewById(R.id.editText4);
        reminder_details = findViewById(R.id.Reminder_detail);
        eee = findViewById(R.id.editText5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        toolbar.setTitleTextColor();
        toolbar.setTitle("ListViewDemo");
//        toolbar.inflateMenu(R.menu.menus);
//        toolbar.setOnMenuItemClickListener(onClick(View v));
        toolbar.inflateMenu(R.menu.menus);
        setSupportActionBar(toolbar);
//        toolbar.setNavigationOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(Mohammad_Mahdi.this, "Toolbar", Toast.LENGTH_SHORT).show();
//                    }
//                }
//        );

        imagess.add(R.drawable.ic_launcher_background);
        imagess.add(R.drawable.ic_launcher_background);
//        addsButton = (Button)findViewById(R.id.addButton);
        mlistview = (ListView) findViewById(R.id.listView);
        mtext = (TextView) findViewById(R.id.textView);
        ca = new CustomAdapter();
        mlistview.setAdapter(ca);
        mlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                Toast.makeText(Mohammad_Mahdi.this, "Clicked", Toast.LENGTH_LONG)
                        .show();
                mtext = v.findViewById(R.id.textView);
                names.add("Morteza1");
                names.add("Morteza2");
                names.add("Morteza3");
                Reminder_detail.add("Mohammad");
                imagess.add(R.drawable.ic_launcher_background);
                ca.notifyDataSetChanged();
            }
        });
        mlistview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
                                           int pos, long id) {
                // TODO Auto-generated method stub

//                Toast.makeText(Mohammad_Mahdi.this, "You Clicked on App Name", Toast.LENGTH_LONG).show();
                TimePickerDialog timePickerDialog = new TimePickerDialog(Mohammad_Mahdi.this,R.style.TimePickerTheme,
                        new TimePickerDialog.OnTimeSetListener() {

                            @RequiresApi(api = Build.VERSION_CODES.M)
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay,int minute) {
                                hour = hourOfDay;
                                minutes = minute;
                                Toast.makeText(context, String.valueOf(minute),Toast.LENGTH_LONG).show();
                                startAlert();
                            }
                        }, 12, 13, false);
                timePickerDialog.show();
                return true;
            }
        });
    }
    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menus, menu);

        if(menu instanceof MenuBuilder){
            MenuBuilder m = (MenuBuilder) menu;
            m.setOptionalIconsVisible(true);
        }

        return true;
    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menus, menu);
//        return true;
//    }
public void createNotification(String title, String message)
{
    NotificationManager notificationManager =
            (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
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
        notification = new Notification.Builder(appcontext)
                .setContentTitle(title)
                .setContentText(message)
                .setSmallIcon(R.drawable.ic_building_black_24dp)
                .setChannelId(channelId)
                .build();
    }

    notificationManager.notify(notifyId, notification);
}
    int j = 0;
    @RequiresApi(api = Build.VERSION_CODES.M)
    public void startAlert() {

//        Reminder_Notification r = new Reminder_Notification(Mohammad_Mahdi.this);
        int i = Integer.parseInt("2");
        Intent intent = new Intent(this, new Reminder_Notification().getClass());
        PendingIntent pendingIntent = PendingIntent.getBroadcast(
                this.getApplicationContext(), j, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        j++;
          AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        Calendar timeOff9 = Calendar.getInstance();

        timeOff9.set(Calendar.HOUR_OF_DAY,hour);
        timeOff9.set(Calendar.MINUTE,minutes);
        timeOff9.set(Calendar.SECOND,00);
        alarmManager.set(AlarmManager.RTC_WAKEUP, timeOff9.getTimeInMillis(), pendingIntent);
        Toast.makeText(this, "Alarm set in " + i + " seconds",Toast.LENGTH_LONG).show();

//        createNotification("M","Q");
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        System.out.println("MMMMMMMMM");
        View v;
        switch (item.getItemId()) {
            case R.id.action_add:
// setRepeating() lets you specify a precise custom interval--in this case,
// 1 day

//                createNotification("Hey there!!","Just come and pay!!");
//                Intent intent = new Intent(getApplicationContext(), Mohammad_Mahdi.class);
//                PendingIntent contentIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
//
//                NotificationCompat.Builder b = new NotificationCompat.Builder(getApplicationContext());
//
//                b.setAutoCancel(true)
//                        .setDefaults(Notification.DEFAULT_ALL)
//                        .setWhen(System.currentTimeMillis())
//                        .setSmallIcon(R.drawable.add)
//                        .setTicker("Hearty365")
//                        .setContentTitle("Default notification")
//                        .setContentText("Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
//                        .setDefaults(Notification.DEFAULT_LIGHTS| Notification.DEFAULT_SOUND)
//                        .setContentIntent(contentIntent)
//                        .setContentInfo("Info");
//
//
//                NotificationManager notificationManager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
//                notificationManager.notify(1, b.build());
                //Get an instance of NotificationManager//

//                NotificationCompat.Builder mBuilder =
//                        new NotificationCompat.Builder(this)
//                                .setSmallIcon(R.drawable.add)
//                                .setContentTitle("My notification")
//                                .setContentText("Hello World!");
//
//
//                // Gets an instance of the NotificationManager service//
//
//                NotificationManager mNotificationManager =
//
//                        (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//
//                // When you issue multiple notifications about the same type of event,
//                // it’s best practice for your app to try to update an existing notification
//                // with this new information, rather than immediately creating a new notification.
//                // If you want to update this notification at a later date, you need to assign it an ID.
//                // You can then use this ID whenever you issue a subsequent notification.
//                // If the previous notification is still visible, the system will update this existing notification,
//                // rather than create a new one. In this example, the notification’s ID is 001//
//                        mNotificationManager.notify(001, mBuilder.build());
//                Intent notifyIntent = new Intent(this,Reminder_Notification.class);
//                PendingIntent pendingIntent = PendingIntent.getBroadcast
//                        (getApplicationContext(),1 , notifyIntent, PendingIntent.FLAG_UPDATE_CURRENT);
//                AlarmManager alarmManager = (AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
//                alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,  System.currentTimeMillis(),
//                        1000 * 60 * 60 * 24, pendingIntent);


                v = Mohammad_Mahdi.this.getLayoutInflater().inflate(R.layout.login_dialog,null);
                final AlertDialog.Builder alert = new AlertDialog.Builder(this);
                new AlertDialog.Builder(getApplicationContext(), R.style.AppTheme);



//                alert.setMessage("Enter Your Message");
//                alert.setTitle("Enter Your Title");
                alert.setPositiveButton("Add Reminder",
                        new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog,int which) {
                                View v;
//                                Toast.makeText(Mohammad_Mahdi.this, "You Clicked on App Name", Toast.LENGTH_LONG).show();
                                mlistview.setAdapter(ca);
//                                Toast.makeText(Mohammad_Mahdi.this, "Clicked", Toast.LENGTH_LONG)
//                                        .show();
                                v = Mohammad_Mahdi.this.getLayoutInflater().inflate(R.layout.login_dialog,null);
                                mtext = v.findViewById(R.id.editText4);
                                reminder_details = v.findViewById(R.id.editText5);

                                names.add(ee.getText().toString());
                                Reminder_detail.add(eee.getText().toString());
//                                names.add(eee.getText().toString());
                                imagess.add(R.drawable.ic_launcher_background);
                                ca.notifyDataSetChanged();
//                                dialog.cancel();
                            }
                        });
                alert.setView(v);
                alert.show();

//                button2 = v.findViewById(R.id.button2);
                ee = v.findViewById(R.id.editText4);
                eee = v.findViewById(R.id.editText5);
//                button2.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                        dialog.cancel();
//                    }
//                });
//                Toast.makeText(Mohammad_Mahdi.this, "Mohammad Mahdi", Toast.LENGTH_LONG)
//                        .show();
                return true;
            case R.id.action_settings:
                Toast.makeText(Mohammad_Mahdi.this, "Mohammad Mahdis", Toast.LENGTH_LONG)
                        .show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    @Override
    public void onClick(View v) {
        v = Mohammad_Mahdi.this.getLayoutInflater().inflate(R.layout.login_dialog,null);
        switch(v.getId()){
            case R.id.action_add:
                Toast.makeText(Mohammad_Mahdi.this, "You Clicked on App Name", Toast.LENGTH_LONG).show();
                ca = new CustomAdapter();
                mlistview.setAdapter(ca);
                Toast.makeText(Mohammad_Mahdi.this, "Clicked", Toast.LENGTH_LONG)
                        .show();
                mtext = v.findViewById(R.id.textView);
                names.add("Morteza1");
                names.add("Morteza2");
                names.add("Morteza3");
                imagess.add(R.drawable.ic_launcher_background);
                ca.notifyDataSetChanged();
                break;
//            case R.id.appIcon:
//                Toast.makeText(LauncherActivity.this, "You Clicked on App Icon", Toast.LENGTH_LONG).show();
//                break;
//            case R.id.btnClick:
//                Toast.makeText(LauncherActivity.this, "You Clicked on Button", Toast.LENGTH_LONG).show();
//                break;
        }

    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Toast.makeText(context, String.valueOf(minute), Toast.LENGTH_SHORT).show();
//        System.out.println(timePicker.getCurrentMinute());
//        String r = String.valueOf(timePicker.getMinute());
//        Log.d("A",r);
//        startAlert();
    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return imagess.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView mimageview = findViewById(R.id.imageView);
            TextView mtext = view.findViewById(R.id.textView);
            TextView Reminder_details = view.findViewById(R.id.Reminder_detail);
            mtext.setText(names.get(position));
            Reminder_details.setText(Reminder_detail.get(position));
            return view;
        }

    }
}

