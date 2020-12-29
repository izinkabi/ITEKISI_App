package com.example.itekisi_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private SectionStatePagerAdapter _sectionStatePagerAdapter;
    private ViewPager _viewPager;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started.");

        _sectionStatePagerAdapter = new SectionStatePagerAdapter(getSupportFragmentManager());
        _viewPager = (ViewPager) findViewById(R.id.container);
//setting up the pager
        setupViewPager(_viewPager);

    }
    private void setupViewPager(ViewPager viewPager){
        SectionStatePagerAdapter adapter =  new SectionStatePagerAdapter(getSupportFragmentManager());
        adapter.AddFragrment(new LoginFragment(),"Login");
        adapter.AddFragrment(new RegisterFragment(),"Register");
       // adapter.AddFragrment(new SplashScreenFragment(),"Splash Screen");
        viewPager.setAdapter(adapter);

    }
    public void setViewPager(int fragmentNumber){
        _viewPager.setCurrentItem(fragmentNumber);
    }
}
