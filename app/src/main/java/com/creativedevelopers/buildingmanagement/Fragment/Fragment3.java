package com.creativedevelopers.buildingmanagement.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.creativedevelopers.buildingmanagement.R;

/**
 * Created by Mohammad on 18/02/25.
 */

public class Fragment3 extends Fragment{
    private static final String TAG = "Fragment3";
    private Button btnnavfrag1;
    private Button btnnavfrag2;
    private Button btnnavfrag3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3, container, false);
        btnnavfrag3 = (Button) view.findViewById(R.id.btnnavfrag3);
        Log.d(TAG, "onCreateView: started.");
        btnnavfrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Going To Fragment 1", Toast.LENGTH_SHORT).show();
                ((MainActivity) getActivity()).setViewPager(0);
            }
        });
        return view;
    }
}
