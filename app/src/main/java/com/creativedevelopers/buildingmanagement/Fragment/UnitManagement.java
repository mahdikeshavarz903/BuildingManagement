package com.creativedevelopers.buildingmanagement.Fragment;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Toolbar;

import com.creativedevelopers.buildingmanagement.Adapter.UnitManagement_Adapter;
import com.creativedevelopers.buildingmanagement.R;

/**
 * Created by Mahdi on 3/18/18.
 */

public class UnitManagement extends android.app.Fragment
{
    private View view;
    private RecyclerView recyclerView;
    private Toolbar toolbar;

    public UnitManagement() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);

        view=inflater.inflate(R.layout.unit_management,null);
        recyclerView=view.findViewById(R.id.unitManagement_recyclerView);
        UnitManagement_Adapter adapter=new UnitManagement_Adapter(getActivity());
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1, LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter);

        android.support.v7.widget.Toolbar toolbar=view.findViewById(R.id.unitManagement_toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });


        ((AppCompatActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        return view;
    }

}
