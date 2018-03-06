package com.utad.sergio.genomesocialnetworkapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.utad.sergio.genomesocialnetworkapp.Utils.BottomNavViewHelper;

public class MainActivity extends AppCompatActivity {

    // Definimos Barra navegación inferior con libreria externa
    BottomNavigationViewEx bottomNavView;
    BottomNavViewHelper navViewHelper;

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
    }
}
