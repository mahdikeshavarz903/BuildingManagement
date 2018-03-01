package com.creativedevelopers.buildingmanagement.Fragment;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.creativedevelopers.buildingmanagement.R;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
//    private SectionStatePagerAdapter mSectionStatePagerAdapter;
public static Animation slide;
LinearLayout ln;
TextView et;
static Context mcontext;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        slide = AnimationUtils.loadAnimation(this,R.anim.slide);
//        getWindow().getDecorView().setBackgroundColor(Color.CYAN);
        Log.d(TAG,"onCreate: started");
//        mSectionStatePagerAdapter = new SectionStatePagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager)findViewById(R.id.container);
//        ln = (LinearLayout)findViewById(R.id.linearLayoutfragment2);
        setupviewpager(mViewPager);
//        et = (TextView) findViewById(R.id.textview1);
//        et.setAnimation(slide);
        mViewPager.setAnimation(slide);
        mcontext = getApplicationContext();
    }
    public void setupviewpager(ViewPager viewPager)
    {
        SectionStatePagerAdapter adapter = new SectionStatePagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new Fragment1(),"Fragment1");
        adapter.AddFragment(new Fragment2(),"Fragment2");
        adapter.AddFragment(new Fragment3(),"Fragment3");
        viewPager.setAdapter(adapter);
    }

    public static Context getMcontext() {
        return mcontext;
    }

    public void setViewPager(int fragmentNumber)
    {
        mViewPager.setCurrentItem(fragmentNumber);
    }
}
