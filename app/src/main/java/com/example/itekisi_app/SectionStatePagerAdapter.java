package com.example.itekisi_app;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class SectionStatePagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> _FragmentList = new ArrayList<>();
    private final List<String> _FragmenTitletList = new ArrayList<>();


    public SectionStatePagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public void AddFragrment (Fragment fragment, String title ){
        _FragmentList.add(fragment);
        _FragmenTitletList.add(title);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return _FragmentList.get(position);
    }

    @Override
    public int getCount() {
        return _FragmentList.size();
    }
}
