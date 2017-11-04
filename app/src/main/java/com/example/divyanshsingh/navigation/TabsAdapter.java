package com.example.divyanshsingh.navigation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



/**
 * Created by Divyansh Singh on 04-11-2017.
 */

public class TabsAdapter extends FragmentPagerAdapter {

    public static String[] tabNames = {"First Fragment","Second Fragment","Third Fragment"};

    public TabsAdapter(FragmentManager fragmentManager) {

        super(fragmentManager);
    }

    public static String[] getTabNames() {
        return tabNames;
    }

    public static void setTabNames(String[] tabNames) {
        TabsAdapter.tabNames = tabNames;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return (new FirstFragment());
            case 1:
                return (new SecondFragment());
            case 3:
                return (new ThirdFragment());
        }
        return null;
    }

    @Override
    public int getCount() {

        return tabNames.length;
    }

}
