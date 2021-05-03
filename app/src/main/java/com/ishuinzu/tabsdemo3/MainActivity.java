package com.ishuinzu.tabsdemo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    private TabLayout tabLayout;
    private FrameLayout fragmentContainer;

    private Fragment currentFragment;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        fragmentContainer = findViewById(R.id.fragmentContainer);

        //On Application Start
        currentFragment = new FragmentOne();

        tabLayout.addOnTabSelectedListener(this);
        setUpWithFragments(currentFragment);
    }

    private void setUpWithFragments(Fragment currentFragment) {
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, currentFragment);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        switch (tab.getPosition()) {
            case 0:
                setUpWithFragments(new FragmentOne());
                break;

            case 1:
                setUpWithFragments(new FragmentTwo());
                break;

            case 2:
                setUpWithFragments(new FragmentThree());
                break;

            case 3:
                setUpWithFragments(new FragmentFour());
                break;

            case 4:
                setUpWithFragments(new FragmentFive());
                break;

            case 5:
                setUpWithFragments(new FragmentSix());
                break;

            case 6:
                setUpWithFragments(new FragmentSeven());
                break;

            case 7:
                setUpWithFragments(new FragmentEight());
                break;

            case 8:
                setUpWithFragments(new FragmentNine());
                break;
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}