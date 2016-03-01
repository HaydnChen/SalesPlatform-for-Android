package com.ebaotech.salesplatform.ui;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ebaotech.salesplatform.R;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    Resources res;
    private String titles[];
    private Fragment frags[];

    public SectionsPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        res = context.getResources();
        titles = res.getStringArray(R.array.section_labels);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Fragment fragment;

        fragment = SectionsFragment.newInstance(position + 1);
//
//        switch (position) {
//            case 1:
//                //fragment = CustomerItemListFragment.newInstance(3);
//                fragment = SectionsFragment.newInstance(position + 1);
//                break;
//            default :
//                fragment = SectionsFragment.newInstance(position + 1);
//                break;
//        }

        return fragment;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 5;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                //return R.string.section_customer_label;
                return res.getString(R.string.section_home_label);
            case 1:
                return res.getString(R.string.section_customer_label);
            case 2:
                return res.getString(R.string.section_fna_label);
            case 3:
                return res.getString(R.string.section_quotation_label);
            case 4:
                return res.getString(R.string.section_policy_label);
        }
        return null;
    }
}
