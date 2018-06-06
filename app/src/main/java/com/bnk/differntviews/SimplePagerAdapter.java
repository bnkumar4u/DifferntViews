package com.bnk.differntviews;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class SimplePagerAdapter extends FragmentPagerAdapter {

    private Context mContext;
    public SimplePagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext=context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position)
        {
            case 0:
                return "first tab";
            case 1:
                return "second tab";
        }
        return null;
    }
}
