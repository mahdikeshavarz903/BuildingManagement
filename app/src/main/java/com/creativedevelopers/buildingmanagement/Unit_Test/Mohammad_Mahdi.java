package com.creativedevelopers.buildingmanagement.Unit_Test;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.creativedevelopers.buildingmanagement.R;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Mahdi on 3/18/18.
 */

public class Mohammad_Mahdi extends AppCompatActivity implements View.OnClickListener{
    ListView mlistview;
    Context context;
    TextView mtext;
    EditText ee;
    TextView reminder_details;
    EditText eee;
    Toolbar toolbar;
    Button button2;
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
        final CustomAdapter ca = new CustomAdapter();
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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        View v;
        switch (item.getItemId()) {
            case R.id.action_add:
                v = Mohammad_Mahdi.this.getLayoutInflater().inflate(R.layout.login_dialog,null);
                final AlertDialog.Builder alert = new AlertDialog.Builder(this);
                new AlertDialog.Builder(getApplicationContext(), R.style.AppTheme);
//                alert.setMessage("Enter Your Message");
//                alert.setTitle("Enter Your Title");
                alert.setPositiveButton("Add Reminder",
                        new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                View v;
                                Toast.makeText(Mohammad_Mahdi.this, "You Clicked on App Name", Toast.LENGTH_LONG).show();
                                final CustomAdapter ca = new CustomAdapter();
                                mlistview.setAdapter(ca);
                                Toast.makeText(Mohammad_Mahdi.this, "Clicked", Toast.LENGTH_LONG)
                                        .show();
                                v = Mohammad_Mahdi.this.getLayoutInflater().inflate(R.layout.login_dialog,null);
                                mtext = v.findViewById(R.id.editText4);
                                reminder_details = v.findViewById(R.id.editText5);

                                names.add(ee.getText().toString());
                                Reminder_detail.add(eee.getText().toString());
//                                names.add(eee.getText().toString());
                                imagess.add(R.drawable.ic_launcher_background);
                                ca.notifyDataSetChanged();
                                dialog.cancel();
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
                Toast.makeText(Mohammad_Mahdi.this, "Mohammad Mahdi", Toast.LENGTH_LONG)
                        .show();
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
                final CustomAdapter ca = new CustomAdapter();
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

