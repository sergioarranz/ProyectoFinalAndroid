package com.utad.sergio.genomesocialnetworkapp.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.utad.sergio.genomesocialnetworkapp.LikesActivity;
import com.utad.sergio.genomesocialnetworkapp.MainActivity;
import com.utad.sergio.genomesocialnetworkapp.ProfileActivity;
import com.utad.sergio.genomesocialnetworkapp.R;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.utad.sergio.genomesocialnetworkapp.SearchActivity;
import com.utad.sergio.genomesocialnetworkapp.ShareActivity;

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
    // Gestiona la navegación entre Activitys y le pasamos context porque está contenido dentro de una carpeta
    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.ic_house:
                        Intent intent = new Intent(context, MainActivity.class); //ACTVITY_NUM = 0
                        context.startActivity(intent);
                        break;
                    case R.id.ic_search:
                        Intent intent2 = new Intent(context, SearchActivity.class); //ACTVITY_NUM = 1
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_circle:
                        Intent intent3 = new Intent(context, ShareActivity.class); //ACTVITY_NUM = 2
                        context.startActivity(intent3);
                        break;
                    case R.id.ic_alert:
                        Intent intent4 = new Intent(context, LikesActivity.class); //ACTVITY_NUM = 3
                        context.startActivity(intent4);
                        break;
                    case R.id.ic_android:
                        Intent intent5 = new Intent(context, ProfileActivity.class); //ACTVITY_NUM = 4
                        context.startActivity(intent5);
                        break;
                }
                return false;
            }
        });
    }
}
