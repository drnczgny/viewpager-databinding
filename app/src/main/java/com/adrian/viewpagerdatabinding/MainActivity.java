package com.adrian.viewpagerdatabinding;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.adrian.viewpagerdatabinding.common.viewpager.adapter.ViewPagerWithDifferentLayoutsAdapter;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Tabs with different layouts");
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new ViewPagerWithDifferentLayoutsAdapter(this, TestData.getRVDataModelForDifferentLayoutsList(this), TestData.getTitleList()));

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
