package com.creativedevelopers.buildingmanagement.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

import com.creativedevelopers.buildingmanagement.R;

public class UnitsDetail extends android.app.Fragment implements View.OnClickListener
{
    private View view;
    private Button gasBill_button;
    private Button electricityBill_button;
    private Button waterBill_button;
    private Button debtor_button;
    private Button extraExpenses_button;
    private Button edit_button;
    private android.support.v7.widget.Toolbar toolbar;
    private Animation animation;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        view=inflater.inflate(R.layout.units_detail,null);
        findView(view);

        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UnitManagement unitManagement=new UnitManagement();
                getActivity().getFragmentManager().beginTransaction().replace(R.id.mahdi_relativeLayout,unitManagement).commit();
            }
        });

        ((AppCompatActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        animation= AnimationUtils.loadAnimation(getActivity(),R.anim.units_detail);

        electricityBill_button.setOnClickListener(this);
        gasBill_button.setOnClickListener(this);
        waterBill_button.setOnClickListener(this);
        debtor_button.setOnClickListener(this);
        extraExpenses_button.setOnClickListener(this);
        edit_button.setOnClickListener(this);

        return view;
    }

    public void findView(View view)
    {
        electricityBill_button=view.findViewById(R.id.electricityBill_button);
        gasBill_button=view.findViewById(R.id.gasBill_button);
        waterBill_button=view.findViewById(R.id.waterBill_button);
        debtor_button=view.findViewById(R.id.debtor_button);
        extraExpenses_button=view.findViewById(R.id.extraExpenses_button);
        edit_button=view.findViewById(R.id.edit_button);

        toolbar=view.findViewById(R.id.unitsDetail_toolbar);
    }

    @Override
    public void onClick(View v)
    {
        Handler handler=new Handler();

        if(R.id.electricityBill_button==v.getId())
        {
            electricityBill_button.startAnimation(animation);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    UnitManagement unitManagement=new UnitManagement();
                    getActivity().getFragmentManager().beginTransaction().replace(R.id.mahdi_relativeLayout,unitManagement).commit();
                }
            },1500);
        }
        else if(R.id.gasBill_button==v.getId())
        {
            gasBill_button.startAnimation(animation);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    UnitManagement unitManagement=new UnitManagement();
                    getActivity().getFragmentManager().beginTransaction().replace(R.id.mahdi_relativeLayout,unitManagement).commit();
                }
            },1500);
        }
        else if(R.id.waterBill_button==v.getId())
        {
            waterBill_button.startAnimation(animation);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    UnitManagement unitManagement=new UnitManagement();
                    getActivity().getFragmentManager().beginTransaction().replace(R.id.mahdi_relativeLayout,unitManagement).commit();
                }
            },1500);
        }
        else if(R.id.debtor_button==v.getId())
        {
            debtor_button.startAnimation(animation);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    UnitManagement unitManagement=new UnitManagement();
                    getActivity().getFragmentManager().beginTransaction().replace(R.id.mahdi_relativeLayout,unitManagement).commit();
                }
            },1500);
        }
        else if(R.id.extraExpenses_button==v.getId())
        {
            extraExpenses_button.startAnimation(animation);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    UnitManagement unitManagement=new UnitManagement();
                    getActivity().getFragmentManager().beginTransaction().replace(R.id.mahdi_relativeLayout,unitManagement).commit();
                }
            },1500);
        }
        else if(R.id.edit_button==v.getId())
        {
            edit_button.startAnimation(animation);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    UnitManagement unitManagement=new UnitManagement();
                    getActivity().getFragmentManager().beginTransaction().replace(R.id.mahdi_relativeLayout,unitManagement).commit();
                }
            },1500);
        }
    }
}
