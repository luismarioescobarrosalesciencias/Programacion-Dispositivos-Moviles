package com.DispositivosMoviles2023.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * Nombre de los integrantes:
 *
 * Gonzalez Galarza Jorge Fernando
 * Escobar Rosales Luis Mario
 * Vazquez Maldonado Alejandro
 */
public class MainActivity extends AppCompatActivity {

    //private AppBarConfiguration appBarConfiguration;
    //private ActivityMainBinding binding;
    private String[] mMenuSections;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_first); //CATALOGO
        mMenuSections = getResources().getStringArray(com.DispositivosMoviles2023.myapplication.R.array. menu_items);
        mDrawerLayout = (DrawerLayout) findViewById(com.DispositivosMoviles2023.myapplication.R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(com.DispositivosMoviles2023.myapplication.R.id.left_drawer);
        mDrawerList.setAdapter( new ArrayAdapter<String>( this, com.DispositivosMoviles2023.myapplication.R.layout. left_drawer, mMenuSections));
        mDrawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                mDrawerLayout,         /* DrawerLayout object */
                com.DispositivosMoviles2023.myapplication.R.string.app_name,  /* "open drawer" description */
                com.DispositivosMoviles2023.myapplication.R.string.app_name  /* "close drawer" description */
        ){
            public void onDrawerClosed(View view) {
                Log.d("HomeActivity", "onDrawerClosed");
            }

            public void onDrawerOpened(View drawerView) {
                Log.d("HomeActivity", "onDrawerOpened");
            }
        };
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        // Set the drawer toggle as the DrawerListener
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        //getActionBar().setDisplayHomeAsUpEnabled(true);
        //getActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }
    private class DrawerItemClickListener implements
            ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView parent,
                                View view, int position, long id) {
            Log.d("HomeActivity",
                    (String) parent.getAdapter().getItem(position));
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        int id = item.getItemId();
        if (id == com.DispositivosMoviles2023.myapplication.R.id. action_settings) {
            Log. d("HomeActivity", "action_settings");
            return true;
        }
        switch (id) {
            case R.id.action_settings :
                Log.d("HomeActivity", "Acciones");
                return true;
            case R.id.action_search :
                Log.d("HomeActivity", "Busqueda");
                return true;
            case R.id.action_share :
                Log.d("HomeActivity", "Compartir");
                return true;
            case R.id.action_information :
                Log.d("HomeActivity", "Informacion");
                return true;
            case R.id.action_preferences:
                Log.d("HomeActivity", "Preferencias");
                return true;

        }

        ActionBar actionBar = getSupportActionBar();
        assert false;
        actionBar.setDisplayHomeAsUpEnabled( true);
        // Ocultar el ActionBar
        actionBar.hide();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        //return NavigationUI.navigateUp(navController, appBarConfiguration)
          //      || super.onSupportNavigateUp();
        return false;
    }
}