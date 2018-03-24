package com.creativedevelopers.buildingmanagement.Fragment;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import com.creativedevelopers.buildingmanagement.Adapter.UnitManagement_Adapter;
import com.creativedevelopers.buildingmanagement.R;

/**
 * Created by Mahdi on 3/18/18.
 */

public class UnitManagement extends android.app.Fragment
{
    private View view;
    private RecyclerView recyclerView;

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

        return view;
    }
}
