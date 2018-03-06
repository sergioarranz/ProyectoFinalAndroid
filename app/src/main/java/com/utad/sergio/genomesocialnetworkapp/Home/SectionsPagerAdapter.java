package com.utad.sergio.genomesocialnetworkapp.Home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergio on 6/3/18.
 */

/**
 * Clase para almacenar fragments para tabs/pestañas, extenderá de FragmentPagerAdapter puesto que sólo
 * contendrá tres fragments y por tanto si que interesa que se almacenen en memoria para rápido acceso.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private static final String TAG = "SectionsPagerAdapter";
    // ArrayList que contendrá los fragments
    private final List<Fragment> mFragmentList = new ArrayList<>();

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment){
        mFragmentList.add(fragment);
    }
}
