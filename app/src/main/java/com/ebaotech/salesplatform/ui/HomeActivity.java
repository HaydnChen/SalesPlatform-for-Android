package com.ebaotech.salesplatform.ui;

import android.content.Intent;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;

import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.mvp.view.HomeView;
import com.ebaotech.salesplatform.ui.prefer.SettingsActivity_;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_home)
@OptionsMenu(R.menu.menu_section)
public class HomeActivity extends AbstractActivity
        implements HomeView, NavigationView.OnNavigationItemSelectedListener {

    @ViewById(R.id.my_view_pager)
    ViewPager viewPager;
    @ViewById(R.id.my_toolbar)
    Toolbar toolbar;
    @ViewById(R.id.tabs)
    TabLayout tabLayout;
    @ViewById(R.id.home_fab)
    FloatingActionButton fab;


    @AfterViews
    void initHomePage() {
        //set up action bar ("eBao Sales Platform")
        setSupportActionBar(toolbar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //setup tab bar ("CustomerBo|FNA|QNI|...")
        setupTabBar();

        setupNav();

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Replace with your own action: position" + tabLayout.getSelectedTabPosition(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void setupNav() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.all_activity__drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    private void setupTabBar() {
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this);

        // Set up the ViewPager with the sections adapter.
        viewPager.setAdapter(sectionsPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
//
//        tabLayout.getTabAt(0).setIcon(R.drawable.ic_action_home);
//        tabLayout.getTabAt(1).setIcon(R.drawable.ic_action_user);
//        tabLayout.getTabAt(2).setIcon(R.drawable.ic_action_line_chart);
//        tabLayout.getTabAt(3).setIcon(R.drawable.ic_action_calculator);
//        tabLayout.getTabAt(4).setIcon(R.drawable.ic_action_folder_open);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                animateFab(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    int[] colorIntArray = {R.color.colorAccent,R.color.colorPrimaryDark,R.color.color_error,R.color.color_success,R.color.colorAccent};
    int[] iconIntArray = {R.drawable.ic_action_add,R.drawable.ic_action_add,R.drawable.ic_action_add,R.drawable.ic_action_add,R.drawable.ic_action_add};

    protected void animateFab(final int position) {
        fab.clearAnimation();
        // Scale down animation
        ScaleAnimation shrink =  new ScaleAnimation(1f, 0.2f, 1f, 0.2f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        shrink.setDuration(250);     // animation duration in milliseconds
        shrink.setInterpolator(new DecelerateInterpolator());
        shrink.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Change FAB color and icon

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    fab.setBackgroundTintList(getResources().getColorStateList(colorIntArray[position], getApplicationContext().getTheme()));
                    fab.setImageDrawable(getResources().getDrawable(iconIntArray[position], getApplicationContext().getTheme()));
                }else {
                    fab.setBackgroundTintList(getResources().getColorStateList(colorIntArray[position]));
                    fab.setImageDrawable(getResources().getDrawable(iconIntArray[position]));
                }

                // Scale up animation
                ScaleAnimation expand =  new ScaleAnimation(0.2f, 1f, 0.2f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                expand.setDuration(100);     // animation duration in milliseconds
                expand.setInterpolator(new AccelerateInterpolator());
                fab.startAnimation(expand);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        fab.startAnimation(shrink);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            //startActivity(new Intent(this, SettingsActivity_.class));
            SettingsActivity_.intent(this).start();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_manage) {
            startActivity(new Intent(this, SettingsActivity_.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.all_activity__drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
