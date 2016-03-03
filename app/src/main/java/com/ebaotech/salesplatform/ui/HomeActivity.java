package com.ebaotech.salesplatform.ui;

import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.app.CleanActivity;
import com.ebaotech.salesplatform.domain.Customer;
import com.ebaotech.salesplatform.mvp.view.HomeView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_home)
@OptionsMenu(R.menu.menu_section)
public class HomeActivity extends CleanActivity
        implements HomeView,
        CustomerItemListFragment.OnListFragmentInteractionListener,
        NavigationView.OnNavigationItemSelectedListener {

    @ViewById(R.id.my_view_pager)
    ViewPager viewPager;
    @ViewById(R.id.my_toolbar)
    Toolbar toolbar;
    @ViewById(R.id.tabs)
    TabLayout tabLayout;

    @AfterViews
    void initHomePage() {
        //set up action bar ("eBao Sales Platform")
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //setup tab bar ("Customer|FNA|QNI|...")
        setupTabBar();


        setupNav();
    }

    private void setupNav() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.all_activity__drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    private void setupTabBar() {
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), this.getApplicationContext());

        // Set up the ViewPager with the sections adapter.
        viewPager.setAdapter(sectionsPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
//
//        tabLayout.getTabAt(0).setIcon(R.drawable.ic_action_home);
//        tabLayout.getTabAt(1).setIcon(R.drawable.ic_action_user);
//        tabLayout.getTabAt(2).setIcon(R.drawable.ic_action_line_chart);
//        tabLayout.getTabAt(3).setIcon(R.drawable.ic_action_calculator);
//        tabLayout.getTabAt(4).setIcon(R.drawable.ic_action_folder_open);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void showLoading(String message) {
        progress.showLoading(this, message);
    }

    @Override
    public void hideLoading(boolean sucess) {
        progress.endLoading(sucess);
    }

    @Override
    public void showActionLabel(String message) {
        cleanErrorHandler.showSnackBar(message);
    }

    @Override
    public void hideActionLabel() {

    }

    @Override
    public void onListFragmentInteraction(Customer item) {
        // TODO: 3/3/16 1:01 AM
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_manage) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.all_activity__drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
