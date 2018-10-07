package com.example.android.washingtondcguide;


import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 *CategoryAdapter provides the layout for the list items in the Places ArrayList
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new CategoryAdapter object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the Fragment that should be displayed.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MuseumsFragment();
        } else if (position == 1) {
            return new MemorialsFragment();
        } else if (position == 2) {
            return new GovernmentFragment();
        } else {
            return new EateryFragment();
        }
    }

    /**
     *Returns the title of each tab to the corresponding Fragment
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mContext.getString(R.string.category_museums);
        } else if (position == 1) {
            return mContext.getString(R.string.category_memorials);
        }else if (position == 2) {
            return mContext.getString(R.string.category_govt);
        } else {
            return mContext.getString(R.string.category_eatery);
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

}