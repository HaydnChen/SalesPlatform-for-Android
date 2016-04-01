package com.ebaotech.salesplatform.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
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

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Toast;
import com.ebaotech.salesplatform.R;
import com.ebaotech.salesplatform.mvp.view.HomeView;
import com.ebaotech.salesplatform.ui.home.TabSectionContent;
import com.ebaotech.salesplatform.ui.prefer.SettingsActivity_;
import com.ebaotech.salesplatform.ui.quotation.QuotationEditActivity_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
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
    }

    @Click(R.id.home_fab)
    void onFabClick(View view) {
        int position = tabLayout.getSelectedTabPosition();
        switch (position) {
            case 1:  //customer
                Snackbar.make(view, "add customer: position " + tabLayout.getSelectedTabPosition(), Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
                break;
            case 3: // quotation
                startActivityForResult(new Intent(HomeActivity.this, QuotationEditActivity_.class), 0);
                break;
            default:
                Snackbar.make(view, "Replace with your own action: position " + tabLayout.getSelectedTabPosition(), Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
                break;
        }
        testRunProductEngine();
    }

    private void testRunProductEngine() {
        String html = readAsset(this.getAssets(), "ProductEnginePage.html");
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.addJavascriptInterface(new MyJavascriptInterface(this), "androidInterface");
        String runtime = "var inputJson = {\n"
            + "    \"policy\" : {\n"
            + "                \"proposal_date\" : \"19-03-2016\",\n"
            + "                \"proposal_start_date\" : \"01-03-2016\",\n"
            + "                \"pay_method\" : \"cash\",\n"
            + "                \"prem_freq\"  : \"1\",\n"
            + "                \"people\" : [\n"
            + "                    {   \"name\":\"Insured\",\n"
            + "                        \"dob\":\"12-03-1986\",\n"
            + "                        \"gender\":\"male\" ,\n"
            + "                        \"job_class\":1,\n"
            + "                        \"age\" : 29,\n"
            + "                        \"is_ph\" : true\n"
            + "                    },\n"
            + "                    {   \"name\":\"Policyholder\", \n"
            + "                        \"dob\":\"12-03-1982\",\n"
            + "                        \"gender\":\"male\" ,\n"
            + "                        \"age\" : 33,\n"
            + "                        \"is_ph\" : false\n"
            + "                    },\n"
            + "                    {   \"name\":\"Spouse\",\n"
            + "                        \"dob\":\"12-03-1985\",\n"
            + "                        \"gender\":\"female\" ,\n"
            + "                        \"age\" : 30,\n"
            + "                        \"is_ph\" : false\n"
            + "                    },\n"
            + "\n"
            + "                ],\n"
            + "                 \"products\": [\n"
            + "                    {   \"product_id\" : 6000,\n"
            + "                        \"internal_id\" : \"ZLIFE01\",\n"
            + "                        \"initial_sa\" : 150000000,\n"
            + "                        \"la\" : 0,\n"
            + "                    }]\n"
            + "               }\n"
            + "}\n";
        runtime += "var result = engine.calc( inputJson, ['ap'] );\n";
        runtime += "androidInterface.processReturnValue(result.policy.products[0].ap.toString());";
        html = html.replaceAll("\\$\\{runtimeScript\\}", runtime);
        webView.loadDataWithBaseURL(null, html, "text/html", "UTF-8",null);
    }

    private static class MyJavascriptInterface {
        private Context context;

        public MyJavascriptInterface(Context context) {
            this.context = context;
        }

        @JavascriptInterface
        public void processReturnValue(String value) {
            Toast.makeText(context, value, Toast.LENGTH_LONG).show();
        }
    }

    /**
     * Reads the text of an asset. Should not be run on the UI thread.
     *
     * @param mgr
     *            The {@link AssetManager} obtained via {@link Context#getAssets()}
     * @param path
     *            The path to the asset.
     * @return The plain text of the asset
     */
    public static String readAsset(AssetManager mgr, String path) {
        String contents = "";
        InputStream is = null;
        BufferedReader reader = null;
        try {
            is = mgr.open(path);
            reader = new BufferedReader(new InputStreamReader(is));
            contents = reader.readLine();
            String line = null;
            while ((line = reader.readLine()) != null) {
                contents += '\n' + line;
            }
        } catch (final Exception e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException ignored) {
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException ignored) {
                }
            }
        }
        return contents;
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


    /**
     * Fab animation
     */
    private void animateFab(final int position) {
        fab.clearAnimation();
        // Scale down animation
        ScaleAnimation shrink = new ScaleAnimation(1f, 0.2f, 1f, 0.2f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        shrink.setDuration(450);     // animation duration in milliseconds
        shrink.setInterpolator(new DecelerateInterpolator());
        shrink.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Change FAB color and icon

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    fab.setBackgroundTintList(getResources().getColorStateList(TabSectionContent.ITEM_MAP.get(position).fabColor, getApplicationContext().getTheme()));
                    fab.setImageDrawable(getResources().getDrawable(TabSectionContent.ITEM_MAP.get(position).fabIcon, getApplicationContext().getTheme()));
                } else {
                    fab.setBackgroundTintList(getResources().getColorStateList(TabSectionContent.ITEM_MAP.get(position).fabColor));
                    fab.setImageDrawable(getResources().getDrawable(TabSectionContent.ITEM_MAP.get(position).fabIcon));
                }

                // Scale up animation
                ScaleAnimation expand = new ScaleAnimation(0.2f, 1f, 0.2f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
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

}
