package com.example.drawerapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home_item:
                        Toast.makeText(MainActivity.this, "Home Page", Toast.LENGTH_SHORT).show();

                        //close the drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.search_item:
                        Toast.makeText(MainActivity.this, "Search Page", Toast.LENGTH_SHORT).show();

                        //close the drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.user_item:
                        Toast.makeText(MainActivity.this, "User Page", Toast.LENGTH_SHORT).show();

                        //close the drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.profile_item:
                        Toast.makeText(MainActivity.this, "Profile Page", Toast.LENGTH_SHORT).show();

                        //close the drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.setting_item:
                        Toast.makeText(MainActivity.this, "Setting Page", Toast.LENGTH_SHORT).show();

                        //close the drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }
                return true;
            }
        });
    }
}