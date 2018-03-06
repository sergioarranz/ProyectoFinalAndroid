package com.utad.sergio.genomesocialnetworkapp.Search;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.utad.sergio.genomesocialnetworkapp.R;
import com.utad.sergio.genomesocialnetworkapp.Utils.BottomNavViewHelper;

/**
 * Created by sergio on 6/3/18.
 */

public class SearchActivity extends AppCompatActivity{

    BottomNavigationViewEx bottomNavView;
    BottomNavViewHelper navViewHelper;
    Menu menu;
    MenuItem menuItem;

    private Context mContext = SearchActivity.this;
    private static final int ACTIVITY_NUM = 1;
    private static final String TAG = "SearchActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");
        setupBottomNavView();
    }

    /**
     * Método para definir la barra de navegación inferior que reutilizaremos en cada activity
     */
    private void setupBottomNavView(){
        Log.d(TAG, "setupBottomNavView: Seteando barra navegación inferior");
        bottomNavView = (BottomNavigationViewEx)findViewById(R.id.bottomNavViewBar);
        navViewHelper.setupBottomNavView(bottomNavView);
        navViewHelper.enableNavigation(mContext, bottomNavView);
        menu = bottomNavView.getMenu();
        menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }
}
