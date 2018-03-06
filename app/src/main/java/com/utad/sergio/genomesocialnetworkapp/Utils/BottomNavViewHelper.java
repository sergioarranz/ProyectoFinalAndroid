package com.utad.sergio.genomesocialnetworkapp.Utils;

import android.util.Log;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by sergio on 6/3/18.
 */

public class BottomNavViewHelper {
    private static final String TAG = "BottomNavViewHelper";

    // Definimos las propiedades aquí por organización, para no tener que hacerlo una y otra vez en cada activity
    public static void setupBottomNavView(BottomNavigationViewEx bottomNavigationViewEx) {
        Log.d(TAG, "setupBottomNavView: Seteando barra navegación inferior");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }
}
