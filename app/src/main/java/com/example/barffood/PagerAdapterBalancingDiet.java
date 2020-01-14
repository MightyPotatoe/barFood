package com.example.barffood;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapterBalancingDiet extends FragmentStatePagerAdapter {

    private int numberOftabs;

    public PagerAdapterBalancingDiet(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOftabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentBalancingDietAge();
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return numberOftabs;
    }
}
