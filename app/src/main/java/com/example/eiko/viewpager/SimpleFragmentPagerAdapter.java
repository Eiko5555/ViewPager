package com.example.eiko.viewpager;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by eiko on 7/22/2016.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{


    public SimpleFragmentPagerAdapter(android.support.v4.app.FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        if(position ==0){
            return new MondatFragment();
        }else if (position ==1){
            return new TuesdayFragment();
        }else if (position ==2){
            return new WednesdayFragment();
        }else if (position ==3){
            return new ThursdayFragemnt();
        }else {
            return new FridayFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
