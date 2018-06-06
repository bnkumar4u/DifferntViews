package com.bnk.differntviews;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class TabViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_view);

        ViewPager viewPager=(ViewPager)findViewById(R.id.view_pager);
        SimplePagerAdapter simplePagerAdapter=new SimplePagerAdapter(this,getSupportFragmentManager());

        viewPager.setAdapter(simplePagerAdapter);

        TabLayout tabLayout=(TabLayout)findViewById(R.id.tab_layout);

        tabLayout.setupWithViewPager(viewPager);
    }
}
