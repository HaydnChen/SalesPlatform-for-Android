package com.ebaotech.salesplatform.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.TextView;

import com.ebaotech.salesplatform.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * A placeholder fragment containing a simple view.
 */
@EFragment(R.layout.fragment_section)
public class SectionsFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    @ViewById(R.id.section_label)
    TextView textView;

    public SectionsFragment() {
    }


    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static SectionsFragment newInstance(int sectionNumber) {
        SectionsFragment fragment = new SectionsFragment_();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @AfterViews
    void initSectionLabel() {
        // TODO: 2/29/16 1:17 AM
        // Default demo solution, should be removed after the implementation
        textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
    }

}
