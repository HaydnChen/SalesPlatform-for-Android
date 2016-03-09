package com.ebaotech.salesplatform.ui;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.ui.customer.CustomerItemListFragment;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    protected AbstractActivity containerActivity;
    Resources res;
    private String titles[];
    private Fragment frags[];

    public SectionsPagerAdapter(AbstractActivity containerActivity) {
        super(containerActivity.getSupportFragmentManager());
        this.containerActivity = containerActivity;
        res = containerActivity.getApplicationContext().getResources();
        titles = res.getStringArray(R.array.section_labels);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Fragment fragment;

        if (position == 1) {
            fragment = CustomerItemListFragment.newInstance(containerActivity);
//            fragment = SectionsFragment.newInstance(position + 1);
        } else {
            fragment = SectionsFragment.newInstance(position + 1);
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

}
