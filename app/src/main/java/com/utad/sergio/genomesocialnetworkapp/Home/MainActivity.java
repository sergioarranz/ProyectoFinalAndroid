package com.utad.sergio.genomesocialnetworkapp.Home;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.utad.sergio.genomesocialnetworkapp.R;
import com.utad.sergio.genomesocialnetworkapp.Utils.BottomNavViewHelper;

public class MainActivity extends AppCompatActivity {

    BottomNavigationViewEx bottomNavView; // Lib custom Barra Nav Inferior
    BottomNavViewHelper navViewHelper; // Gestor Barra Nav Inferior con lib custom
    Menu menu;
    MenuItem menuItem;
    SectionsPagerAdapter adapter; // FragmentPagerAdapter
    ViewPager viewPager; // Contenedor central
    TabLayout tabLayout; // Barra Nav Superior

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
        setupViewPager();
    }

    /**
     * Responsable de añadir las tres pestañas: inicio, cámara y mensajes
     */
    private void setupViewPager(){
        // Instanciación de la clase que almacena los fragments contenidos en el ArrayList y los añadimos
        adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CameraFragment());
        adapter.addFragment(new MainFragment());
        adapter.addFragment(new MessagesFragment());

        // Vinculación del View Pager (layout_center_viewpager.xml) y set del adapter anterior para que muestre el contenido
        viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(adapter);

        // Vinculación de tabLayout al que le será añadido el viewPager anterior
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_genome_logo);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_arrow);
    }

    /**
     * Define la barra de navegación inferior que se reutiliza en cada activity
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
