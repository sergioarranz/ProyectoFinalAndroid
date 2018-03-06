package com.utad.sergio.genomesocialnetworkapp.Home;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.utad.sergio.genomesocialnetworkapp.R;
import com.utad.sergio.genomesocialnetworkapp.Utils.BottomNavViewHelper;

public class MainActivity extends AppCompatActivity {

    // Definimos Barra navegación inferior con libreria externa
    BottomNavigationViewEx bottomNavView;
    BottomNavViewHelper navViewHelper;
    Menu menu;
    MenuItem menuItem;

    private Context mContext = MainActivity.this;
    private static final int ACTIVITY_NUM = 0;
    // Definimos Tag para filtrar posteriormente con logs
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: starting.");

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
