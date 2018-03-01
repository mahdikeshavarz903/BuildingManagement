package com.creativedevelopers.buildingmanagement.Fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mohammad on 18/02/25.
 */

public class SectionStatePagerAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> mFrafmentList = new ArrayList<>();
    private final List<String> mFrafmentTitleList = new ArrayList<>();
    public SectionStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void AddFragment(Fragment fragment,String title)
    {
        mFrafmentList.add(fragment);
        mFrafmentTitleList.add(title);
    }
    @Override
    public Fragment getItem(int position) {
        return mFrafmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFrafmentList.size();
    }
}
