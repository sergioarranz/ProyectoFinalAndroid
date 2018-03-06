package com.utad.sergio.genomesocialnetworkapp.Profile;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.utad.sergio.genomesocialnetworkapp.R;
import com.utad.sergio.genomesocialnetworkapp.Utils.BottomNavViewHelper;

/**
 * Created by sergio on 6/3/18.
 */

public class ProfileActivity extends AppCompatActivity{

    BottomNavigationViewEx bottomNavView;
    BottomNavViewHelper navViewHelper;
    Menu menu;
    MenuItem menuItem;

    private Toolbar toolbar;
    private Context mContext = ProfileActivity.this;
    private static final int ACTIVITY_NUM = 4;
    private static final String TAG = "ProfileActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d(TAG, "onCreate: started.");
        //setupBottomNavView();
        setupToolbar();
    }

    private void setupToolbar(){
        toolbar = (Toolbar) findViewById(R.id.profileToolBar);
        setSupportActionBar(toolbar);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Log.d(TAG, "onMenuItemClick: item menu clicado: " + item);

                switch (item.getItemId()){
                    case R.id.profileMenu:
                    Log.d(TAG, "onMenuItemClick: Preferencias perfil");
                }
                return false;
            }
        });
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
    // Método necesario para que aparezca el menú de opciones de perfil
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_menu, menu);
        return true;
    }
}
