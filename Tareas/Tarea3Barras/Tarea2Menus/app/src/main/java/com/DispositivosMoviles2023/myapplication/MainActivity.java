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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //binding = ActivityMainBinding.inflate(getLayoutInflater());

        //setContentView(binding.getRoot());

        //Hay que descomentar la vista que queramos ver y comentar las demas

        setContentView(R.layout.fragment_first); //CATALOGO

        //setContentView(R.layout.fragment_second); //BUSQUEDA

        //setContentView(R.layout.fragment_third); //LOGIN

        //setContentView(R.layout.fragment_four); //PORTADA

        //setSupportActionBar(binding.toolbar);

        //NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        //appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
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
        int id = item.getItemId();

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