package com.creativedevelopers.buildingmanagement.Fragment;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.creativedevelopers.buildingmanagement.R;
import com.creativedevelopers.buildingmanagement.Unit_Test.Mohammad_Mahdi;

/**
 * Created by Mohammad on 18/02/25.
 */

public class Fragment1 extends Fragment{
    private static final String TAG = "Fragment1";
    private Button btnnavfrag1;
    private Button btnnavfrag2;
    private Button btnnavfrag3;
    private Button btnnavsecondactivity;
    LinearLayout ln;
    Animation slide;
    private ViewPager mViewPager;
    Button aboutusbutton2;

//    Fragment2 f = new Fragment2();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment1,container,false);
        btnnavfrag1=(Button) view.findViewById(R.id.btnnavfrag1);
        aboutusbutton2 = (Button)view.findViewById(R.id.aboutusbutton2);
        Log.d(TAG,"onCreateView: started.");
        btnnavfrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getActivity(),"Going To Fragment 1",Toast.LENGTH_SHORT).show();
                ((MainActivity)getActivity()).setViewPager(1);
//                new Handler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        slide = AnimationUtils.loadAnimation(view.getContext(),R.anim.slide);
//                        aboutusbutton2 = (Button)view.findViewById(R.id.aboutusbutton2);
//                        aboutusbutton2.setAnimation(slide);
//                    }
//                }, 5000);

            }
        });
        return  view;
    }
}
